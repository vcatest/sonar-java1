public class EqualsOnAtomicClassCheck {

    // Noncompliant - Using equals() on an AtomicInteger
    public void testNoncompliant1() {
        java.util.concurrent.atomic.AtomicInteger ai1 = new java.util.concurrent.atomic.AtomicInteger(5);
        java.util.concurrent.atomic.AtomicInteger ai2 = new java.util.concurrent.atomic.AtomicInteger(5);
        boolean areEqual = ai1.equals(ai2); // Noncompliant
        System.out.println(areEqual);
    }

    // Noncompliant - Using equals() on an AtomicBoolean
    public void testNoncompliant2() {
        java.util.concurrent.atomic.AtomicBoolean ab1 = new java.util.concurrent.atomic.AtomicBoolean(true);
        java.util.concurrent.atomic.AtomicBoolean ab2 = new java.util.concurrent.atomic.AtomicBoolean(true);
        boolean areEqual = ab1.equals(ab2); // Noncompliant
        System.out.println(areEqual);
    }

    // Compliant - Using compareAndSet() on an AtomicInteger
    public void testCompliant1() {
        java.util.concurrent.atomic.AtomicInteger ai1 = new java.util.concurrent.atomic.AtomicInteger(5);
        java.util.concurrent.atomic.AtomicInteger ai2 = new java.util.concurrent.atomic.AtomicInteger(5);
        boolean success = ai1.compareAndSet(5, 10);
        System.out.println(success);
    }

    // Compliant - Using get() to compare values of AtomicLong
    public void testCompliant2() {
        java.util.concurrent.atomic.AtomicLong al1 = new java.util.concurrent.atomic.AtomicLong(10L);
        java.util.concurrent.atomic.AtomicLong al2 = new java.util.concurrent.atomic.AtomicLong(10L);
        boolean areEqual = al1.get() == al2.get();
        System.out.println(areEqual);
    }
}
