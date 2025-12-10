public class ExpressionComplexityCheck {

    public void nonCompliantExample1() {
        boolean result = (true && (false || (true && false))) || (false && true); // Noncompliant
        System.out.println(result);
    }

    public void nonCompliantExample2() {
        int x = 10;
        int y = 5;
        int z = 2;
        boolean condition = (x > y) && (y < z || x == 10) && (z != 0); // Noncompliant
        System.out.println(condition);
    }

    public void compliantExample1() {
        boolean result = true && false;
        System.out.println(result);
    }

    public void compliantExample2() {
        int x = 10;
        int y = 5;
        boolean condition = x > y && y < 15;
        System.out.println(condition);
    }

    public void compliantExample3() {
        int a = 5;
        int b = 10;
        int c = 15;
        boolean check = (a > 0) && (b < 20) && (c == 15);
        System.out.println(check);
    }
}
