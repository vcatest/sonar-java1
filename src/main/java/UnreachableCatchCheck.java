public class UnreachableCatchCheck {

    public void example1() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // Noncompliant - ArithmeticException is thrown and caught, but no further handling.
            System.err.println("ArithmeticException caught");
        } catch (Exception e) {
            System.err.println("Exception caught");
        }
    }

    public void example2() {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            // Noncompliant - NullPointerException is thrown and caught, but no further handling.
            System.err.println("NullPointerException caught");
        } catch (Exception e) {
            System.err.println("Exception caught");
        }
    }

    public void example3() {
        try {
            int result = 10 / 2;
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException caught");
        } catch (Exception e) {
            System.err.println("Exception caught");
        }
    }

    public void example4() {
        try {
            String s = "hello";
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.err.println("NullPointerException caught");
        } catch (Exception e) {
            System.err.println("Exception caught");
        }
    }
}
