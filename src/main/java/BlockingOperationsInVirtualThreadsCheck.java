public class BlockingOperationsInVirtualThreadsCheck {

    public void nonCompliantExample1() throws InterruptedException {
        Thread virtualThread = Thread.ofVirtualThread(Runnable::run);
        virtualThread.start();
        // Noncompliant
        Thread.sleep(1000);
        System.out.println("Virtual thread completed after blocking operation.");
    }

    public void nonCompliantExample2() throws InterruptedException {
        Thread virtualThread = Thread.ofVirtualThread(Runnable::run);
        virtualThread.start();
        // Noncompliant
        synchronized (this) {
            wait();
        }
        System.out.println("Virtual thread completed after blocking operation.");
    }

    public void compliantExample1() throws InterruptedException {
        Thread virtualThread = Thread.ofVirtualThread(Runnable::run);
        virtualThread.start();
        try {
            // Using a non-blocking alternative
            java.util.concurrent.CompletableFuture.delayed(1000, java.util.concurrent.TimeUnit.MILLISECONDS).get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Virtual thread completed without blocking operation.");
    }

    public void compliantExample2() {
        Thread virtualThread = Thread.ofVirtualThread(Runnable::run);
        virtualThread.start();
        // Using a non-blocking alternative - asynchronous operation
        java.util.concurrent.CompletableFuture.runAsync(() -> {
            // Perform some work
            System.out.println("Virtual thread completed asynchronous operation.");
        });
        System.out.println("Virtual thread started asynchronous operation.");
    }

    public static void main(String[] args) throws InterruptedException {
        BlockingOperationsInVirtualThreadsCheck test = new BlockingOperationsInVirtualThreadsCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2();
        test.compliantExample1();
        test.compliantExample2();
    }
}
