public class VirtualThreadUnsupportedMethodsCheck {

    public static void main(String[] args) {
        // Noncompliant - Thread.currentThread() is not supported in Virtual Threads
        Thread currentThread = Thread.currentThread();
        System.out.println("Current thread: " + currentThread.getName());

        // Noncompliant - Thread.getAllStackTraces() is not supported in Virtual Threads
        Thread.getAllStackTraces();

        // Compliant - Using Thread.ofVirtual() to create a virtual thread
        Thread virtualThread = Thread.ofVirtual().start(() -> {
            System.out.println("Virtual thread running");
        });

        // Compliant - Using ExecutorService to manage threads (works with virtual threads)
        java.util.concurrent.ExecutorService executor = java.util.concurrent.Executors.newVirtualThreadPerTaskExecutor();
        executor.submit(() -> {
            System.out.println("Task running in virtual thread");
        });
        executor.shutdown();
    }
}
