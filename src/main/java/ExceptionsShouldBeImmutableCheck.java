public class ExceptionsShouldBeImmutableCheck {

    // Noncompliant - Mutable field in custom exception
    public static class MutableException extends Exception {
        private StringBuilder message;

        public MutableException(String initialMessage) {
            this.message = new StringBuilder(initialMessage);
        }

        public String getMessage() {
            return message.toString();
        }

        public void setMessage(String newMessage) { // Noncompliant
            this.message = new StringBuilder(newMessage);
        }
    }

    // Noncompliant - Mutable field accessible outside the class
    public static class AnotherMutableException extends Exception {
        public String mutableMessage;

        public AnotherMutableException(String message) {
            this.mutableMessage = message;
        }

        public String getMessage() {
            return mutableMessage;
        }

        public void setMutableMessage(String newMessage) { // Noncompliant
            this.mutableMessage = newMessage;
        }
    }

    // Compliant - Immutable exception with final field
    public static class ImmutableException extends Exception {
        private final String message;

        public ImmutableException(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }

    // Compliant - Immutable exception with private final field
    public static class AnotherImmutableException extends Exception {
        private final String message;

        public AnotherImmutableException(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }

    public static void main(String[] args) {
        MutableException mutableEx = new MutableException("Initial message");
        mutableEx.setMessage("Modified message");
        System.out.println(mutableEx.getMessage());

        AnotherMutableException anotherMutableEx = new AnotherMutableException("Initial message");
        anotherMutableEx.setMutableMessage("Modified message");
        System.out.println(anotherMutableEx.getMessage());

        ImmutableException immutableEx = new ImmutableException("Initial message");
        // immutableEx.setMessage("This won't compile"); // Compilation error - no setter

        AnotherImmutableException anotherImmutableEx = new AnotherImmutableException("Initial message");
        // anotherImmutableEx.setMessage("This won't compile"); // Compilation error - no setter
    }
}
