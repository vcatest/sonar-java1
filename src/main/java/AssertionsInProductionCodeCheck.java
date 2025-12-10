public class AssertionsInProductionCodeCheck {

    public static void main(String[] args) {
        // Noncompliant
        assert args != null;
        System.out.println("Program started");

        // Noncompliant
        assert true : "This should never happen!";
        int result = calculateSomething(5);
        System.out.println("Result: " + result);

        // Compliant
        if (args == null) {
            throw new IllegalArgumentException("Arguments cannot be null");
        }

        // Compliant
        boolean condition = false;
        if (condition) {
            System.out.println("Condition is true");
        } else {
            System.out.println("Condition is false");
        }
    }

    public static int calculateSomething(int input) {
        // Compliant
        if (input < 0) {
            throw new IllegalArgumentException("Input must be non-negative");
        }
        return input * 2;
    }
}
