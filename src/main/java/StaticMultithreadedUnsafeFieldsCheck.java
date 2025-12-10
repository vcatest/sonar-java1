public class StaticMultithreadedUnsafeFieldsCheck {

    // Noncompliant - Static field accessed and modified by multiple threads without synchronization.
    private static int sharedCounter = 0;

    public static void incrementCounterNoncompliant() {
        sharedCounter++;
    }

    // Noncompliant - Another example of static field modification without synchronization.
    private static String sharedMessage = "";

    public static void appendMessageNoncompliant(String message) {
        sharedMessage += message;
    }

    // Compliant - Using a synchronized block to protect access to the static field.
    private static int synchronizedCounter = 0;

    public static void incrementCounterCompliant() {
        synchronized (StaticMultithreadedUnsafeFieldsCheck.class) {
            synchronizedCounter++;
        }
    }

    // Compliant - Using a final static field.  Final fields are inherently thread-safe.
    private static final int finalCounter = 0;

    public static int getFinalCounter() {
        return finalCounter;
    }

    public static void main(String[] args) {
        // Example usage - not part of the rule check, just for demonstration.
        for (int i = 0; i < 1000; i++) {
            incrementCounterNoncompliant();
            appendMessageNoncompliant("Thread " + i + " ");
        }

        for (int i = 0; i < 1000; i++) {
            incrementCounterCompliant();
        }

        System.out.println("Noncompliant Counter: " + sharedCounter);
        System.out.println("Compliant Counter: " + synchronizedCounter);
        System.out.println("Final Counter: " + getFinalCounter());
    }
}
