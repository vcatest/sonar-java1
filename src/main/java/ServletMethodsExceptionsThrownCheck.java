public class ServletMethodsExceptionsThrownCheck {

    // Noncompliant - Exception thrown directly within a servlet method without handling
    public void noncompliantMethod1() throws Exception {
        int x = 10;
        int y = 0;
        int z = x / y; // Noncompliant
    }

    // Noncompliant - Exception thrown within a servlet method, caught but re-thrown
    public void noncompliantMethod2() {
        try {
            int x = 10;
            int y = 0;
            int z = x / y;
        } catch (ArithmeticException e) {
            System.err.println("Caught ArithmeticException");
            throw new RuntimeException("Wrapped exception", e); // Noncompliant
        }
    }

    // Compliant - Exception handled within the servlet method
    public void compliantMethod1() {
        try {
            int x = 10;
            int y = 0;
            int z = x / y;
        } catch (ArithmeticException e) {
            System.err.println("Caught ArithmeticException");
            // Handle the exception appropriately (e.g., log, return an error code)
        }
    }

    // Compliant - No exception thrown within the servlet method
    public void compliantMethod2() {
        int x = 10;
        int y = 2;
        int z = x / y;
        System.out.println("Result: " + z);
    }
}
