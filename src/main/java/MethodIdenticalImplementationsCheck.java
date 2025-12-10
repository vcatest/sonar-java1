public class MethodIdenticalImplementationsCheck {

    // Noncompliant
    public void example1() {
        System.out.println("Hello from example1");
    }

    // Noncompliant
    public void example2() {
        System.out.println("Hello from example1");
    }

    // Compliant
    public void example3() {
        System.out.println("Hello from example3");
    }

    // Compliant
    public void example4() {
        System.out.println("Hello from example4");
    }

    // Noncompliant
    public int calculateSum1(int a, int b) {
        return a + b; // Noncompliant
    }

    // Noncompliant
    public int calculateSum2(int x, int y) {
        return x + y; // Noncompliant
    }

    // Compliant
    public int calculateProduct(int a, int b) {
        return a * b;
    }

    // Compliant
    public int calculateDifference(int a, int b) {
        return a - b;
    }
}
