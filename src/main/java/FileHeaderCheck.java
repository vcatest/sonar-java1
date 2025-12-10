public class FileHeaderCheck {

    // Noncompliant
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    // Noncompliant
    public int add(int a, int b) {
        return a + b;
    }

    // Compliant
    /**
     * This is a sample class for testing FileHeaderCheck rule.
     */
    public class CompliantClass {
        public void doSomething() {
            System.out.println("Doing something compliant.");
        }
    }

    // Compliant
    /**
     * Another compliant class.
     */
    public class AnotherCompliantClass {
        private String message;

        public AnotherCompliantClass(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}
