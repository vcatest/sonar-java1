public class InstanceOfPatternMatchingCheck {

    public void nonCompliantExample1(Object obj) {
        if (obj instanceof String s) { // Noncompliant
            System.out.println(s.length());
        }
    }

    public void nonCompliantExample2(Object obj) {
        if (obj instanceof java.util.List<?> list) { // Noncompliant
            for (Object item : list) {
                System.out.println(item);
            }
        }
    }

    public void compliantExample1(Object obj) {
        if (obj instanceof String) {
            String s = (String) obj;
            System.out.println(s.length());
        }
    }

    public void compliantExample2(Object obj) {
        if (obj instanceof java.util.List<?>) {
            java.util.List<?> list = (java.util.List<?>) obj;
            for (Object item : list) {
                System.out.println(item);
            }
        }
    }

    public void compliantExample3(Object obj) {
        if (obj instanceof Integer i) {
            System.out.println(i + 1);
        }
    }

    public void nonCompliantExample3(Object obj) {
        if (obj instanceof Number n) { // Noncompliant
            System.out.println(n.doubleValue());
        }
    }
}
