public class ClassVariableVisibilityCheck {

    // Noncompliant
    private static int nonCompliantVariable1 = 10;

    // Noncompliant
    protected static String nonCompliantVariable2 = "test";

    public static final int COMPLIANT_VARIABLE_1 = 20;

    public static final String COMPLIANT_VARIABLE_2 = "example";

    public static void main(String[] args) {
        System.out.println(nonCompliantVariable1);
        System.out.println(nonCompliantVariable2);
        System.out.println(COMPLIANT_VARIABLE_1);
        System.out.println(COMPLIANT_VARIABLE_2);
    }
}
