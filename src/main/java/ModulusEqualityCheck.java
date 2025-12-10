public class ModulusEqualityCheck {

    public void nonCompliantExample1(int x, int y) {
        if (x % 2 == 0) { // Noncompliant
            System.out.println("x is even");
        }
    }

    public void nonCompliantExample2(int a, int b) {
        if (a % b == 0) { // Noncompliant
            System.out.println("a is divisible by b");
        }
    }

    public void compliantExample1(int x) {
        if (x == 0) {
            System.out.println("x is zero");
        }
    }

    public void compliantExample2(int a, int b) {
        if (a == 0 && b == 0) {
            System.out.println("a and b are zero");
        }
    }

    public void compliantExample3(int x, int y) {
        if (x == y) {
            System.out.println("x and y are equal");
        }
    }
}
