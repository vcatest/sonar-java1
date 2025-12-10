public class NonStaticClassInitializerCheck {

    // Noncompliant
    static {
        System.out.println("This is a static initializer block.");
    }

    // Noncompliant
    static {
        int x = 10;
        System.out.println("Static initializer with variable: " + x);
    }

    public void compliantMethod() {
        int y = 20;
        System.out.println("This is a compliant method with a variable: " + y);
    }

    public static void compliantStaticMethod() {
        System.out.println("This is a compliant static method.");
    }

    // Compliant - No static initializer block
    public NonStaticClassInitializerCheck() {
        System.out.println("Constructor called");
    }

    // Compliant - Static method without initializer
    public static void anotherCompliantStaticMethod() {
        System.out.println("Another compliant static method");
    }
}
