public class ThreadRunCheck {

    // Noncompliant - Directly starting a thread without proper handling.
    public void nonCompliantExample1() {
        new Thread(() -> {
            System.out.println("Thread running");
        }).start();
    }

    // Noncompliant - Starting a thread inside a loop without managing thread lifecycle.
    public void nonCompliantExample2() {
        for (int i = 0; i < 5; i++) {
            final int threadId = i; // Make variable effectively final for lambda
            new Thread(() -> {
                System.out.println("Thread " + threadId + " running");
            }).start();
        }
    }

    // Compliant - Using an ExecutorService to manage threads.
    public void compliantExample1() {
        java.util.concurrent.ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(2);
        executor.submit(() -> {
            System.out.println("Thread running via ExecutorService");
        });
        executor.shutdown();
    }

    // Compliant - Using a thread pool and awaiting completion.
    public void compliantExample2() {
        java.util.concurrent.ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(1);
        java.util.concurrent.Future<?> future = executor.submit(() -> {
            System.out.println("Thread running and awaiting completion");
        });

        try {
            future.get(); // Wait for the thread to complete
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}
