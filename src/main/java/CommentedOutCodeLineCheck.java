public class CommentedOutCodeLineCheck {

    public void nonCompliantExamples() {
        // Noncompliant
        int x = 10; // This line is commented out but still present
        // Noncompliant
        String message = "Hello"; // This line is also commented out
        System.out.println("This is a valid line.");
    }

    public void compliantExamples() {
        int y = 20;
        String name = "World";
        System.out.println("This is another valid line.");
        // This is a comment, but no code is commented out on a line.
    }

    public void anotherNonCompliantExample() {
        // Noncompliant
        boolean isValid = true; // Commented out boolean
        int count = 0;
        System.out.println("Count: " + count);
    }

    public void anotherCompliantExample() {
        double pi = 3.14159;
        char initial = 'A';
        System.out.println("Pi: " + pi + ", Initial: " + initial);
    }
}
