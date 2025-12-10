public class NoCheckstyleTagPresenceCheck {

    // Noncompliant
    public static void main(String[] args) {
        // @SuppressWarnings("unchecked")
        System.out.println("Hello, world!");
    }

    // Noncompliant
    public void someMethod() {
        // @Deprecated
        int x = 10;
    }

    public void compliantMethod() {
        System.out.println("This is compliant.");
    }

    public void anotherCompliantMethod() {
        int y = 20;
        System.out.println("Another compliant method.");
    }
}
