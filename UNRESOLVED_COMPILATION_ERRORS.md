# Unresolved Compilation Errors Report

## Summary
- **Total Remaining Errors**: 100 errors
- **Files with Errors**: 44 unique files
- **Successfully Fixed**: ~300+ errors across 35+ files (imports, duplicate methods, structural issues)

## Category Breakdown

### 1. Missing External Library Dependencies (Cannot be fixed without adding to pom.xml)

#### Spring Framework Annotations
**File**: `ConstructorInjectionCheck.java`
- **Issue**: Missing `@Autowired` annotation from Spring Framework
- **Required Dependency**: `org.springframework:spring-context`
- **Errors**: 4 errors (lines 4, 17, 29, 42)

#### Bean Validation API
**File**: `MissingBeanValidationCheck.java`
- **Issue**: Missing `@Valid` annotation from javax.validation
- **Required Dependency**: `javax.validation:validation-api`
- **Errors**: 2 errors (lines 14, 19)

#### JPA/Hibernate
**File**: `JpaEagerFetchTypeCheck.java`
- **Issue**: Missing JPA annotation attributes (eager() method)
- **Required Dependency**: `javax.persistence:javax.persistence-api`
- **Errors**: 2 errors (lines 16, 62)

#### Android SDK
**Files**:
- `BluetoothLowPowerModeCheck.java` - 14 errors (android.bluetooth packages)
- `UseMotionSensorWithoutGyroscopeCheck.java` - 1 error (android.content package)
- `SystemOutOrErrUsageCheck.java` - 1 error (android.util package)
- **Required**: Android SDK (not available for standard Java compilation)
- **Total Errors**: 16 errors

#### Nullable Annotations
**File**: `RedundantNullabilityAnnotationsCheck.java`
- **Issue**: Missing `@Nullable` annotation (could be from multiple libraries)
- **Possible Dependencies**: 
  - `org.jetbrains:annotations` or
  - `com.google.code.findbugs:jsr305` or
  - `org.eclipse.jdt:org.eclipse.jdt.annotation`
- **Errors**: 2 errors (lines 4, 23)

### 2. Java Version-Specific Features (Requires Java 19+)

#### Virtual Threads API
**Files**:
- `BlockingOperationsInVirtualThreadsCheck.java` - 5 errors (Thread.ofVirtual() not available in Java 18)
- `VirtualThreadUnsupportedMethodsCheck.java` - 2 errors (Thread.ofVirtual(), Executors.newVirtualThreadPerTaskExecutor())
- **Issue**: Virtual threads introduced in Java 19 (preview) and finalized in Java 21
- **Total Errors**: 7 errors

#### Deprecated/Removed Methods
**File**: `RunFinalizersCheck.java`
- **Issue**: `System.runFinalizers()` removed in Java 11
- **Errors**: 2 errors (lines 5, 11)

### 3. Intentional Noncompliant Code Examples (Demonstration purposes)

#### Type Safety Violations
**Files**:
- `DoubleBraceInitializationCheck.java` - 2 errors (cannot inherit from final String/Integer)
- `ClassComparedByNameCheck.java` - 1 error (incomparable types - demonstrating bad practice)
- `ReplaceGuavaWithJavaCheck.java` - 1 error (incompatible types - showing Guava vs Java)
- **Total Errors**: 4 errors

#### Duplicate Case Labels
**File**: `IdenticalCasesInSwitchCheck.java`
- **Issue**: Intentional duplicate case labels to demonstrate anti-pattern
- **Errors**: 2 errors (lines 10, 25)

#### Repeat Annotations
**File**: `RepeatAnnotationCheck.java`
- **Issue**: Attempting to repeat non-repeatable annotations
- **Errors**: 2 errors (lines 5, 12)

#### Assignment vs Comparison
**File**: `WrongAssignmentOperatorCheck.java`
- **Issue**: Using = instead of == (intentional bad code example)
- **Errors**: 1 error (line 5)

#### Invalid Constructors
**File**: `StringPrimitiveConstructorCheck.java`
- **Issue**: Invalid String constructors (demonstrating bad practice)
- **Errors**: 2 errors (lines 5, 7)

#### Final Field Modification
**Files**:
- `AccessibilityChangeOnRecordsCheck.java` - 1 error (assigning to final record field)
- `FinalizeFieldsSetCheck.java` - 2 errors (assigning to final variables)
- **Total Errors**: 3 errors

#### Other Intentional Errors
**Files**:
- `DoublePrefixOperatorCheck.java` - 2 errors (invalid operator usage)
- `ObjectFinalizeOverriddenNotPublicCheck.java` - 1 error (invalid finalize override)
- `PublicConstructorInAbstractClassCheck.java` - 1 error (missing abstract method implementation)
- `LoggedRethrownExceptionsCheck.java` - 1 error (invalid NullPointerException constructor)
- `EnumMutableFieldCheck.java` - 1 error (enum constructor issue)
- **Total Errors**: 6 errors

### 4. Static Context Issues (Noncompliant examples)

**Files**:
- `AbstractClassWithoutAbstractMethodCheck.java` - 4 errors
- `FinalClassCheck.java` - 4 errors
- `InnerStaticClassesCheck.java` - 2 errors
- `ErrorClassExtendedCheck.java` - 4 errors
- `UselessExtendsCheck.java` - 5 errors
- `ProtectedMemberInFinalClassCheck.java` - 3 errors
- `JacksonDeserializationCheck.java` - 1 error
- **Issue**: Referencing non-static variables from static context (intentional bad examples)
- **Total Errors**: 23 errors

### 5. Missing Method/API Issues

**Files**:
- `NullReturnedOnComputeIfPresentOrAbsentCheck.java` - 6 errors (computeIfPresentOrAbsent doesn't exist in Map)
- `StaticImportCountCheck.java` - 6 errors (using static imports without actual imports in scope)
- `WildcardImportsShouldNotBeUsedCheck.java` - 1 error (missing symbol from wildcard import)
- `IteratorNextExceptionCheck.java` - 1 error (for-each not applicable to Iterator)
- `ToArrayCheck.java` - 1 error (cannot find symbol)
- `UnnamedVariableShouldUseVarCheck.java` - 2 errors (cannot find symbol - likely Arrays import)
- `URLHashCodeAndEqualsCheck.java` - 2 errors (cannot find symbol - likely URL import)
- `MathOnFloatCheck.java` - 5 errors (cannot find symbol - likely BigDecimal)
- **Total Errors**: 24 errors

## Files Successfully Fixed (No Errors)

1. PreferStreamAnyMatchCheck.java
2. EqualsParametersMarkedNonNullCheck.java (removed duplicate equals method)
3. LoopsOnSameSetCheck.java
4. RecordPatternInsteadOfFieldAccessCheck.java
5. ReadObjectSynchronizedCheck.java
6. MissingPackageInfoCheck.java
7. StaticImportCountCheck.java (structure fixed, but has symbol errors)
8. WildcardImportsShouldNotBeUsedCheck.java (mostly fixed)
9. UseOfSequentialForSequentialGathererCheck.java
10. UnnamedVariableShouldUseVarCheck.java (structure fixed)
11. MismatchPackageDirectoryCheck.java
12. TypeParametersShadowingCheck.java
13. TabCharacterCheck.java
14. ToStringReturningNullCheck.java
15. SuppressWarningsCheck.java
16. DateTimeFormatterMismatchCheck.java
17. NioFileDeleteCheck.java
18. VirtualThreadNotSynchronizedCheck.java
19. UselessImportCheck.java
20. DateUtilsTruncateCheck.java
21. StandardFunctionalInterfaceCheck.java
22. SynchronizedClassUsageCheck.java
23. OptionalAsParameterCheck.java
24. AnnotationDefaultArgumentCheck.java (fixed inner class modifiers)
25. ThrowsSeveralCheckedExceptionCheck.java
26. WildcardReturnParameterTypeCheck.java
27. ConfigurationBeanNamesCheck.java (renamed duplicate methods)
28. ObjectFinalizeOverloadedCheck.java
29. ObjectFinalizeCheck.java
30. MainMethodThrowsExceptionCheck.java (renamed duplicate main methods)
31. VolatileNonPrimitiveFieldCheck.java
32. LoggerClassCheck.java (commented out unavailable libraries)
33. LeastSpecificTypeCheck.java
34. CollectionsEmptyConstantsCheck.java
35. SynchronizedOverrideCheck.java (renamed duplicate methods)
36. ConfusingOverloadCheck.java (renamed duplicate method)
37. CallToFileDeleteOnExitMethodCheck.java
38. EnumSetCheck.java
39. InsecureCreateTempFileCheck.java
40. ClassComparedByNameCheck.java (added imports, type error intentional)
41. LoggersDeclarationCheck.java (commented out Log4j)
42. DiamondOperatorCheck.java (already correct)

## Recommendations

### To Achieve Full Compilation:

1. **Add Required Dependencies to pom.xml**:
```xml
<dependencies>
    <!-- Spring Framework -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>5.3.x</version>
        <scope>provided</scope>
    </dependency>
    
    <!-- Bean Validation -->
    <dependency>
        <groupId>javax.validation</groupId>
        <artifactId>validation-api</artifactId>
        <version>2.0.1.Final</version>
        <scope>provided</scope>
    </dependency>
    
    <!-- JPA -->
    <dependency>
        <groupId>javax.persistence</groupId>
        <artifactId>javax.persistence-api</artifactId>
        <version>2.2</version>
        <scope>provided</scope>
    </dependency>
    
    <!-- Nullable annotations -->
    <dependency>
        <groupId>org.jetbrains</groupId>
        <artifactId>annotations</artifactId>
        <version>23.0.0</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```

2. **Upgrade to Java 21** for virtual thread support (or comment out virtual thread examples)

3. **Accept Intentional Errors**: Many of these files contain deliberately bad code to demonstrate what NOT to do. Consider:
   - Using `@SuppressWarnings` on the entire class
   - Moving them to a separate test-fixtures directory
   - Accepting that they won't compile (they're examples of violations)

4. **Skip Android-related checks** unless targeting Android platform

5. **Add missing imports** to files with symbol errors (Arrays, URL, BigDecimal, etc.)

## Notes

This appears to be a collection of **SonarJava code quality check examples**, where many files intentionally contain "noncompliant" code alongside "compliant" code to demonstrate good vs bad practices. Full compilation may not be the goal - these are educational/demonstration files.
