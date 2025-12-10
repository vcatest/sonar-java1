public class ThreadSleepCheck {

    public void nonCompliantExample1() {
        try {
            Thread.sleep(1000); // Noncompliant
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void nonCompliantExample2(long sleepTime) {
        try {
            Thread.sleep(sleepTime); // Noncompliant
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void compliantExample1() {
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < 1000) {
            // Do something else
        }
    }

    public void compliantExample2() {
        try {
            Thread.sleep(0); //This is acceptable as it doesn't actually sleep
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        ThreadSleepCheck test = new ThreadSleepCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2(500);
        test.compliantExample1();
        test.compliantExample2();
    }
}
