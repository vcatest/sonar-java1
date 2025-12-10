public class FieldModifierCheck {

    // Noncompliant
    private static int nonCompliantField1;

    // Noncompliant
    protected String nonCompliantField2;

    public int compliantField1;

    public static final String COMPLIANT_FIELD_2 = "constant";

    public void someMethod() {
        // Some code here
    }
}
