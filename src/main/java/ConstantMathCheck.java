public class ConstantMathCheck {

    public void nonCompliantExample1() {
        int x = 5;
        int y = 10;
        int z = x + y * 2; // Noncompliant
        System.out.println(z);
    }

    public void nonCompliantExample2() {
        double a = 3.14;
        double b = 2.71;
        double c = a / b + 1; // Noncompliant
        System.out.println(c);
    }

    public void compliantExample1() {
        int x = 5;
        int y = 10;
        int z = x;
        z = y;
        System.out.println(z);
    }

    public void compliantExample2() {
        double a = 3.14;
        double b = 2.71;
        double c = a;
        c = b;
        System.out.println(c);
    }
}
