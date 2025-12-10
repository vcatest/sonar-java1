public class VisibleForTestingUsageCheck {

    // Noncompliant - Using a private field directly from outside the class
    private String secretValue = "sensitive";
    public void exposeSecret() {
        System.out.println(secretValue); // Noncompliant
    }

    // Noncompliant - Accessing a private method from a test class (simulated here)
    private void internalLogic() {
        System.out.println("Internal logic");
    }
    public void callInternal() {
        internalLogic(); // Noncompliant - This would be a violation if called from a test.
    }

    // Compliant - Using a public getter to access a private field
    private int value = 10;
    public int getValue() {
        return value;
    }

    // Compliant - Using a public method to trigger internal logic
    public void publicMethod() {
        internalHelper();
    }
    private void internalHelper() {
        System.out.println("Helper method");
    }

    public static void main(String[] args) {
        VisibleForTestingUsageCheck test = new VisibleForTestingUsageCheck();
        test.exposeSecret();
        test.callInternal();
        System.out.println(test.getValue());
        test.publicMethod();
    }
}
