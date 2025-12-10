public class IgnoredOperationStatusCheck {

    public void nonCompliantExample1() {
        try {
            // Some operation that might throw an exception
            int result = 10 / 0;
        } catch (Exception e) {
            // Noncompliant - Exception is caught but ignored. No logging or handling.
        }
    }

    public void nonCompliantExample2() {
        try {
            // Another operation that might throw an exception
            String str = null;
            str.length();
        } catch (NullPointerException e) {
            // Noncompliant - NullPointerException is caught but ignored.
        }
    }

    public void compliantExample1() {
        try {
            // Some operation that might throw an exception
            int result = 10 / 2;
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage()); // Logging the exception
        }
    }

    public void compliantExample2() {
        try {
            // Another operation that might throw an exception
            String str = "hello";
            int length = str.length();
        } catch (NullPointerException e) {
            System.err.println("NullPointerException occurred: " + e.getMessage()); // Logging the exception
        }
    }

    public void compliantExample3() {
        try {
            // Some operation that might throw an exception
            int result = 10 / 0;
        } catch (Exception e) {
            throw new RuntimeException("Operation failed", e); // Re-throwing the exception
        }
    }
}
