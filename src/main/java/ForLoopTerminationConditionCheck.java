public class ForLoopTerminationConditionCheck {

    // Noncompliant - Using a floating-point number in the loop condition can lead to unexpected behavior due to precision issues.
    public void nonCompliantExample1() {
        for (double i = 0.0; i < 10.0; i += 0.1) { // Noncompliant
            System.out.println(i);
        }
    }

    // Noncompliant - Using a floating-point number in the loop condition can lead to unexpected behavior due to precision issues.
    public void nonCompliantExample2() {
        for (float i = 1.0f; i > 0.0f; i -= 0.01f) { // Noncompliant
            System.out.println(i);
        }
    }

    // Compliant - Using an integer in the loop condition provides predictable termination.
    public void compliantExample1() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    // Compliant - Using a long in the loop condition provides predictable termination.
    public void compliantExample2() {
        for (long i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}
