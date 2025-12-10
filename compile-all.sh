#!/bin/bash

# Script to compile all Java files individually
# This ignores compilation errors for files with intentional issues

echo "Starting individual file compilation..."

# Create target directory
mkdir -p target/classes

# Get classpath
mvn dependency:build-classpath -q -DincludeScope=compile -Dmdep.outputFile=target/classpath.txt > /dev/null 2>&1
CP=$(cat target/classpath.txt 2>/dev/null || echo "")

# Counters
SUCCESS=0
FAILED=0
TOTAL=0

# Find and compile each Java file
while IFS= read -r file; do
    TOTAL=$((TOTAL + 1))
    if javac -cp "$CP" -d target/classes -source 17 -target 17 -encoding UTF-8 -Xlint:none -nowarn "$file" 2>/dev/null; then
        SUCCESS=$((SUCCESS + 1))
        echo "✓ Compiled: $file"
    else
        FAILED=$((FAILED + 1))
        echo "✗ Failed: $file"
    fi
done < <(find src/main/java -name "*.java" -type f)

echo ""
echo "=========================================="
echo "Compilation Summary:"
echo "  Total files: $TOTAL"
echo "  Successful: $SUCCESS"
echo "  Failed: $FAILED"
echo "=========================================="
echo ""

# Count compiled class files
CLASS_COUNT=$(find target/classes -name "*.class" 2>/dev/null | wc -l | tr -d ' ')
echo "Total .class files generated: $CLASS_COUNT"
echo ""

if [ "$CLASS_COUNT" -gt 0 ]; then
    echo "Sample compiled classes:"
    find target/classes -name "*.class" | head -10
    echo ""
    exit 0
else
    echo "ERROR: No class files were generated!"
    exit 1
fi
