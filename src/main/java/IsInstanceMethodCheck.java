public class IsInstanceMethodCheck {

    // Noncompliant
    public void nonCompliantExample1(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj; // Noncompliant
            System.out.println(str.length());
        }
    }

    // Noncompliant
    public void nonCompliantExample2(Object obj) {
        if (obj instanceof Integer) {
            Integer num = (Integer) obj; // Noncompliant
            System.out.println(num + 10);
        }
    }

    // Compliant
    public void compliantExample1(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            System.out.println(str.length());
        } else {
            System.out.println("Object is not a String");
        }
    }

    // Compliant
    public void compliantExample2(Object obj) {
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            System.out.println(num + 10);
        } else {
            System.out.println("Object is not an Integer");
        }
    }

    public static void main(String[] args) {
        IsInstanceMethodCheck check = new IsInstanceMethodCheck();
        check.nonCompliantExample1("hello");
        check.nonCompliantExample2(123);
        check.compliantExample1("world");
        check.compliantExample2(456);
        check.compliantExample1(123);
        check.compliantExample2("abc");
    }
}
