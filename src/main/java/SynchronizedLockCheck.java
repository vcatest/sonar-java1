public class SynchronizedLockCheck {

    // Noncompliant - Using synchronized block with a literal string as a lock
    public void nonCompliantExample1() {
        synchronized ("someString") {
            // Critical section
        }
    }

    // Noncompliant - Using synchronized block with a new object as a lock
    public void nonCompliantExample2() {
        synchronized (new Object()) {
            // Critical section
        }
    }

    // Compliant - Using synchronized method
    public synchronized void compliantExample1() {
        // Critical section
    }

    // Compliant - Using synchronized block with a private final object as a lock
    private final Object lock = new Object();
    public void compliantExample2() {
        synchronized (lock) {
            // Critical section
        }
    }

    // Compliant - Using synchronized block with a public final static object as a lock
    private static final Object staticLock = new Object();
    public void compliantExample3() {
        synchronized (staticLock) {
            // Critical section
        }
    }
}
