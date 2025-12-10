public class StringLiteralDuplicatedCheck {

    public void nonCompliantExample1() {
        String message = "Hello"; // Noncompliant
        System.out.println("Hello"); // Noncompliant
    }

    public void nonCompliantExample2() {
        String key = "user.name"; // Noncompliant
        System.out.println("user.name"); // Noncompliant
    }

    public void compliantExample1() {
        String message = "World";
        System.out.println(message);
    }

    public void compliantExample2() {
        String key = "database.url";
        System.out.println(key);
    }

    public void compliantExample3() {
        String a = "test";
        String b = "test";
        if (a.equals(b)) {
            System.out.println("Equal");
        }
    }

    public void nonCompliantExample3() {
        String constant = "value"; // Noncompliant
        if ("value".equals(constant)) { // Noncompliant
            System.out.println("Equal");
        }
    }
}
