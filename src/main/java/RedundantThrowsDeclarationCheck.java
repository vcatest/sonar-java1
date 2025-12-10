public class RedundantThrowsDeclarationCheck {

    // Noncompliant
    public void method1() throws Exception, IllegalArgumentException {
        // Some code here
    }

    // Noncompliant
    public void method2(int x) throws NullPointerException, ArithmeticException, Exception {
        if (x < 0) {
            throw new IllegalArgumentException("x must be positive");
        }
        // Some code here
    }

    // Compliant
    public void method3() throws Exception {
        // Some code here
    }

    // Compliant
    public void method4(int x) throws ArithmeticException {
        if (x == 0) {
            throw new ArithmeticException("Division by zero");
        }
        // Some code here
    }

    public void method5() {
        // Some code here
    }

    public void method6(int x) throws IllegalArgumentException {
        if (x < 0) {
            throw new IllegalArgumentException("x must be positive");
        }
    }
}
