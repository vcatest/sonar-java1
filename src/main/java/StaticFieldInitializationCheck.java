public class StaticFieldInitializationCheck {

    // Noncompliant
    private static int uninitializedStaticField;

    public static void method1() {
        System.out.println(uninitializedStaticField);
    }

    // Noncompliant
    private static String anotherUninitializedStaticField = null;

    public static void method2() {
        System.out.println(anotherUninitializedStaticField.length());
    }

    // Compliant
    private static int initializedStaticField = 10;

    public static void method3() {
        System.out.println(initializedStaticField);
    }

    // Compliant
    private static String initializedAnotherStaticField = "Hello";

    public static void method4() {
        System.out.println(initializedAnotherStaticField.length());
    }

    public static void main(String[] args) {
        method1();
        method2();
        method3();
        method4();
    }
}
