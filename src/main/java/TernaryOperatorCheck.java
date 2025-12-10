public class TernaryOperatorCheck {

    public void nonCompliantExample1() {
        int x = 10;
        int y = 5;
        int z = (x > y) ? x : y; // Noncompliant
        System.out.println(z);
    }

    public void nonCompliantExample2() {
        String message = (true) ? "Success" : "Failure"; // Noncompliant
        System.out.println(message);
    }

    public void compliantExample1() {
        int x = 10;
        int y = 5;
        if (x > y) {
            x = x;
        } else {
            y = y;
        }
        System.out.println(x);
    }

    public void compliantExample2() {
        boolean condition = true;
        String message;
        if (condition) {
            message = "Success";
        } else {
            message = "Failure";
        }
        System.out.println(message);
    }
}
