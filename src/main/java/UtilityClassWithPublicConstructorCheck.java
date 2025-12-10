public class UtilityClassWithPublicConstructorCheck {

    // Noncompliant - Utility class with a public constructor
    public class NonCompliantUtility1 {
        public NonCompliantUtility1() {
        }

        public static String doSomething() {
            return "something";
        }
    }

    // Noncompliant - Utility class with a public constructor
    public class NonCompliantUtility2 {
        public NonCompliantUtility2(String param) {
            // Noncompliant
        }

        public static int calculateValue(int x) {
            return x * 2;
        }
    }

    // Compliant - Utility class with a private constructor
    public class CompliantUtility1 {
        private CompliantUtility1() {
            // Private constructor - prevents instantiation
        }

        public static String formatText(String text) {
            return text.toUpperCase();
        }
    }

    // Compliant - Utility class with no constructor defined (implicitly default)
    public class CompliantUtility2 {
        public static double squareRoot(double num) {
            return Math.sqrt(num);
        }
    }
}
