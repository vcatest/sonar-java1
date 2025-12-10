public class ThreadLocalCleanupCheck {

    // Noncompliant - ThreadLocal not cleaned up in finally block
    public void example1() {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        threadLocal.set("Initial Value");
        try {
            // Some operation using threadLocal.get()
            System.out.println(threadLocal.get());
        } finally {
            // Missing threadLocal.remove();
        }
    }

    // Noncompliant - ThreadLocal not cleaned up even with exception
    public void example2() throws Exception {
        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
        threadLocal.set(10);
        try {
            if (true) {
                throw new Exception("Simulated Exception");
            }
            System.out.println(threadLocal.get());
        } finally {
            // Missing threadLocal.remove();
        }
    }

    // Compliant - ThreadLocal cleaned up in finally block
    public void example3() {
        ThreadLocal<Double> threadLocal = new ThreadLocal<>();
        threadLocal.set(3.14);
        try {
            System.out.println(threadLocal.get());
        } finally {
            threadLocal.remove();
        }
    }

    // Compliant - ThreadLocal cleaned up in finally block with exception handling
    public void example4() throws Exception {
        ThreadLocal<Boolean> threadLocal = new ThreadLocal<>();
        threadLocal.set(true);
        try {
            if (true) {
                throw new Exception("Another Simulated Exception");
            }
            System.out.println(threadLocal.get());
        } catch (Exception e) {
            System.err.println("Exception caught: " + e.getMessage());
        } finally {
            threadLocal.remove();
        }
    }

    public static void main(String[] args) throws Exception {
        ThreadLocalCleanupCheck test = new ThreadLocalCleanupCheck();
        test.example1();
        test.example2();
        test.example3();
        test.example4();
    }
}
