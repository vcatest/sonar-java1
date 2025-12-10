public class TrailingCommentCheck {

    public void nonCompliantExample1() {
        int x = 10; // Noncompliant
    }

    public void nonCompliantExample2() {
        String message = "Hello"; // Noncompliant
        System.out.println(message);
    }

    public void compliantExample1() {
        int y = 20;
    }

    public void compliantExample2() {
        String greeting = "World";
        System.out.println(greeting);
    }

    public void compliantExample3() {
        int z = 30;
        //This is a comment on a new line.
    }

    public void nonCompliantExample3() {
        boolean flag = true; // Noncompliant
        if (flag) {
            System.out.println("Flag is true");
        }
    }
}
