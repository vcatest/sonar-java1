public class ReadObjectSynchronizedCheck {

    // Noncompliant - Reading a volatile field inside a synchronized block is unnecessary and can hinder performance.
    public void nonCompliantExample1(Object lock, volatile int counter) {
        synchronized (lock) {
            int value = counter; // Noncompliant
            System.out.println("Value: " + value);
        }
    }

    // Noncompliant - Reading a volatile field inside a synchronized block is unnecessary and can hinder performance.
    public void nonCompliantExample2(Object lock, volatile String message) {
        synchronized (lock) {
            String msg = message; // Noncompliant
            System.out.println("Message: " + msg);
        }
    }

    // Compliant - Reading a volatile field outside a synchronized block is acceptable.
    public void compliantExample1(volatile int counter) {
        int value = counter;
        System.out.println("Value: " + value);
    }

    // Compliant - Reading a volatile field is fine when not within a synchronized block.
    public void compliantExample2(volatile String message) {
        String msg = message;
        System.out.println("Message: " + msg);
    }

    public static void main(String[] args) {
        ReadObjectSynchronizedCheck test = new ReadObjectSynchronizedCheck();
        Object lock = new Object();
        volatile int counter = 0;
        volatile String message = "Hello";

        test.nonCompliantExample1(lock, counter);
        test.nonCompliantExample2(lock, message);
        test.compliantExample1(counter);
        test.compliantExample2(message);
    }
}
