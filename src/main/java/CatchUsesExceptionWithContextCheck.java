public class CatchUsesExceptionWithContextCheck {

    // Noncompliant - Catch block does not use the exception object.
    public void noncompliantExample1() {
        try {
            int result = 10 / 0;
        } catch (Exception e) {
            // Noncompliant
            System.out.println("An error occurred.");
        }
    }

    // Noncompliant - Catch block only logs a generic message without using the exception.
    public void noncompliantExample2() {
        try {
            String str = null;
            str.length();
        } catch (Exception e) {
            // Noncompliant
            System.err.println("Something went wrong!");
        }
    }

    // Compliant - Catch block uses the exception object to log the stack trace.
    public void compliantExample1() {
        try {
            int result = 10 / 0;
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Compliant - Catch block uses the exception object to re-throw a more specific exception.
    public void compliantExample2() {
        try {
            String str = null;
            str.length();
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid input", e);
        }
    }

    // Compliant - Catch block uses the exception object to perform specific error handling.
    public void compliantExample3() {
        try {
            int result = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format: " + e.getMessage());
        }
    }
}
