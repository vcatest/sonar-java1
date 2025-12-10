public class ScheduledThreadPoolExecutorZeroCheck {

    // Noncompliant - Creating ScheduledThreadPoolExecutor with corePoolSize 0
    public void nonCompliantExample1() {
        java.util.concurrent.ScheduledThreadPoolExecutor executor = new java.util.concurrent.ScheduledThreadPoolExecutor(0);
    }

    // Noncompliant - Creating ScheduledThreadPoolExecutor with corePoolSize 0
    public void nonCompliantExample2() {
        java.util.concurrent.ScheduledThreadPoolExecutor executor = new java.util.concurrent.ScheduledThreadPoolExecutor(0, java.util.concurrent.Executors.defaultThreadFactory());
    }

    // Compliant - Creating ScheduledThreadPoolExecutor with corePoolSize > 0
    public void compliantExample1() {
        java.util.concurrent.ScheduledThreadPoolExecutor executor = new java.util.concurrent.ScheduledThreadPoolExecutor(1);
    }

    // Compliant - Creating ScheduledThreadPoolExecutor with corePoolSize > 0
    public void compliantExample2() {
        java.util.concurrent.ScheduledThreadPoolExecutor executor = new java.util.concurrent.ScheduledThreadPoolExecutor(5, java.util.concurrent.Executors.defaultThreadFactory());
    }

    public static void main(String[] args) {
        ScheduledThreadPoolExecutorZeroCheck test = new ScheduledThreadPoolExecutorZeroCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2();
        test.compliantExample1();
        test.compliantExample2();
    }
}
