public class AllBranchesAreIdenticalCheck {

    // Noncompliant - All branches in this if statement are identical.
    public void example1Noncompliant(boolean condition) {
        if (condition) {
            System.out.println("This will always execute");
        } else {
            System.out.println("This will always execute"); // Noncompliant
        }
    }

    // Noncompliant - All branches in this if statement are identical.
    public void example2Noncompliant(int value) {
        if (value > 0) {
            System.out.println("Value is positive");
        } else {
            System.out.println("Value is positive"); // Noncompliant
        }
    }

    // Compliant - Branches are different.
    public void example3Compliant(boolean condition) {
        if (condition) {
            System.out.println("Condition is true");
        } else {
            System.out.println("Condition is false");
        }
    }

    // Compliant - Branches are different.
    public void example4Compliant(int value) {
        if (value > 0) {
            System.out.println("Value is positive");
        } else {
            System.out.println("Value is non-positive");
        }
    }

    // Compliant - No if/else statement.
    public void example5Compliant() {
        System.out.println("This is a simple statement");
    }
}
