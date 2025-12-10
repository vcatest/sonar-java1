public class CatchIllegalMonitorStateExceptionCheck {

    // Noncompliant - Catching IllegalMonitorStateException is generally not useful and can mask synchronization issues.
    public void noncompliantExample1() {
        Object lock = new Object();
        try {
            synchronized (lock) {
                // Some code
            }
        } catch (IllegalMonitorStateException e) {
            // This catch block is unnecessary and hides potential synchronization problems.
            System.err.println("IllegalMonitorStateException caught");
        }
    }

    // Noncompliant - Catching IllegalMonitorStateException is generally not useful and can mask synchronization issues.
    public void noncompliantExample2() {
        final Object lock = new Object();
        Thread t = new Thread(() -> {
            try {
                synchronized (lock) {
                    System.out.println("Thread running");
                }
            } catch (IllegalMonitorStateException e) {
                // This catch block is unnecessary and hides potential synchronization problems.
                e.printStackTrace(); // Noncompliant
            }
        });
        t.start();
    }

    // Compliant - No attempt to catch IllegalMonitorStateException.  Let the exception propagate.
    public void compliantExample1() {
        Object lock = new Object();
        synchronized (lock) {
            // Some code
        }
    }

    // Compliant - No attempt to catch IllegalMonitorStateException.  Let the exception propagate.
    public void compliantExample2() {
        final Object lock = new Object();
        Thread t = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread running");
            }
        });
        t.start();
    }
}
