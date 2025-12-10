public class IfElseIfStatementEndsWithElseCheck {

    public void nonCompliantExample1() {
        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        } else if (x < 5) {
            System.out.println("x is less than 5");
        } // Noncompliant
    }

    public void nonCompliantExample2() {
        String s = "hello";
        if (s.equals("world")) {
            System.out.println("s is world");
        } else if (s.equals("hello")) {
            System.out.println("s is hello");
        } // Noncompliant
    }

    public void compliantExample1() {
        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        } else if (x < 5) {
            System.out.println("x is less than 5");
        } else {
            System.out.println("x is neither greater than nor less than 5");
        }
    }

    public void compliantExample2() {
        String s = "hello";
        if (s.equals("world")) {
            System.out.println("s is world");
        } else if (s.equals("hello")) {
            System.out.println("s is hello");
        } else {
            System.out.println("s is neither world nor hello");
        }
    }
}
