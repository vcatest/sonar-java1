public class ThreadOverridesRunCheck {

    // Noncompliant - Overriding run() method without calling super.run()
    public class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("My thread is running");
        }
    }

    // Noncompliant - Overriding run() method without calling super.run()
    public class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("My runnable is running");
        }
    }

    // Compliant - Overriding run() method and calling super.run()
    public class MyThreadWithSuper extends Thread {
        @Override
        public void run() {
            super.run();
            System.out.println("My thread with super is running");
        }
    }

    // Compliant - Implementing Runnable and calling super.run() (though less common/useful)
    public class MyRunnableWithSuper implements Runnable {
        @Override
        public void run() {
            //super.run(); // Runnable doesn't have a super.run() method, so this is valid.
            System.out.println("My runnable with super is running");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new ThreadOverridesRunCheck().new MyThread();
        Thread t2 = new Thread();
        Runnable r1 = new ThreadOverridesRunCheck().new MyRunnable();
        Runnable r2 = new ThreadOverridesRunCheck().new MyRunnableWithSuper();
        Thread t3 = new Thread(r2);
        t1.start();
        t2.start();
        new Thread(r1).start();
        t3.start();
    }
}
