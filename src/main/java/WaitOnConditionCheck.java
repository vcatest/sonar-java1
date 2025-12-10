public class WaitOnConditionCheck {

    // Noncompliant - Using a simple while loop without a timeout or interruption check.
    public void nonCompliantExample1() {
        boolean condition = false;
        while (!condition) {
            // Do something
            condition = true; // Simulate condition becoming true eventually
        }
    }

    // Noncompliant -  Similar to example 1, but with a more complex condition. Still lacks timeout/interruption.
    public void nonCompliantExample2() {
        int counter = 0;
        while (counter < 1000) {
            // Do something
            counter++;
            if (counter == 500) {
                //Simulate a condition being met
                break;
            }
        }
    }

    // Compliant - Using a timed wait with a timeout.
    public void compliantExample1() throws InterruptedException {
        boolean condition = false;
        long startTime = System.currentTimeMillis();
        long timeout = 5000; // 5 seconds
        while (!condition && (System.currentTimeMillis() - startTime) < timeout) {
            // Do something
            condition = true; // Simulate condition becoming true eventually
            Thread.sleep(100); // Allow other threads to run
        }
        if (!condition) {
            // Handle timeout
            System.out.println("Timeout occurred!");
        }
    }

    // Compliant - Using a timed wait with interruption check.
    public void compliantExample2() throws InterruptedException {
        boolean condition = false;
        long startTime = System.currentTimeMillis();
        long timeout = 5000; // 5 seconds
        while (!condition && (System.currentTimeMillis() - startTime) < timeout) {
            // Do something
            condition = true; // Simulate condition becoming true eventually
            if (Thread.currentThread().isInterrupted()) {
                // Handle interruption
                System.out.println("Interrupted!");
                return;
            }
            Thread.sleep(100); // Allow other threads to run
        }
        if (!condition) {
            // Handle timeout
            System.out.println("Timeout occurred!");
        }
    }
}
