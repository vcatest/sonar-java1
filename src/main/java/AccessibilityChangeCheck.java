public class AccessibilityChangeCheck {

    // Noncompliant - Changing accessibility of a field after declaration.
    private int myField = 10;
    public int myField2 = 20; // Noncompliant

    // Compliant - Initial declaration with public access.
    public int compliantField = 30;

    // Compliant - Initial declaration with private access.
    private int compliantField2 = 40;

    // Noncompliant - Changing accessibility of a method after declaration.
    private void myMethod() {
        System.out.println("Private method");
    }
    public void myMethod2() { // Noncompliant
        System.out.println("Public method");
    }

    // Compliant - Initial declaration with public access.
    public void compliantMethod() {
        System.out.println("Public method");
    }

    // Compliant - Initial declaration with private access.
    private void compliantMethod2() {
        System.out.println("Private method");
    }
}
