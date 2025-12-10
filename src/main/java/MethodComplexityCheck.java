public class MethodComplexityCheck {

    // Noncompliant - High cyclomatic complexity due to nested if-else statements
    public int exampleViolation1(int a, int b, int c) {
        if (a > 0) {
            if (b < 0) {
                if (c == 0) {
                    return 1;
                } else {
                    return 2;
                }
            } else {
                return 3;
            }
        } else {
            return 4;
        }
    }

    // Noncompliant - High cyclomatic complexity due to multiple switch cases and a default case
    public String exampleViolation2(int input) {
        String result = "";
        switch (input) {
            case 1:
                result = "One";
                break;
            case 2:
                result = "Two";
                break;
            case 3:
                result = "Three";
                break;
            case 4:
                result = "Four";
                break;
            default: // Noncompliant
                result = "Other";
        }
        return result;
    }

    // Compliant - Simple method with a single return statement
    public boolean exampleCompliance1(boolean condition) {
        return condition;
    }

    // Compliant - Method with a few simple operations and a single return statement
    public int exampleCompliance2(int x, int y) {
        int sum = x + y;
        int difference = x - y;
        return sum * difference;
    }

    // Compliant - Method with a single if-else block, still within acceptable complexity
    public String exampleCompliance3(int value) {
        if (value > 10) {
            return "Greater than 10";
        } else {
            return "Less than or equal to 10";
        }
    }
}
