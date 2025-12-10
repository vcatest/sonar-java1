public class NestedIfStatementsCheck {

    public void nonCompliantExample1() {
        int x = 10;
        int y = 5;

        if (x > 5) {
            if (y < 10) { // Noncompliant
                System.out.println("Both conditions are true");
            } else {
                System.out.println("x is greater than 5, but y is not less than 10");
            }
        } else {
            System.out.println("x is not greater than 5");
        }
    }

    public void nonCompliantExample2() {
        boolean a = true;
        boolean b = false;

        if (a) {
            if (b) { // Noncompliant
                System.out.println("a and b are true");
            } else {
                System.out.println("a is true, but b is false");
            }
        } else {
            System.out.println("a is false");
        }
    }

    public void compliantExample1() {
        int x = 10;
        int y = 5;

        if (x > 5 && y < 10) {
            System.out.println("Both conditions are true");
        } else {
            System.out.println("At least one condition is false");
        }
    }

    public void compliantExample2() {
        boolean a = true;
        boolean b = false;

        if (a && b) {
            System.out.println("a and b are true");
        } else {
            System.out.println("At least one condition is false");
        }
    }
}
