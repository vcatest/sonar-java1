public class ReturnOfBooleanExpressionsCheck {

    // Noncompliant
    public boolean nonCompliantExample1(boolean condition) {
        return condition == true;
    }

    // Noncompliant
    public boolean nonCompliantExample2(int value) {
        return value > 0 == false;
    }

    // Compliant
    public boolean compliantExample1(boolean condition) {
        return condition;
    }

    // Compliant
    public boolean compliantExample2(int value) {
        return value > 0;
    }

    public boolean compliantExample3(boolean a, boolean b) {
        return a && b;
    }

    // Noncompliant
    public boolean nonCompliantExample3(String str) {
        return str != null == false;
    }
}
