public class ClassWithOnlyStaticMethodsInstantiationCheck {

    // Noncompliant - Instantiating a class with only static methods
    public class NonCompliantClass1 {
        public static void staticMethod1() {
            System.out.println("Static Method 1");
        }

        public static void staticMethod2() {
            System.out.println("Static Method 2");
        }

        public NonCompliantClass1() { // Noncompliant
            // Private constructor to prevent instantiation, but still present.
        }
    }

    // Noncompliant - Instantiating a class with only static methods, even with a private constructor
    public class NonCompliantClass2 {
        public static String staticVariable = "Static Variable";
        public static void staticMethod() {
            System.out.println("Static Method");
        }

        private NonCompliantClass2() { // Noncompliant
            // Private constructor
        }
    }

    // Compliant - Class with only static methods and no constructor
    public class CompliantClass1 {
        public static void staticMethod1() {
            System.out.println("Static Method 1");
        }

        public static void staticMethod2() {
            System.out.println("Static Method 2");
        }
    }

    // Compliant - Class with only static methods and a private static nested class
    public class CompliantClass2 {
        public static void staticMethod() {
            System.out.println("Static Method");
        }

        private static class StaticNestedClass {
            public static void nestedStaticMethod() {
                System.out.println("Nested Static Method");
            }
        }
    }
}
