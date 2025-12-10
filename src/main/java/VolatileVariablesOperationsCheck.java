public class VolatileVariablesOperationsCheck {

    private static volatile int sharedVariable = 0;
    private static int nonVolatileVariable = 0;

    public void nonCompliantExample1() {
        sharedVariable++; // Noncompliant
        System.out.println("Noncompliant Example 1: " + sharedVariable);
    }

    public void nonCompliantExample2() {
        int temp = sharedVariable; // Noncompliant
        temp = temp + 1;
        sharedVariable = temp;
        System.out.println("Noncompliant Example 2: " + sharedVariable);
    }

    public void compliantExample1() {
        synchronized (this) {
            sharedVariable++;
            System.out.println("Compliant Example 1: " + sharedVariable);
        }
    }

    public void compliantExample2() {
        int temp = sharedVariable;
        synchronized (this) {
            temp = temp + 1;
            sharedVariable = temp;
            System.out.println("Compliant Example 2: " + sharedVariable);
        }
    }

    public void compliantExample3() {
        sharedVariable = java.util.concurrent.atomic.AtomicInteger.getAndIncrement(new java.util.concurrent.atomic.AtomicInteger(sharedVariable));
        System.out.println("Compliant Example 3: " + sharedVariable);
    }

    public void compliantExample4() {
        nonVolatileVariable++;
        System.out.println("Compliant Example 4: " + nonVolatileVariable);
    }
}
