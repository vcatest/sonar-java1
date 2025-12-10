public class StaticFieldUpdateInConstructorCheck {

    private static int staticField;

    // Noncompliant
    public StaticFieldUpdateInConstructorCheck() {
        staticField = 10; // Noncompliant
    }

    public void method1() {
        System.out.println("Method 1");
    }

    private static int anotherStaticField;

    // Noncompliant
    public StaticFieldUpdateInConstructorCheck(int value) {
        anotherStaticField = value; // Noncompliant
    }

    public void method2(int x) {
        int localVariable = x + 5;
        System.out.println("Method 2");
    }

    // Compliant
    public void compliantMethod1() {
        int localStaticVariable = 20;
        System.out.println("Compliant Method 1");
    }

    // Compliant
    public StaticFieldUpdateInConstructorCheck(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        StaticFieldUpdateInConstructorCheck obj1 = new StaticFieldUpdateInConstructorCheck();
        StaticFieldUpdateInConstructorCheck obj2 = new StaticFieldUpdateInConstructorCheck(5);
        obj1.method1();
        obj2.method2(10);
        obj1.compliantMethod1();
        StaticFieldUpdateInConstructorCheck obj3 = new StaticFieldUpdateInConstructorCheck("Hello");
    }
}
