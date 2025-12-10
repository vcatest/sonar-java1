public class DisallowedThreadGroupCheck {

    // Noncompliant
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("MyThreadGroup");
        Thread t = new Thread(tg, new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread running in MyThreadGroup");
            }
        });
        t.start();
    }

    // Noncompliant
    public void createAndStartThread() {
        ThreadGroup myGroup = new ThreadGroup("AnotherGroup");
        new Thread(myGroup, () -> System.out.println("Running in AnotherGroup")).start();
    }

    // Compliant
    public void useDefaultThreadGroup() {
        Thread t = new Thread(() -> System.out.println("Running in default thread group"));
        t.start();
    }

    // Compliant
    public void useExecutorService() {
        java.util.concurrent.ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(1);
        executor.submit(() -> System.out.println("Running in executor thread"));
        executor.shutdown();
    }
}
