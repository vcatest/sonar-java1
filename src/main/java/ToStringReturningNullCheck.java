public class ToStringReturningNullCheck {

    // Noncompliant - toString() can return null, leading to NullPointerException
    public void nonCompliantExample1(Object obj) {
        String str = obj.toString();
        System.out.println(str.length()); // Noncompliant
    }

    // Noncompliant - toString() can return null, leading to NullPointerException
    public void nonCompliantExample2(Object obj) {
        if (obj != null) {
            String str = obj.toString();
            System.out.println("String: " + str.toUpperCase()); // Noncompliant
        }
    }

    // Compliant - Check for null before using the result of toString()
    public void compliantExample1(Object obj) {
        String str = obj == null ? "" : obj.toString();
        System.out.println(str.length());
    }

    // Compliant - Check for null before using the result of toString()
    public void compliantExample2(Object obj) {
        String str = obj == null ? null : obj.toString();
        if (str != null) {
            System.out.println("String: " + str.toUpperCase());
        }
    }

    // Compliant - Using Optional to handle potential null from toString()
    public void compliantExample3(Object obj) {
        java.util.Optional<String> optionalString = java.util.Optional.ofNullable(obj).map(Object::toString);
        optionalString.ifPresent(str -> System.out.println(str.length()));
    }

    // Compliant - Using a default value if toString() returns null
    public void compliantExample4(Object obj) {
        String str = (obj != null) ? obj.toString() : "default";
        System.out.println(str.length());
    }
}
