public class NestedTernaryOperatorsCheck {

    public void nonCompliantExample1() {
        int x = 10;
        int y = (x > 5) ? (x < 15 ? x : 20) : 30; // Noncompliant
    }

    public void nonCompliantExample2() {
        boolean condition1 = true;
        boolean condition2 = false;
        String result = (condition1) ? (condition2 ? "A" : "B") : "C"; // Noncompliant
    }

    public void compliantExample1() {
        int x = 10;
        int y;
        if (x > 5) {
            if (x < 15) {
                y = x;
            } else {
                y = 20;
            }
        } else {
            y = 30;
        }
    }

    public void compliantExample2() {
        boolean condition1 = true;
        boolean condition2 = false;
        String result;
        if (condition1) {
            if (condition2) {
                result = "A";
            } else {
                result = "B";
            }
        } else {
            result = "C";
        }
    }

    public void compliantExample3() {
        int a = 5;
        int b = (a > 2) ? a : 0;
    }

    public void compliantExample4() {
        String message = (true) ? "Hello" : "World";
    }
}
