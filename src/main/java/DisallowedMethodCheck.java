public class DisallowedMethodCheck {

    // Noncompliant - Using System.gc() is disallowed.
    public void nonCompliantExample1() {
        System.gc();
    }

    // Noncompliant - Using Thread.stop() is disallowed.
    public void nonCompliantExample2() {
        Thread currentThread = Thread.currentThread();
        currentThread.stop();
    }

    // Compliant - Using System.out.println() is allowed.
    public void compliantExample1() {
        System.out.println("Hello, SonarQube!");
    }

    // Compliant - Using a standard method like Math.sqrt() is allowed.
    public void compliantExample2() {
        double result = Math.sqrt(25.0);
        System.out.println(result);
    }

    public static void main(String[] args) {
        DisallowedMethodCheck test = new DisallowedMethodCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2();
        test.compliantExample1();
        test.compliantExample2();
    }
}
