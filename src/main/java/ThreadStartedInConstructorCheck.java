public class ThreadStartedInConstructorCheck {

    // Noncompliant - Thread started directly in the constructor
    public class NonCompliantExample1 {
        private Thread thread;

        public NonCompliantExample1() {
            thread = new Thread(() -> {
                System.out.println("Thread running");
            });
            thread.start(); // Noncompliant
        }
    }

    // Noncompliant - Thread started in a helper method called from the constructor
    public class NonCompliantExample2 {
        private Thread thread;

        public NonCompliantExample2() {
            startThread();
        }

        private void startThread() {
            thread = new Thread(() -> {
                System.out.println("Thread running");
            });
            thread.start(); // Noncompliant
        }
    }

    // Compliant - Thread created in constructor, started later
    public class CompliantExample1 {
        private Thread thread;

        public CompliantExample1() {
            thread = new Thread(() -> {
                System.out.println("Thread running");
            });
        }

        public void startThreadLater() {
            thread.start();
        }
    }

    // Compliant - Thread started in a separate method, not called from constructor
    public class CompliantExample2 {
        private Thread thread;

        public CompliantExample2() {
            thread = new Thread(() -> {
                System.out.println("Thread running");
            });
        }

        public static void startThread() {
            Thread t = new Thread(() -> {
                System.out.println("Thread running");
            });
            t.start();
        }
    }
}
