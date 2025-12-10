public class ThrowsFromFinallyCheck {

    // Noncompliant - Throwing an exception from finally block
    public void example1() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException caught");
        } finally {
            throw new RuntimeException("Exception from finally"); // Noncompliant
        }
    }

    // Noncompliant - Throwing an exception from finally block, masking the original exception
    public void example2() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException caught");
        } finally {
            try {
                throw new RuntimeException("Exception from finally"); // Noncompliant
            } catch (Exception ex) {
                //This will mask the original exception
            }
        }
    }

    // Compliant - No exception thrown from finally block
    public void example3() {
        try {
            int result = 10 / 2;
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException caught");
        } finally {
            System.out.println("Finally block executed");
        }
    }

    // Compliant - Finally block only logs or performs cleanup
    public void example4() {
        try {
            int result = 10 / 2;
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException caught");
        } finally {
            System.out.println("Closing resources...");
        }
    }
}
