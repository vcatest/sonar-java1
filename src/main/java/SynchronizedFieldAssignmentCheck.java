public class SynchronizedFieldAssignmentCheck {

    private static int sharedResource;

    // Noncompliant - Direct assignment within a synchronized block
    public static void nonCompliantExample1() {
        synchronized (SynchronizedFieldAssignmentCheck.class) {
            sharedResource = 10; // Noncompliant
        }
    }

    // Noncompliant - Assignment to a static field within a synchronized block
    public static void nonCompliantExample2() {
        Object lock = new Object();
        synchronized (lock) {
            sharedResource = 20; // Noncompliant
        }
    }

    // Compliant - Assignment outside of a synchronized block
    public static void compliantExample1() {
        int tempValue = 30;
        synchronized (SynchronizedFieldAssignmentCheck.class) {
            // Some operations within the synchronized block
        }
        sharedResource = tempValue;
    }

    // Compliant - Using a local variable within the synchronized block
    public static void compliantExample2() {
        synchronized (SynchronizedFieldAssignmentCheck.class) {
            int localValue = 40;
            sharedResource = localValue;
        }
    }

    public static void main(String[] args) {
        // This main method is just for demonstration and won't be analyzed by SonarQube directly.
        nonCompliantExample1();
        nonCompliantExample2();
        compliantExample1();
        compliantExample2();
    }
}
