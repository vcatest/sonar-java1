public class ThreadWaitCallCheck {

    // Noncompliant - Direct call to wait() without a timeout
    public void example1() throws InterruptedException {
        Object lock = new Object();
        synchronized (lock) {
            try {
                lock.wait(); // Noncompliant
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    // Noncompliant - Direct call to wait() without a timeout
    public void example2() throws InterruptedException {
        final Object lock = new Object();
        new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait(); // Noncompliant
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }).start();
    }

    // Compliant - Call to wait() with a timeout
    public void example3() throws InterruptedException {
        Object lock = new Object();
        synchronized (lock) {
            try {
                lock.wait(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    // Compliant - Call to wait() with a timeout and nanoseconds
    public void example4() throws InterruptedException {
        Object lock = new Object();
        synchronized (lock) {
            try {
                lock.wait(1000, 500000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        ThreadWaitCallCheck test = new ThreadWaitCallCheck();
        try {
            test.example1();
            test.example2();
            test.example3();
            test.example4();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
