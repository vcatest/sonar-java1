public class GarbageCollectorCalledCheck {

    // Noncompliant
    public static void nonCompliantExample1() {
        System.gc();
    }

    // Noncompliant
    public static void nonCompliantExample2() {
        Runtime.getRuntime().gc();
    }

    public static void compliantExample1() {
        // No explicit garbage collection call
        for (int i = 0; i < 1000; i++) {
            Object obj = new Object();
            // obj will be eligible for garbage collection when it goes out of scope
        }
    }

    public static void compliantExample2() {
        // No explicit garbage collection call
        Object obj = new Object();
        obj = null; // Make the object eligible for garbage collection
    }

    public static void main(String[] args) {
        nonCompliantExample1();
        nonCompliantExample2();
        compliantExample1();
        compliantExample2();
    }
}
