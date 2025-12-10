#!/bin/bash

# Script to add package declarations to Java files
# This ensures each file compiles independently without class name conflicts

echo "Adding package declarations to Java files..."

find src/main/java -name "*.java" -type f | while read file; do
    # Get the directory path relative to src/main/java
    dir=$(dirname "$file" | sed 's|src/main/java/||' | sed 's|/|.|g')
    
    # Get the filename without extension
    filename=$(basename "$file" .java)
    
    # Create package name based on directory and filename
    if [ "$dir" = "." ] || [ "$dir" = "" ]; then
        # Root level - use filename as package
        package="${filename,,}"  # lowercase
    else
        # Use directory structure
        package="$dir"
    fi
    
    # Convert to valid package name (lowercase, replace invalid chars)
    package=$(echo "$package" | tr '[:upper:]' '[:lower:]' | sed 's/[^a-z0-9.]/_/g')
    
    # Check if file already has a package declaration
    if ! grep -q "^package " "$file" 2>/dev/null; then
        # Add package declaration at the beginning
        echo "Adding package to: $file -> package $package;"
        sed -i.bak "1s|^|package $package;\n\n|" "$file"
    else
        echo "Already has package: $file"
    fi
done

echo "Done!"
