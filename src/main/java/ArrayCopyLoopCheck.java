public class ArrayCopyLoopCheck {

    // Noncompliant - Using a loop to copy an array.  System.arraycopy is preferred.
    public void nonCompliantExample1(int[] source, int[] destination) {
        for (int i = 0; i < source.length; i++) { // Noncompliant
            destination[i] = source[i];
        }
    }

    // Noncompliant - Another loop-based array copy.
    public void nonCompliantExample2(char[] source, char[] destination) {
        int len = source.length;
        for (int i = 0; i < len; i++) { // Noncompliant
            destination[i] = source[i];
        }
    }

    // Compliant - Using System.arraycopy for efficient array copying.
    public void compliantExample1(double[] source, double[] destination) {
        System.arraycopy(source, 0, destination, 0, source.length);
    }

    // Compliant - Using System.arraycopy with offset and length.
    public void compliantExample2(byte[] source, byte[] destination) {
        int offset = 5;
        int length = 10;
        System.arraycopy(source, offset, destination, 0, length);
    }

    public static void main(String[] args) {
        ArrayCopyLoopCheck test = new ArrayCopyLoopCheck();
        int[] a = {1, 2, 3};
        int[] b = new int[3];
        test.nonCompliantExample1(a, b);

        char[] c = {'a', 'b', 'c'};
        char[] d = new char[3];
        test.nonCompliantExample2(c, d);

        double[] e = {1.1, 2.2, 3.3};
        double[] f = new double[3];
        test.compliantExample1(e, f);

        byte[] g = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        byte[] h = new byte[10];
        test.compliantExample2(g, h);
    }
}
