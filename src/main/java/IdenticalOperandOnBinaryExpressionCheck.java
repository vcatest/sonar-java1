public class IdenticalOperandOnBinaryExpressionCheck {

    public void nonCompliantExample1() {
        int x = 5;
        x = x + x; // Noncompliant
    }

    public void nonCompliantExample2() {
        String message = "hello";
        message = message + message; // Noncompliant
    }

    public void nonCompliantExample3() {
        boolean flag = true;
        flag = flag && flag; // Noncompliant
    }

    public void compliantExample1() {
        int x = 5;
        x = x + 10;
    }

    public void compliantExample2() {
        String message = "hello";
        message = message + " world";
    }

    public void compliantExample3() {
        boolean flag = true;
        flag = flag && false;
    }

    public void compliantExample4() {
        int a = 1;
        int b = 2;
        int c = a + b;
    }
}
