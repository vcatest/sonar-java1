public class OperatorPrecedenceCheck {

    public void nonCompliantExample1() {
        int result = 2 + 3 * 4; // Noncompliant - Potential ambiguity due to operator precedence.  Should be (2 + 3) * 4 or 2 + (3 * 4)
        System.out.println(result);
    }

    public void nonCompliantExample2() {
        boolean condition = true && false || true; // Noncompliant - Potential ambiguity. Should be (true && false) || true or true && (false || true)
        System.out.println(condition);
    }

    public void compliantExample1() {
        int result = (2 + 3) * 4;
        System.out.println(result);
    }

    public void compliantExample2() {
        boolean condition = (true && false) || true;
        System.out.println(condition);
    }

    public void compliantExample3() {
        int x = 10;
        int y = 5;
        int result = x + (y * 2);
        System.out.println(result);
    }

    public void compliantExample4() {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean result = a && (b || c);
        System.out.println(result);
    }
}
