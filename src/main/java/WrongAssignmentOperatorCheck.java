public class WrongAssignmentOperatorCheck {

    public void nonCompliantExample1() {
        int x = 5;
        if (x = 10) { // Noncompliant
            System.out.println("x is 10");
        } else {
            System.out.println("x is not 10");
        }
    }

    public void nonCompliantExample2() {
        boolean flag = false;
        while (flag = true) { // Noncompliant
            System.out.println("Looping...");
        }
    }

    public void compliantExample1() {
        int x = 5;
        if (x == 10) {
            System.out.println("x is 10");
        } else {
            System.out.println("x is not 10");
        }
    }

    public void compliantExample2() {
        boolean flag = false;
        while (flag != true) {
            System.out.println("Looping...");
            flag = true;
        }
    }
}
