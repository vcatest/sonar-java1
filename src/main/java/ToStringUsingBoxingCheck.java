public class ToStringUsingBoxingCheck {

    // Noncompliant
    public String nonCompliantExample1() {
        Integer i = 5;
        return "Value: " + i.toString();
    }

    // Noncompliant
    public String nonCompliantExample2() {
        Double d = 3.14;
        return "Pi: " + d.toString();
    }

    // Compliant
    public String compliantExample1() {
        Integer i = 5;
        return "Value: " + String.valueOf(i);
    }

    // Compliant
    public String compliantExample2() {
        Double d = 3.14;
        return "Pi: " + String.valueOf(d);
    }

    // Compliant - using concatenation directly with primitive
    public String compliantExample3() {
        int x = 10;
        return "X: " + x;
    }

    // Noncompliant - even though it's a local variable, the rule still applies
    public String nonCompliantExample3() {
        Long l = 12345L;
        String result = "Long value: " + l.toString();
        return result;
    }
}
