public class UnnecessaryBitOperationCheck {

    public void nonCompliantExample1() {
        int x = 5;
        int y = x & ~0; // Noncompliant - Bitwise AND with a mask that effectively does nothing.
        System.out.println(y);
    }

    public void nonCompliantExample2() {
        int a = 10;
        int b = a | 0; // Noncompliant - Bitwise OR with zero is redundant.
        System.out.println(b);
    }

    public void compliantExample1() {
        int p = 7;
        int q = p << 2; // Compliant - Useful bit shift operation.
        System.out.println(q);
    }

    public void compliantExample2() {
        int m = 15;
        int n = m ^ 8; // Compliant - Bitwise XOR with a non-zero value for a specific purpose.
        System.out.println(n);
    }

    public void compliantExample3() {
        int r = 3;
        int s = r | 1; //Compliant - Bitwise OR with 1 to set a specific bit.
        System.out.println(s);
    }

    public void nonCompliantExample3() {
        int z = 20;
        int w = z ^ 0; // Noncompliant - Bitwise XOR with zero is redundant.
        System.out.println(w);
    }
}
