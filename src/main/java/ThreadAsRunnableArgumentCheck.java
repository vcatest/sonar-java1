public class ThreadAsRunnableArgumentCheck {

    // Noncompliant
    public void nonCompliantExample1() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running");
            }
        });
        t.start(); // Noncompliant
    }

    // Noncompliant
    public void nonCompliantExample2(Runnable r) {
        Thread t = new Thread(r);
        new Thread(t).start(); // Noncompliant
    }

    // Compliant
    public void compliantExample1() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running");
            }
        };
        Thread t = new Thread(runnable);
        t.start();
    }

    // Compliant
    public void compliantExample2(Runnable runnable) {
        Thread t = new Thread(runnable);
        t.start();
    }

    public static void main(String[] args) {
        ThreadAsRunnableArgumentCheck test = new ThreadAsRunnableArgumentCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2(null);
        test.compliantExample1();
        test.compliantExample2(null);
    }
}
