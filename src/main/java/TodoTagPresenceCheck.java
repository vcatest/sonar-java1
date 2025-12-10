public class TodoTagPresenceCheck {

    public void nonCompliantExample1() {
        // TODO: This is a task to be done.
        System.out.println("Doing something..."); // Noncompliant
    }

    public void nonCompliantExample2() {
        //todo fix this later
        int x = 10; // Noncompliant
    }

    public void compliantExample1() {
        // FIX: This is a task to be done.
        System.out.println("Doing something...");
    }

    public void compliantExample2() {
        // IMPLEMENT: This is a task to be done.
        int y = 20;
    }

    public void compliantExample3() {
        // REVIEW: This is a task to be done.
        String message = "Hello";
    }

    public void nonCompliantExample3() {
        //tODO: Refactor this code
        String name = "Test"; // Noncompliant
    }
}
