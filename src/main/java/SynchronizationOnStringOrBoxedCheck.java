public class SynchronizationOnStringOrBoxedCheck {

    // Noncompliant - Synchronizing on a String literal
    public void nonCompliantExample1() {
        String str = "hello";
        synchronized (str) {
            System.out.println("Synchronized on String");
        }
    }

    // Noncompliant - Synchronizing on a boxed Integer
    public void nonCompliantExample2() {
        Integer num = 10;
        synchronized (num) {
            System.out.println("Synchronized on Integer");
        }
    }

    // Compliant - Synchronizing on a dedicated lock object
    public void compliantExample1() {
        final Object lock = new Object();
        synchronized (lock) {
            System.out.println("Synchronized on Object");
        }
    }

    // Compliant - Synchronizing on the class object
    public void compliantExample2() {
        synchronized (SynchronizationOnStringOrBoxedCheck.class) {
            System.out.println("Synchronized on Class");
        }
    }

    // Noncompliant - Synchronizing on a String created from user input
    public void nonCompliantExample3(String userInput) {
        synchronized (userInput) {
            System.out.println("Synchronized on user input string");
        }
    }

    // Compliant - Synchronizing on a primitive int (although generally not recommended for complex scenarios)
    public void compliantExample3() {
        synchronized (new Object()) {
            System.out.println("Synchronized on new Object");
        }
    }
}
