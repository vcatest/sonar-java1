public class InnerStaticClassesCheck {

    // Noncompliant - Inner class is static but has access to outer class members
    public class OuterClass {
        private int outerValue = 10;

        public static class InnerStaticClass {
            public void accessOuter() {
                System.out.println(outerValue); // Noncompliant
            }
        }
    }

    // Noncompliant - Static inner class accessing non-static members
    public class AnotherOuterClass {
        private String message = "Hello";

        public static class StaticInner {
            public void printMessage() {
                System.out.println(message); // Noncompliant
            }
        }
    }

    // Compliant - Static inner class does not access outer class members
    public class CompliantOuterClass {
        public static class StaticInner {
            public void printSomething() {
                System.out.println("This is okay.");
            }
        }
    }

    // Compliant - Inner class is not static, so it can access outer class members
    public class AnotherCompliantOuter {
        private int value = 5;

        public class InnerClass {
            public void accessValue() {
                System.out.println(value);
            }
        }
    }
}
