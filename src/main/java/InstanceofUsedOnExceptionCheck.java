public class InstanceofUsedOnExceptionCheck {

    // Noncompliant - Using instanceof to check for specific exception types
    public void nonCompliantExample1(Object obj) {
        if (obj instanceof Exception) {
            Exception e = (Exception) obj;
            System.err.println("Caught an exception: " + e.getMessage());
        }
    }

    // Noncompliant - Using instanceof to check for a specific subclass of Exception
    public void nonCompliantExample2(Object obj) {
        if (obj instanceof NullPointerException) {
            NullPointerException npe = (NullPointerException) obj;
            System.err.println("Caught a NullPointerException: " + npe.getMessage());
        }
    }

    // Compliant - Catching the general Exception class
    public void compliantExample1(Object obj) {
        try {
            // Some code that might throw an exception
            throw new Exception("This is a test exception");
        } catch (Exception e) {
            System.err.println("Caught an exception: " + e.getMessage());
        }
    }

    // Compliant - Catching specific exceptions directly
    public void compliantExample2(Object obj) {
        try {
            // Some code that might throw a NullPointerException
            throw new NullPointerException("This is a test NullPointerException");
        } catch (NullPointerException npe) {
            System.err.println("Caught a NullPointerException: " + npe.getMessage());
        }
    }

    public static void main(String[] args) {
        InstanceofUsedOnExceptionCheck test = new InstanceofUsedOnExceptionCheck();
        test.nonCompliantExample1(new Exception("Test Exception"));
        test.nonCompliantExample2(new NullPointerException("Test NullPointerException"));
        test.compliantExample1(null);
        test.compliantExample2(null);
    }
}
