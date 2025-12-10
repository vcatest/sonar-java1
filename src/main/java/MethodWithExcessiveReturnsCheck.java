public class MethodWithExcessiveReturnsCheck {

    // Noncompliant - Excessive number of return statements
    public int exampleOne(int x) {
        if (x > 0) {
            return 1; // Noncompliant
        } else if (x < 0) {
            return -1; // Noncompliant
        } else {
            return 0; // Noncompliant
        }
    }

    // Noncompliant - Multiple return statements within nested if-else blocks
    public String exampleTwo(boolean condition1, boolean condition2) {
        if (condition1) {
            if (condition2) {
                return "A"; // Noncompliant
            } else {
                return "B"; // Noncompliant
            }
        } else {
            return "C"; // Noncompliant
        }
    }

    // Compliant - Single return statement
    public double exampleThree(double y) {
        double result = y * 2;
        return result;
    }

    // Compliant - Return statement at the end of the method
    public boolean exampleFour(int a, int b) {
        int sum = a + b;
        if (sum > 10) {
            return true;
        } else {
            return false;
        }
    }
}
