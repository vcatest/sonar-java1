public class StringLiteralInsideEqualsCheck {

    public void nonCompliantExample1() {
        String message = "Hello" == "World"; // Noncompliant
        System.out.println(message);
    }

    public void nonCompliantExample2() {
        if ("test" == "example") { // Noncompliant
            System.out.println("Condition is true");
        }
    }

    public void compliantExample1() {
        String message = "Hello";
        String otherMessage = "World";
        boolean areEqual = message.equals(otherMessage);
        System.out.println(areEqual);
    }

    public void compliantExample2() {
        String test = "test";
        String example = "example";
        if (test.equals(example)) {
            System.out.println("Condition is true");
        }
    }

    public void compliantExample3() {
        String str1 = new String("abc");
        String str2 = new String("abc");
        boolean isEqual = str1.equals(str2);
        System.out.println(isEqual);
    }
}
