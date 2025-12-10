public class RedundantModifierCheck {

    // Noncompliant
    public final int x;

    // Noncompliant
    private static final String DEFAULT_VALUE = "test";

    public int y;

    public static String z;

    // Compliant
    int a;

    static String b;

    // Compliant
    public void method1() {
        int c = 10;
    }

    static void method2() {
        String d = "hello";
    }
}
