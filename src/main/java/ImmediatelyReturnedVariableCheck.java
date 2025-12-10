public class ImmediatelyReturnedVariableCheck {

    // Noncompliant
    public int example1() {
        int x = 10;
        // Noncompliant
        return x;
    }

    // Noncompliant
    public String example2() {
        String message = "Hello";
        // Noncompliant
        return message;
    }

    // Compliant
    public int example3() {
        int x = 10;
        x = x + 5;
        return x;
    }

    // Compliant
    public String example4() {
        String message = "Hello";
        message = message + " World";
        return message;
    }

    // Compliant
    public int example5() {
        int x = 10;
        if (x > 5) {
            return x;
        } else {
            return 0;
        }
    }

    // Compliant
    public String example6() {
        String message = "Hello";
        if (message.length() > 5) {
            return message;
        } else {
            return "Short";
        }
    }
}
