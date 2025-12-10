public class DeprecatedTagPresenceCheck {

    // Noncompliant
    @Deprecated
    public void oldMethod() {
        System.out.println("This method is deprecated.");
    }

    // Noncompliant
    @Deprecated
    private void anotherOldMethod() {
        System.out.println("Another deprecated method.");
    }

    public void newMethod() {
        System.out.println("This method is not deprecated.");
    }

    public void anotherNewMethod() {
        System.out.println("This is also a new method.");
    }

    public void methodWithComment() {
        // This is a comment, not a deprecated tag
        System.out.println("This method is not deprecated.");
    }

    public void methodWithDeprecatedComment() {
        System.out.println("This method is not deprecated."); // This comment doesn't make the method deprecated
    }
}
