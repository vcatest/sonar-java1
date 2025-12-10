public class CollapsibleIfCandidateCheck {

    // Noncompliant
    public void example1() {
        boolean condition1 = true;
        boolean condition2 = false;

        if (condition1) {
            if (condition2) {
                System.out.println("Both true");
            } else {
                System.out.println("condition1 true, condition2 false"); // Noncompliant
            }
        } else {
            System.out.println("condition1 false");
        }
    }

    // Noncompliant
    public void example2() {
        int x = 5;
        if (x > 0) {
            if (x < 10) {
                System.out.println("x is between 0 and 10"); // Noncompliant
            } else {
                System.out.println("x is greater than or equal to 10");
            }
        } else {
            System.out.println("x is not positive");
        }
    }

    // Compliant
    public void example3() {
        boolean condition1 = true;
        boolean condition2 = false;

        if (condition1 && condition2) {
            System.out.println("Both true");
        } else {
            System.out.println("condition1 true, condition2 false");
        }
    }

    // Compliant
    public void example4() {
        int x = 5;
        if (x > 0 && x < 10) {
            System.out.println("x is between 0 and 10");
        } else {
            System.out.println("x is not between 0 and 10");
        }
    }

    // Compliant - already a single if statement
    public void example5() {
        if (true) {
            System.out.println("This is a simple if statement");
        }
    }

    // Compliant - if/else if/else chain
    public void example6() {
        int value = 2;
        if (value == 1) {
            System.out.println("Value is 1");
        } else if (value == 2) {
            System.out.println("Value is 2");
        } else {
            System.out.println("Value is something else");
        }
    }
}
