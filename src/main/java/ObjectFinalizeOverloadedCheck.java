public class ObjectFinalizeOverloadedCheck {

    // Noncompliant - Overloading finalize() is not allowed.
    protected void finalize() throws Throwable {
        System.out.println("First finalize");
    }
    // Noncompliant - Overloading finalize() is not allowed.
    protected void finalize(int x) throws Throwable {
        System.out.println("Second finalize");
    }

    public void someMethod() {
        // Some code here
    }

    // Compliant - Only one finalize method is defined (removed duplicate)
    public class NoFinalizeMethod {
        public void someOtherMethod() {
            // Some other code
        }
    }
}
