public class MainMethodThrowsExceptionCheck {

    // Noncompliant - Main method throws an exception
    public static void main(String[] args) throws Exception {
        throw new Exception("This is a test exception");
    }

    // Noncompliant - Main method throws a checked exception
    public static void main(String[] args) throws IllegalArgumentException {
        if (args.length == 0) {
            throw new IllegalArgumentException("No arguments provided");
        }
        System.out.println("Arguments provided");
    }

    // Compliant - Main method does not throw any exception
    public static void main(String[] args) {
        System.out.println("This is a compliant main method");
    }

    // Compliant - Main method catches and handles the exception
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught an arithmetic exception: " + e.getMessage());
        }
        System.out.println("Program continues after exception handling");
    }
}
