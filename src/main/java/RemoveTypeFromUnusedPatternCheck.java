public class RemoveTypeFromUnusedPatternCheck {

    // Noncompliant
    public void nonCompliantExample1() {
        String str = "hello";
        if (str instanceof String) {
            System.out.println("It's a string");
        }
    }

    // Noncompliant
    public void nonCompliantExample2() {
        Object obj = new Object();
        if (obj instanceof Object) {
            System.out.println("It's an object");
        }
    }

    // Compliant
    public void compliantExample1() {
        String str = "hello";
        if (str != null) {
            System.out.println("It's not null");
        }
    }

    // Compliant
    public void compliantExample2() {
        Object obj = new Object();
        if (obj != null) {
            System.out.println("It's not null");
        }
    }

    // Compliant
    public void compliantExample3() {
        String str = "hello";
        if ("hello".equals(str)) {
            System.out.println("It's hello");
        }
    }
}
