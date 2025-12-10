public class CatchRethrowingCheck {

    // Noncompliant - Catching and rethrowing without adding context
    public void example1() {
        try {
            // Some code that might throw an exception
            throw new RuntimeException("Original exception");
        } catch (RuntimeException e) {
            // Noncompliant
            throw e;
        }
    }

    // Noncompliant - Catching and rethrowing the same exception instance
    public void example2() {
        try {
            // Some code that might throw an exception
            throw new IllegalArgumentException("Invalid argument");
        } catch (IllegalArgumentException e) {
            // Noncompliant
            throw e;
        }
    }

    // Compliant - Catching and rethrowing with added context
    public void example3() {
        try {
            // Some code that might throw an exception
            throw new IOException("File not found");
        } catch (IOException e) {
            throw new RuntimeException("Failed to process file", e);
        }
    }

    // Compliant - Catching, handling, and not rethrowing
    public void example4() {
        try {
            // Some code that might throw an exception
            throw new NullPointerException("Null value encountered");
        } catch (NullPointerException e) {
            System.err.println("Caught NullPointerException: " + e.getMessage());
            // Handle the exception appropriately - no rethrow
        }
    }
}
