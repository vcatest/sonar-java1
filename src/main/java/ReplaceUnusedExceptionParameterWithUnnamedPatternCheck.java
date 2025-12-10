public class ReplaceUnusedExceptionParameterWithUnnamedPatternCheck {

    // Noncompliant
    public void example1() {
        try {
            // Some code that might throw an exception
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage()); // Noncompliant
        }
    }

    // Noncompliant
    public void example2() {
        try {
            // Some code that might throw an exception
        } catch (IllegalArgumentException e) {
            e.printStackTrace(); // Noncompliant
        }
    }

    // Compliant
    public void example3() {
        try {
            // Some code that might throw an exception
        } catch (Exception e) {
            System.err.println("An error occurred.");
        }
    }

    // Compliant
    public void example4() {
        try {
            // Some code that might throw an exception
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReplaceUnusedExceptionParameterWithUnnamedPatternCheck test = new ReplaceUnusedExceptionParameterWithUnnamedPatternCheck();
        test.example1();
        test.example2();
        test.example3();
        test.example4();
    }
}
