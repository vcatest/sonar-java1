public class WaitInWhileLoopCheck {

    // Noncompliant example 1
    public void nonCompliantExample1() {
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < 5000) {
            try {
                Thread.sleep(100); // Noncompliant
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    // Noncompliant example 2
    public void nonCompliantExample2() {
        boolean condition = false;
        long startTime = System.currentTimeMillis();
        while (!condition && System.currentTimeMillis() - startTime < 10000) {
            try {
                Thread.sleep(50); // Noncompliant
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            condition = checkSomeCondition();
        }
    }

    private boolean checkSomeCondition() {
        return false;
    }

    // Compliant example 1
    public void compliantExample1() {
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < 5000) {
            // Do some work
            processData();
        }
    }

    private void processData() {
        // Simulate some processing
    }

    // Compliant example 2
    public void compliantExample2() {
        boolean condition = false;
        long startTime = System.currentTimeMillis();
        while (!condition && System.currentTimeMillis() - startTime < 10000) {
            condition = checkSomeCondition();
            if (!condition) {
                // Do some other work
                performAlternativeTask();
            }
        }
    }

    private void performAlternativeTask() {
        // Simulate alternative task
    }
}
