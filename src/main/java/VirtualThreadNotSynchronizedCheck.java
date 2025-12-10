import java.util.concurrent.atomic.AtomicInteger;

public class VirtualThreadNotSynchronizedCheck {

    // Noncompliant - Accessing shared mutable state without synchronization in a virtual thread.
    private int counter = 0;
    public void incrementCounterNoncompliant() {
        counter++;
    }

    // Noncompliant - Multiple virtual threads modifying the same mutable state without synchronization.
    private boolean flag = false;
    public void setFlagNoncompliant() {
        flag = true;
    }

    // Compliant - Using a thread-safe data structure (AtomicInteger)
    private AtomicInteger atomicCounter = new AtomicInteger(0);
    public void incrementAtomicCounterCompliant() {
        atomicCounter.incrementAndGet();
    }

    // Compliant - Using synchronized block to protect shared mutable state.
    private int synchronizedCounter = 0;
    public void incrementSynchronizedCounterCompliant() {
        synchronized (this) {
            synchronizedCounter++;
        }
    }
}
