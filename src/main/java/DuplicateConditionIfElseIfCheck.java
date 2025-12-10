public class DuplicateConditionIfElseIfCheck {

    // Noncompliant
    public void example1(int value) {
        if (value > 10) {
            System.out.println("Value is greater than 10");
        } else if (value > 10) { // Noncompliant
            System.out.println("This should not be reached");
        } else {
            System.out.println("Value is less than or equal to 10");
        }
    }

    // Noncompliant
    public void example2(String input) {
        if (input.equals("abc")) {
            System.out.println("Input is abc");
        } else if (input.equals("abc")) { // Noncompliant
            System.out.println("This won't be printed");
        } else if (input.equals("def")) {
            System.out.println("Input is def");
        } else {
            System.out.println("Input is something else");
        }
    }

    // Compliant
    public void example3(int value) {
        if (value > 10) {
            System.out.println("Value is greater than 10");
        } else if (value == 10) {
            System.out.println("Value is equal to 10");
        } else {
            System.out.println("Value is less than 10");
        }
    }

    // Compliant
    public void example4(String input) {
        if (input.equals("abc")) {
            System.out.println("Input is abc");
        } else if (input.equals("def")) {
            System.out.println("Input is def");
        } else {
            System.out.println("Input is something else");
        }
    }
}
