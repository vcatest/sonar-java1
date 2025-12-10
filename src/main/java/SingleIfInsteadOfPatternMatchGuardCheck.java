public class SingleIfInsteadOfPatternMatchGuardCheck {

    // Noncompliant
    public void nonCompliantExample1(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            System.out.println(str.length());
        } else {
            System.out.println("Not a string");
        }
    }

    // Noncompliant
    public void nonCompliantExample2(Object obj) {
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            System.out.println(num + 10);
        } else {
            System.out.println("Not an integer");
        }
    }

    // Compliant
    public void compliantExample1(Object obj) {
        if (obj instanceof String str) {
            System.out.println(str.length());
        } else {
            System.out.println("Not a string");
        }
    }

    // Compliant
    public void compliantExample2(Object obj) {
        if (obj instanceof Integer num) {
            System.out.println(num + 10);
        } else {
            System.out.println("Not an integer");
        }
    }
}
