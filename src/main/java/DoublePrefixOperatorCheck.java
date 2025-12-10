public class DoublePrefixOperatorCheck {

    public void nonCompliantExample1() {
        int x = ++++y; // Noncompliant
    }

    public void nonCompliantExample2() {
        long z = --++a; // Noncompliant
    }

    public void compliantExample1() {
        int b = ++x;
    }

    public void compliantExample2() {
        int c = --y;
    }

    public void compliantExample3() {
        int d = x++;
    }

    public void compliantExample4() {
        int e = y--;
    }

    private int x = 5;
    private int y = 10;
    private long a = 15;
}
