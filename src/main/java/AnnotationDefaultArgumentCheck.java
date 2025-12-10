public class AnnotationDefaultArgumentCheck {

    // Noncompliant - Missing default value for annotation member
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MyAnnotation {
        String value();
    }

    public void testNoncompliant1() {
        @MyAnnotation(value = "test")
        public class TestClass1 {}
    }

    // Noncompliant - Missing default value for annotation member
    @Retention(RetentionPolicy.RUNTIME)
    public @interface AnotherAnnotation {
        int count();
    }

    public void testNoncompliant2() {
        @AnotherAnnotation(count = 10)
        public class TestClass2 {}
    }

    // Compliant - Annotation member has a default value
    @Retention(RetentionPolicy.RUNTIME)
    public @interface GoodAnnotation {
        String message() default "Default Message";
    }

    public void testCompliant1() {
        @GoodAnnotation
        public class TestClass3 {}
    }

    // Compliant - Annotation member has a default value and is overridden
    @Retention(RetentionPolicy.RUNTIME)
    public @interface AnotherGoodAnnotation {
        int number() default 0;
    }

    public void testCompliant2() {
        @AnotherGoodAnnotation(number = 5)
        public class TestClass4 {}
    }
}
