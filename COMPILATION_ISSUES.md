# SonarQube Rule Files - Project Structure

## Summary

This project contains **187 SonarQube rule example files** that demonstrate various code quality issues and best practices. These files are intentionally written with code issues to serve as test cases for SonarQube static analysis.

## Directory Structure

```
sonar-java-private/
├── pom.xml                          # Maven configuration (Java 18)
├── src/
│   ├── main/java/                   # Empty - no compilable files
│   └── samples/java/                # All 187 rule example files
│       ├── AbsOnNegative.java
│       ├── AbstractClassWithoutAbstractMethodCheck.java
│       ├── Architecture.java
│       └── ... (184 more files in various subdirectories)
└── COMPILATION_ISSUES.md            # This file
```

## Why Files Cannot Be Compiled

These files contain **intentional issues** that prevent compilation with Java 18:

### 1. **Duplicate Class Names** (Most Common)
   - Multiple files define classes with the same name (e.g., class `A`, class `Foo`)
   - Example: `CatchRethrowingCheck.java`, `RepeatAnnotationCheck.java`, etc.
   - This violates Java's compilation rules when compiling all files together

### 2. **Public Classes Not Matching Filenames**
   - Files contain public classes whose names don't match the filename
   - Example: `AbstractClassWithoutAbstractMethodCheck.java` contains public class `Animal`
   - Java requires public class name to match the filename

### 3. **Syntax Errors** (Intentional)
   - Missing return statements, invalid method declarations, parsing errors
   - Example: `SpringConstructorInjectionCheck.java`, `ConstructorCallingOverridableCheck.java`

### 4. **Java Version Compatibility Issues**
   - Use of `_` as identifier (forbidden since Java 9)
   - Switch expressions requiring Java 14+
   - Records requiring Java 16+
   - Example: `KeywordAsIdentifierCheck.java`, `UseSwitchExpressionCheck.java`

### 5. **Missing Dependencies/Undefined Symbols**
   - References to non-existent packages or classes
   - Example: `com.myco.corporate`, `Unknown` class, missing imports

### 6. **Module System Issues**
   - Module visibility constraints
   - Example: Files trying to access packages not declared in module-info.java

## Total Statistics

| Category | Count |
|----------|-------|
| **Total Java files** | 187 |
| **Files in src/main/java** | 0 |
| **Files in src/samples/java** | 187 |
| **Compilable files** | 0 |
| **Generated .class files** | 0 |

## Maven Configuration

The project is configured with:
- **Java Version**: 18
- **Spring Boot**: 2.7.18
- **Compiler**: Maven Compiler Plugin 3.11.0
- **Build Tool**: Maven

Files with syntax errors are excluded from compilation in `pom.xml`.

## Usage with SonarQube

### Analyzing the Code

Even though these files don't compile, SonarQube can still analyze them:

1. **Keep all files in place** - SonarQube doesn't require compiled code
2. **Run SonarQube Scanner** on the entire project:
   ```bash
   sonar-scanner \
     -Dsonar.projectKey=sonar-java-private \
     -Dsonar.sources=src/samples/java \
     -Dsonar.host.url=http://localhost:9000 \
     -Dsonar.login=your-token
   ```

3. **SonarQube will**:
   - Parse all `.java` files regardless of compilation status
   - Apply rules and detect issues
   - Generate reports showing which rules are triggered

### Why This Approach Works

SonarQube performs **static analysis** on source code:
- It parses Java files directly (doesn't need `.class` files)
- Uses its own parser independent of the Java compiler
- Can analyze code with syntax errors or compilation issues
- Focuses on pattern matching and rule detection

## Files Not Supporting Java 18

The following files contain features or syntax not fully supported in Java 18:

1. **Underscore as Identifier**:
   - `KeywordAsIdentifierCheck.java`
   - `BadLocalVariableNameNoncompliant.java`

2. **Switch Expressions** (require Java 14+):
   - `UseSwitchExpressionCheck.java`

3. **Records** (require Java 16+):
   - `InnerStaticClassesCheckSample.java`

4. **Invalid Syntax**:
   - `ParsingError.java` - Intentionally incomplete
   - `DisallowedClassCheck.java` - Malformed syntax
   - `UnderscoreMisplacedOnNumberCheck.java` - Number too large

## Recommendation

**For SonarQube Analysis**:
1. Use all files from `src/samples/java` directory
2. Don't attempt to compile them
3. Run SonarQube scanner directly on source files
4. Review the generated reports to see which rules are triggered

**For Development**:
- This project serves as a comprehensive test suite for SonarQube Java rules
- Each file demonstrates a specific rule or code pattern
- Use as reference when configuring SonarQube quality profiles

## Note

This is a **test/sample project** for SonarQube rule validation. It is not meant to be a functioning Java application. The value is in static analysis, not in execution.
