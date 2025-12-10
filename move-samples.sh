#!/bin/bash

# Script to move non-compiling SonarQube sample files to src/samples/java
# These files contain intentional issues for testing SonarQube rules

echo "Moving non-compiling sample files to src/samples/java..."

# Create samples directory structure
mkdir -p src/samples/java

# Files to move (with compilation issues)
files_to_move=(
    "AbstractClassWithoutAbstractMethodCheck.java"
    "AnonymousClassesTooBigCheck.java"
    "ArchitectureOk.java"
    "ArchitectureSkipSingleFolderOK.java"
    "CatchExceptionCheck.java"
    "CatchRethrowingCheck.java"
    "ClassCouplingCheckCustom.java"
    "ClassWithOnlyStaticMethodsInstantiationCheck.java"
    "CloneOverrideCheck.java"
    "CompareObjectWithEqualsCheck.java"
    "DeprecatedTagPresenceCheck.java"
    "DisallowedClassCheckAnnotation.java"
    "DisallowedClassCheckRegex.java"
    "EnumEqualCheck.java"
    "EqualsOverriddenWithHashCodeCheck.java"
    "FilesExistsJDK8Check_java7.java"
    "GettersSettersOnRightField.java"
    "IfElseIfStatementEndsWithElseCheck.java"
    "LambdaOptionalParenthesisCheck_no_version.java"
    "LambdaOptionalParenthesisCheck.java"
    "LambdaSingleExpressionCheck_no_version.java"
    "LambdaSingleExpressionCheck.java"
    "LoopExecutingAtMostOnceCheck.java"
    "MethodComplexityJavaLangPackage.java"
    "MissingBeanValidationCheck.java"
    "MultilineBlocksCurlyBracesCheck.java"
    "NoSonar.java"
    "OctalValuesCheck.java"
    "OneClassInterfacePerFileCheckNoncompliant.java"
    "ProtectedMemberInFinalClassCheck.java"
    "RedundantStreamCollectCheck.java"
    "RepeatAnnotationCheck_no_version.java"
    "RepeatAnnotationCheck.java"
    "RightCurlyBraceStartLineCheck.java"
    "SelectorMethodArgumentCheck.java"
    "StaticFieldInitializationCheck.java"
    "StaticMembersAccessCheck.java"
    "SystemExitCalledCheck.java"
    "ThisExposedFromConstructorCheck.java"
    "UselessParenthesesCheck.java"
)

# Move files from src/main/java to src/samples/java
for file in "${files_to_move[@]}"; do
    if [ -f "src/main/java/$file" ]; then
        mv "src/main/java/$file" "src/samples/java/"
        echo "Moved: $file"
    fi
done

# Move subdirectory files
if [ -d "src/main/java/naming" ]; then
    mkdir -p src/samples/java/naming
    if [ -f "src/main/java/naming/BadGenericNameNoncompliant.java" ]; then
        mv "src/main/java/naming/BadGenericNameNoncompliant.java" "src/samples/java/naming/"
        echo "Moved: naming/BadGenericNameNoncompliant.java"
    fi
fi

if [ -d "src/main/java/serialization" ]; then
    mkdir -p src/samples/java/serialization
    if [ -f "src/main/java/serialization/PrivateReadResolveCheck.java" ]; then
        mv "src/main/java/serialization/PrivateReadResolveCheck.java" "src/samples/java/serialization/"
        echo "Moved: serialization/PrivateReadResolveCheck.java"
    fi
    if [ -f "src/main/java/serialization/NonSerializableWriteCheckUnresolved.java" ]; then
        mv "src/main/java/serialization/NonSerializableWriteCheckUnresolved.java" "src/samples/java/serialization/"
        echo "Moved: serialization/NonSerializableWriteCheckUnresolved.java"
    fi
fi

if [ -d "src/main/java/SuppressWarningsCheck" ]; then
    mkdir -p src/samples/java/SuppressWarningsCheck
    if [ -f "src/main/java/SuppressWarningsCheck/only_one_warning_is_not_allowed.java" ]; then
        mv "src/main/java/SuppressWarningsCheck/only_one_warning_is_not_allowed.java" "src/samples/java/SuppressWarningsCheck/"
        echo "Moved: SuppressWarningsCheck/only_one_warning_is_not_allowed.java"
    fi
    if [ -f "src/main/java/SuppressWarningsCheck/two_warnings_from_different_lines_are_not_allowed.java" ]; then
        mv "src/main/java/SuppressWarningsCheck/two_warnings_from_different_lines_are_not_allowed.java" "src/samples/java/SuppressWarningsCheck/"
        echo "Moved: SuppressWarningsCheck/two_warnings_from_different_lines_are_not_allowed.java"
    fi
fi

if [ -d "src/main/java/DisallowedConstructorCheck" ]; then
    mkdir -p src/samples/java/DisallowedConstructorCheck
    if [ -f "src/main/java/DisallowedConstructorCheck/empty_parameters.java" ]; then
        mv "src/main/java/DisallowedConstructorCheck/empty_parameters.java" "src/samples/java/DisallowedConstructorCheck/"
        echo "Moved: DisallowedConstructorCheck/empty_parameters.java"
    fi
fi

if [ -d "src/main/java/unused" ]; then
    mkdir -p src/samples/java/unused
    if [ -f "src/main/java/unused/UnusedReturnedData.java" ]; then
        mv "src/main/java/unused/UnusedReturnedData.java" "src/samples/java/unused/"
        echo "Moved: unused/UnusedReturnedData.java"
    fi
fi

if [ -d "src/main/java/tests" ]; then
    mkdir -p src/samples/java/tests
    if [ -f "src/main/java/tests/TestAnnotationsWithExpectedExceptionCheckWithCompilationErrors.java" ]; then
        mv "src/main/java/tests/TestAnnotationsWithExpectedExceptionCheckWithCompilationErrors.java" "src/samples/java/tests/"
        echo "Moved: tests/TestAnnotationsWithExpectedExceptionCheckWithCompilationErrors.java"
    fi
fi

echo ""
echo "Done! Non-compiling sample files moved to src/samples/java"
echo "These files can still be analyzed by SonarQube but won't be compiled by Maven."
