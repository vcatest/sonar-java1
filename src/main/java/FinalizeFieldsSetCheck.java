public class FinalizeFieldsSetCheck {

    // Noncompliant - Field is set after finalization.
    private final int x;
    public FinalizeFieldsSetCheck(int initialValue) {
        x = initialValue;
    }

    public void someMethod() {
        // Noncompliant
        x = 10;
    }

    // Noncompliant - Field is set after finalization in a different method.
    private final String message;
    public FinalizeFieldsSetCheck(String initialMessage) {
        message = initialMessage;
    }

    public void anotherMethod() {
        // Noncompliant
        message = "New message";
    }

    // Compliant - Field is only set during initialization.
    private final double pi;
    public FinalizeFieldsSetCheck() {
        pi = 3.14159;
    }

    public double getPi() {
        return pi;
    }

    // Compliant - Field is initialized directly.
    private final boolean isValid;
    public FinalizeFieldsSetCheck(boolean initialValid) {
        isValid = initialValid;
    }

    public boolean isValid() {
        return isValid;
    }
}
