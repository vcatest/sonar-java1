public class FixmeTagPresenceCheck {

    // Noncompliant
    public void nonCompliantExample1() {
        // FIXME: This is a fixme tag.
        System.out.println("This is a test.");
    }

    // Noncompliant
    public void nonCompliantExample2() {
        int x = 10;
        //FIXME Need to revisit this logic
        if (x > 5) {
            System.out.println("x is greater than 5");
        }
    }

    public void compliantExample1() {
        System.out.println("This is a test.");
    }

    public void compliantExample2() {
        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        }
    }

    public void compliantExample3() {
        // TODO: Implement this method.
        System.out.println("This is a todo.");
    }

    public void compliantExample4() {
        // This is a comment.
        System.out.println("This is a test.");
    }
}
