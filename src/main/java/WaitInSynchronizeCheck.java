public class WaitInSynchronizeCheck {

    // Noncompliant - Using wait() inside a synchronized block without a proper condition check.
    public void nonCompliantExample1() {
        Object lock = new Object();
        synchronized (lock) {
            try {
                lock.wait(); // Noncompliant
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    // Noncompliant - Calling wait() without checking a condition. This can lead to spurious wakeups and missed notifications.
    public void nonCompliantExample2() {
        Object lock = new Object();
        synchronized (lock) {
            try {
                lock.wait(); // Noncompliant
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    // Compliant - Using wait() with a condition check in a loop.
    public void compliantExample1() {
        Object lock = new Object();
        boolean condition = false;
        synchronized (lock) {
            while (!condition) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                condition = true; // Update condition after waking up
            }
        }
    }

    // Compliant - Using wait() with a timeout and condition check.
    public void compliantExample2() {
        Object lock = new Object();
        boolean condition = false;
        synchronized (lock) {
            try {
                while (!condition) {
                    lock.wait(1000); // Wait with a timeout
                    condition = true; // Update condition after waking up
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
