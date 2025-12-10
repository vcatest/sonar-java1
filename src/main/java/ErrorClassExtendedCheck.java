public class ErrorClassExtendedCheck {

    // Noncompliant - Extending Error without adding specific error handling
    public class MyError extends Error {
    }

    // Noncompliant - Extending Exception without adding specific error handling
    public class MyException extends Exception {
    }

    // Compliant - Extending Exception and adding specific error handling
    public class SpecificException extends Exception {
        public SpecificException(String message) {
            super(message);
        }
    }

    // Compliant - Extending Error and adding specific error handling
    public class SpecificError extends Error {
        public SpecificError(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        try {
            throw new MyException();
        } catch (Exception e) {
            System.err.println("Caught exception: " + e.getMessage());
        }

        try {
            throw new MyError();
        } catch (Error e) {
            System.err.println("Caught error: " + e.getMessage());
        }

        try {
            throw new SpecificException("A specific error occurred");
        } catch (SpecificException e) {
            System.err.println("Caught specific exception: " + e.getMessage());
        }

        try {
            throw new SpecificError("A specific error occurred");
        } catch (SpecificError e) {
            System.err.println("Caught specific error: " + e.getMessage());
        }
    }
}
