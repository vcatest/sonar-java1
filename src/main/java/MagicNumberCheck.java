public class MagicNumberCheck {

    public void nonCompliantExample1() {
        int x = 10; // Noncompliant
        System.out.println("Value of x: " + x);
    }

    public void nonCompliantExample2() {
        double area = 3.14159 * 5 * 5; // Noncompliant
        System.out.println("Area of the circle: " + area);
    }

    public void compliantExample1() {
        final int MAX_VALUE = 10;
        int x = MAX_VALUE;
        System.out.println("Value of x: " + x);
    }

    public void compliantExample2() {
        final double PI = 3.14159;
        double area = PI * 5 * 5;
        System.out.println("Area of the circle: " + area);
    }

    public static void main(String[] args) {
        MagicNumberCheck check = new MagicNumberCheck();
        check.nonCompliantExample1();
        check.nonCompliantExample2();
        check.compliantExample1();
        check.compliantExample2();
    }
}
