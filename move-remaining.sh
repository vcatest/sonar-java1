#!/bin/bash

# Move all remaining non-compiling files to samples directory

echo "Moving remaining non-compiling files..."

while IFS= read -r file; do
    dir=$(dirname "$file")
    if [ "$dir" != "." ]; then
        mkdir -p "src/samples/java/$dir"
    fi
    
    if [ -f "src/main/java/$file" ]; then
        mv "src/main/java/$file" "src/samples/java/$file"
        echo "Moved: $file"
    fi
done < remaining-errors.txt

echo ""
echo "All files moved successfully!"
