public class ModifiersOrderCheck {

    // Noncompliant
    public static final int MAX_VALUE = 100;

    // Noncompliant
    private static final String DEFAULT_NAME = "default";

    // Compliant
    private final static int MIN_VALUE = 0;

    // Compliant
    public final static String APPLICATION_NAME = "My Application";

    public void someMethod() {
        // Some code here
    }
}
