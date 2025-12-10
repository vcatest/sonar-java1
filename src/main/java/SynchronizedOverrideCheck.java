public class SynchronizedOverrideCheck {

    // Noncompliant - Synchronized method overrides a non-synchronized method
    public void myMethod() {
        System.out.println("Original method");
    }

    public synchronized void myMethod() { // Noncompliant
        System.out.println("Overridden synchronized method");
    }

    // Noncompliant - Synchronized method overrides a non-synchronized method
    public String getValue() {
        return "Original Value";
    }

    public synchronized String getValue() { // Noncompliant
        return "Overridden synchronized value";
    }

    // Compliant - Overriding a synchronized method with a synchronized method
    public synchronized void synchronizedMethod() {
        System.out.println("Synchronized original method");
    }

    public synchronized void synchronizedMethod() {
        System.out.println("Synchronized overridden method");
    }

    // Compliant - Overriding a non-synchronized method with a non-synchronized method
    public void nonSynchronizedMethod() {
        System.out.println("Non-synchronized original method");
    }

    public void nonSynchronizedMethod() {
        System.out.println("Non-synchronized overridden method");
    }
}
