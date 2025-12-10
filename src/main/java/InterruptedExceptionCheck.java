public class InterruptedExceptionCheck {

    // Noncompliant - Catching InterruptedException and ignoring it.
    public void nonCompliantExample1() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // Ignoring the exception.
        }
    }

    // Noncompliant - Catching InterruptedException and doing nothing.
    public void nonCompliantExample2() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // Empty catch block.
        }
    }

    // Compliant - Catching InterruptedException and restoring interruption status.
    public void compliantExample1() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            // Handle the interruption appropriately, e.g., by exiting the method.
            return;
        }
    }

    // Compliant - Catching InterruptedException and re-throwing it.
    public void compliantExample2() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e); // Or re-throw the InterruptedException directly
        }
    }

    public static void main(String[] args) {
        InterruptedExceptionCheck test = new InterruptedExceptionCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2();
        test.compliantExample1();
        test.compliantExample2();
    }
}
