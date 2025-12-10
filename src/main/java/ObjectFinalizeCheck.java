public class ObjectFinalizeCheck {

    // Noncompliant - Overriding finalize() method is generally discouraged.
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizing...");
    }

    public void compliantMethod() {
        // This method does not override finalize(), so it's compliant.
        System.out.println("Compliant method.");
    }

    public static void main(String[] args) {
        // Compliant - No finalize method present in this class.
        System.out.println("Main method - Compliant.");
    }
}
