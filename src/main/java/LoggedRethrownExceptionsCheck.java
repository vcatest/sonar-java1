public class LoggedRethrownExceptionsCheck {

    // Noncompliant - Logging and then rethrowing without adding context.
    public void nonCompliantExample1() {
        try {
            // Some operation that might throw an exception
            throw new IllegalArgumentException("Invalid argument");
        } catch (IllegalArgumentException e) {
            System.err.println("Caught IllegalArgumentException: " + e.getMessage()); // Noncompliant
            throw e; // Noncompliant
        }
    }

    // Noncompliant - Logging and then rethrowing without adding context.
    public void nonCompliantExample2() {
        try {
            // Some operation that might throw an exception
            throw new NullPointerException("Null pointer encountered");
        } catch (NullPointerException e) {
            System.err.println("Error: " + e.getMessage()); // Noncompliant
            throw e; // Noncompliant
        }
    }

    // Compliant - Logging and rethrowing with added context.
    public void compliantExample1() {
        try {
            // Some operation that might throw an exception
            throw new IllegalArgumentException("Invalid argument");
        } catch (IllegalArgumentException e) {
            System.err.println("Caught IllegalArgumentException: " + e.getMessage() + ". Re-throwing with additional context.");
            throw new IllegalArgumentException("Invalid argument - processing failed", e);
        }
    }

    // Compliant - Logging and rethrowing with added context.
    public void compliantExample2() {
        try {
            // Some operation that might throw an exception
            throw new NullPointerException("Null pointer encountered");
        } catch (NullPointerException e) {
            System.err.println("Error: Null pointer encountered. Re-throwing with more details.");
            throw new NullPointerException("Null pointer encountered during data processing", e);
        }
    }
}
