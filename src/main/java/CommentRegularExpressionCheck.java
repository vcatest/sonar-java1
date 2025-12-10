public class CommentRegularExpressionCheck {

    public void nonCompliantExample1() {
        // TODO: This is a bad comment with a regex pattern: [a-z]+
        System.out.println("Noncompliant");
    }

    public void nonCompliantExample2() {
        // FIXME: Another comment containing a regex: \d{3}-\d{2}-\d{4}
        String message = "Noncompliant";
        System.out.println(message);
    }

    public void compliantExample1() {
        // This is a normal comment.
        System.out.println("Compliant");
    }

    public void compliantExample2() {
        // A comment with some text and numbers, but no regex. 12345
        String value = "Compliant";
        System.out.println(value);
    }

    public void nonCompliantExample3() {
        // TODO: Check this: ^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$
        System.out.println("Noncompliant");
    }

    public void compliantExample3() {
        // This comment is fine.
        int x = 10;
        System.out.println(x);
    }
}
