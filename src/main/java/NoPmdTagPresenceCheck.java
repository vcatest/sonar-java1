public class NoPmdTagPresenceCheck {

    public void nonCompliantExample1() {
        // Noncompliant
        System.out.println("<tag>This is a test</tag>");
    }

    public void nonCompliantExample2() {
        String xml = "<root><child><tag>Value</tag></child></root>";
        // Noncompliant
        System.out.println(xml);
    }

    public void compliantExample1() {
        String message = "This is a valid string.";
        System.out.println(message);
    }

    public void compliantExample2() {
        int number = 123;
        System.out.println(number);
    }

    public void compliantExample3() {
        String json = "{ \"key\": \"value\" }";
        System.out.println(json);
    }
}
