public class DefaultEncodingUsageCheck {

    // Noncompliant - Hardcoded string literal without specifying encoding
    public void nonCompliantExample1() {
        String str = "This is a string";
        System.out.println(str);
    }

    // Noncompliant - Using String constructor without specifying encoding
    public void nonCompliantExample2() {
        String str = new String("Another string");
        System.out.println(str);
    }

    // Compliant - Using String constructor with explicit UTF-8 encoding
    public void compliantExample1() {
        String str = new String("This is a string", "UTF-8");
        System.out.println(str);
    }

    // Compliant - Using String constructor with explicit ISO-8859-1 encoding
    public void compliantExample2() {
        String str = new String("This is a string", "ISO-8859-1");
        System.out.println(str);
    }

    // Compliant - Reading from a resource bundle which implicitly handles encoding
    public void compliantExample3() {
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("messages");
        String message = bundle.getString("greeting");
        System.out.println(message);
    }

    // Noncompliant - Byte array to String conversion without encoding
    public void nonCompliantExample3() {
        byte[] bytes = {72, 101, 108, 108, 111};
        String str = new String(bytes); // Noncompliant
        System.out.println(str);
    }

    // Compliant - Byte array to String conversion with UTF-8 encoding
    public void compliantExample4() {
        byte[] bytes = {72, 101, 108, 108, 111};
        String str = new String(bytes, "UTF-8");
        System.out.println(str);
    }
}
