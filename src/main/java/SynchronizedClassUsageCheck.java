public class SynchronizedClassUsageCheck {

    // Noncompliant - Using synchronized keyword on a class declaration.
    synchronized class InnerSynchronizedClass {
        public void doSomething() {
            System.out.println("Inner class synchronized");
        }
    }

    // Noncompliant - Another example of synchronized class declaration.
    synchronized static class StaticInnerSynchronizedClass {
        public void doSomethingElse() {
            System.out.println("Static inner class synchronized");
        }
    }

    // Compliant - No synchronized keyword used on the class declaration.
    class NormalInnerClass {
        public void doSomethingNormal() {
            System.out.println("Normal inner class");
        }
    }

    // Compliant - Static inner class without synchronized keyword.
    static class NormalStaticInnerClass {
        public void doSomethingStaticNormal() {
            System.out.println("Normal static inner class");
        }
    }

    public static void main(String[] args) {
        SynchronizedClassUsageCheck outer = new SynchronizedClassUsageCheck();
        InnerSynchronizedClass innerSync = outer.new InnerSynchronizedClass();
        innerSync.doSomething();

        StaticInnerSynchronizedClass staticInnerSync = new StaticInnerSynchronizedClass();
        staticInnerSync.doSomethingElse();

        NormalInnerClass normalInner = outer.new NormalInnerClass();
        normalInner.doSomethingNormal();

        NormalStaticInnerClass normalStaticInner = new NormalStaticInnerClass();
        normalStaticInner.doSomethingStaticNormal();
    }
}
