public class SelfAssignmentCheck {

    public void example1() {
        int x = 5;
        x = x; // Noncompliant
    }

    public void example2() {
        String str = "hello";
        str = str; // Noncompliant
    }

    public void example3() {
        int y = 10;
        y = 20; // Compliant
    }

    public void example4() {
        String message = "world";
        String newMessage = message + "!"; // Compliant
    }

    public void example5() {
        boolean flag = true;
        flag = !flag; //Compliant
    }

    public void example6() {
        double value = 3.14;
        value = value; // Noncompliant
    }
}
