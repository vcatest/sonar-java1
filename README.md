# sonar-java

SonarQube Java Rules - Example Test Files

## Overview

This project contains **187 Java files** that demonstrate various SonarQube rules and code quality patterns. These files are intentionally written with code issues to serve as test cases for SonarQube static analysis.

## Project Structure

```
sonar-java-private/
├── pom.xml                    # Maven build configuration
├── src/
│   ├── main/java/             # Empty (no compilable files)
│   └── samples/java/          # 187 SonarQube rule example files
├── COMPILATION_ISSUES.md      # Detailed explanation of compilation issues
└── README.md                  # This file
```

## Key Features

- ✅ **187 Rule Examples**: Comprehensive coverage of SonarQube Java rules
- ✅ **Maven Project**: Standard Maven structure with `pom.xml`
- ✅ **Java 18 Compatible**: Configured for Java 18
- ✅ **SonarQube Ready**: Files ready for static analysis
- ⚠️  **Non-Compilable**: Files contain intentional issues (see COMPILATION_ISSUES.md)

## Prerequisites

- **Java**: 18 or higher
- **Maven**: 3.6+ 
- **SonarQube**: Any version with Java analyzer

## Build

The project uses Maven but **does not produce compiled output** because all files contain intentional issues:

```bash
mvn clean compile
# Result: BUILD SUCCESS (but no .class files generated)
```

## Usage with SonarQube

### Option 1: Using SonarQube Scanner

```bash
sonar-scanner \
  -Dsonar.projectKey=sonar-java-examples \
  -Dsonar.sources=src/samples/java \
  -Dsonar.host.url=http://localhost:9000 \
  -Dsonar.login=your-auth-token
```

### Option 2: Using Maven Plugin

Add to `pom.xml`:

```xml
<properties>
    <sonar.sources>src/samples/java</sonar.sources>
</properties>
```

Then run:

```bash
mvn clean verify sonar:sonar \
  -Dsonar.host.url=http://localhost:9000 \
  -Dsonar.login=your-auth-token
```

## Why Files Don't Compile

These files contain **intentional code issues** to demonstrate SonarQube rules:

1. **Duplicate Class Names**: Multiple files define classes with same name
2. **Syntax Errors**: Missing return statements, invalid declarations
3. **Public Class Mismatches**: Public class names don't match filenames
4. **Version Incompatibilities**: Features requiring different Java versions
5. **Missing Dependencies**: References to non-existent packages

**See [COMPILATION_ISSUES.md](COMPILATION_ISSUES.md) for complete details.**

## SonarQube Analysis

SonarQube can analyze these files because:

- ✅ It performs **static analysis** on source code
- ✅ It has its own **independent parser**
- ✅ It doesn't require **compiled `.class` files**
- ✅ It can analyze code with **syntax errors**

## File Categories

The 187 files cover rules in these categories:

- **Naming Conventions**: Variable, method, class naming
- **Code Smells**: Empty blocks, magic numbers, duplicates
- **Architecture**: Design patterns, coupling checks
- **Spring Framework**: Spring Boot, dependency injection
- **Serialization**: Custom serialization methods
- **Error Handling**: Exception handling patterns
- **Threading**: Synchronization, concurrency
- **Performance**: Collection usage, loops
- **Security**: Input validation, cryptography

## Maven Configuration

- **Java Version**: 18
- **Spring Boot**: 2.7.18  
- **Compiler Plugin**: 3.11.0
- **Encoding**: UTF-8

## Important Notes

1. **This is not a functional application** - it's a test suite for SonarQube rules
2. **Files are in `src/samples/java`** - not in `src/main/java` for compilation
3. **No .class files are generated** - analysis happens on source code
4. **All 187 files are preserved** - even those with compilation errors

## License

This is a sample/test project for SonarQube rule validation.

## Useful Commands

```bash
# Count total Java files
find src/samples/java -name "*.java" | wc -l

# List all example files
find src/samples/java -name "*.java" -type f

# Run SonarQube analysis
mvn sonar:sonar

# View project structure
tree src/samples/java
```

---

**For detailed information about why specific files don't compile, see [COMPILATION_ISSUES.md](COMPILATION_ISSUES.md)**
