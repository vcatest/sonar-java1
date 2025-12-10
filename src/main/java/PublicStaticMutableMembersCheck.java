public class PublicStaticMutableMembersCheck {

    // Noncompliant
    public static int mutableStaticInt = 0;

    // Noncompliant
    public static String mutableStaticString = "";

    public static final int immutableStaticInt = 1; // Compliant

    private static final String immutableStaticString = "immutable"; // Compliant

    public static void main(String[] args) {
        mutableStaticInt++;
        mutableStaticString += "test";

        System.out.println(mutableStaticInt);
        System.out.println(mutableStaticString);
    }

    public static void someMethod() {
        // Compliant - local variable
        int localMutableInt = 0;
        localMutableInt++;
    }
}
