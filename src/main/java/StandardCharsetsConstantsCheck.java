public class StandardCharsetsConstantsCheck {

    public void nonCompliantExample1() {
        String str = new String("Hello".getBytes("UTF-8"), "UTF-8"); // Noncompliant
    }

    public void nonCompliantExample2() {
        byte[] bytes = "World".getBytes("ISO-8859-1"); // Noncompliant
        String str = new String(bytes);
    }

    public void compliantExample1() {
        String str = new String("Hello".getBytes(java.nio.charset.StandardCharsets.UTF_8), java.nio.charset.StandardCharsets.UTF_8.toString());
    }

    public void compliantExample2() {
        byte[] bytes = "World".getBytes(java.nio.charset.StandardCharsets.UTF_8);
        String str = new String(bytes, java.nio.charset.StandardCharsets.UTF_8);
    }

    public void compliantExample3() {
        String str = new String("Test".getBytes(java.nio.charset.StandardCharsets.UTF_16), java.nio.charset.StandardCharsets.UTF_16.toString());
    }

    public void compliantExample4() {
        byte[] bytes = "Another".getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        String str = new String(bytes, java.nio.charset.StandardCharsets.US_ASCII);
    }
}
