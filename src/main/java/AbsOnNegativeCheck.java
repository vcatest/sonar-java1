public class AbsOnNegativeCheck {

    public void nonCompliantExample1() {
        int x = -5;
        int absX = Math.abs(x);
        if (x < 0) { // Noncompliant
            System.out.println("x is negative");
        }
    }

    public void nonCompliantExample2() {
        long y = -10L;
        long absY = Math.abs(y);
        if (y < 0) { // Noncompliant
            System.out.println("y is negative");
        }
    }

    public void compliantExample1() {
        int a = -5;
        int absA = Math.abs(a);
        if (absA < 0) {
            System.out.println("absA is negative");
        }
    }

    public void compliantExample2() {
        long b = -10L;
        long absB = Math.abs(b);
        if (absB < 0) {
            System.out.println("absB is negative");
        }
    }
}
