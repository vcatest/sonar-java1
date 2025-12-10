public class SubClassStaticReferenceCheck {

    // Noncompliant - Accessing static member of superclass from subclass
    public static class NonCompliantExample1 {
        static class SuperClass {
            static int staticVariable = 10;
        }

        public static void main(String[] args) {
            int value = SuperClass.staticVariable; // Noncompliant
            System.out.println(value);
        }
    }

    // Noncompliant - Accessing static method of superclass from subclass
    public static class NonCompliantExample2 {
        static class SuperClass {
            static void staticMethod() {
                System.out.println("SuperClass static method");
            }
        }

        public static void main(String[] args) {
            SuperClass.staticMethod(); // Noncompliant
        }
    }

    // Compliant - Accessing static member through the current class
    public static class CompliantExample1 {
        static class SuperClass {
            static int staticVariable = 20;
        }

        static int myStaticVariable = 30;

        public static void main(String[] args) {
            int value = myStaticVariable;
            System.out.println(value);
        }
    }

    // Compliant - Accessing static method through the current class
    public static class CompliantExample2 {
        static class SuperClass {
            static void staticMethod() {
                System.out.println("SuperClass static method");
            }
        }

        static void myStaticMethod() {
            System.out.println("CompliantExample2 static method");
        }

        public static void main(String[] args) {
            myStaticMethod();
        }
    }
}
