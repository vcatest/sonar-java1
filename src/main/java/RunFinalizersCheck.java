public class RunFinalizersCheck {

    // Noncompliant - Calling System.runFinalizers() is generally discouraged.
    public void nonCompliantExample1() {
        System.runFinalizers();
    }

    // Noncompliant - Explicitly calling runFinalizers can lead to unpredictable behavior.
    public void nonCompliantExample2() {
        try {
            System.runFinalizers();
        } catch (Exception e) {
            // Handle exception if needed
        }
    }

    // Compliant - No explicit call to System.runFinalizers().  Finalizers are called by the garbage collector.
    public void compliantExample1() {
        Object obj = new Object();
        // Object will be finalized when garbage collected.
    }

    // Compliant -  No explicit call to System.runFinalizers(). Relying on garbage collection.
    public void compliantExample2() {
        class MyClass {
            @Override
            protected void finalize() throws Throwable {
                // Finalization logic
            }
        }
        MyClass instance = new MyClass();
        // Instance will be finalized when garbage collected.
    }

    public static void main(String[] args) {
        RunFinalizersCheck test = new RunFinalizersCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2();
        test.compliantExample1();
        test.compliantExample2();
    }
}
