public class CatchOfThrowableOrErrorCheck {

    // Noncompliant - Catching Throwable is too broad
    public void example1() {
        try {
            // Some code that might throw an exception
            throw new Exception("Something went wrong");
        } catch (Throwable t) {
            System.err.println("Caught a Throwable: " + t.getMessage());
        } // Noncompliant
    }

    // Noncompliant - Catching Error is too broad
    public void example2() {
        try {
            // Simulate an OutOfMemoryError
            int[] largeArray = new int[Integer.MAX_VALUE];
        } catch (Error e) {
            System.err.println("Caught an Error: " + e.getMessage());
        } // Noncompliant
    }

    // Compliant - Catching specific exceptions
    public void example3() {
        try {
            // Some code that might throw an exception
            throw new IllegalArgumentException("Invalid argument");
        } catch (IllegalArgumentException e) {
            System.err.println("Caught an IllegalArgumentException: " + e.getMessage());
        }
    }

    // Compliant - Catching IOException
    public void example4() {
        try {
            // Some code that might throw an IOException
            java.io.FileReader file = new java.io.FileReader("test.txt");
        } catch (java.io.IOException e) {
            System.err.println("Caught an IOException: " + e.getMessage());
        }
    }
}
