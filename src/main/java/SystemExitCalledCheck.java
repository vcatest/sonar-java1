public class SystemExitCalledCheck {

    public void nonCompliantExample1() {
        System.out.println("This is a test.");
        System.exit(0); // Noncompliant
    }

    public void nonCompliantExample2(int status) {
        if (status == -1) {
            System.err.println("Error occurred.");
            System.exit(1); // Noncompliant
        }
    }

    public void compliantExample1() {
        System.out.println("This is a test.");
        // No System.exit() call here.
    }

    public void compliantExample2(int status) {
        if (status == -1) {
            System.err.println("Error occurred.");
            // Instead of exiting, throw an exception.
            throw new IllegalArgumentException("Invalid status code.");
        }
    }

    public static void main(String[] args) {
        SystemExitCalledCheck test = new SystemExitCalledCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2(-1);
        test.compliantExample1();
        test.compliantExample2(-1);
    }
}
