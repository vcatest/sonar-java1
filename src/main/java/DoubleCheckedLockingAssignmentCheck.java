public class DoubleCheckedLockingAssignmentCheck {

    private static DoubleCheckedLockingAssignmentCheck instance;

    // Noncompliant - Double-checked locking with potential issues
    public static DoubleCheckedLockingAssignmentCheck getInstanceNonCompliant1() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingAssignmentCheck.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingAssignmentCheck(); // Noncompliant
                }
            }
        }
        return instance;
    }

    // Noncompliant - Another example of double-checked locking
    private volatile static DoubleCheckedLockingAssignmentCheck instance2;
    public static DoubleCheckedLockingAssignmentCheck getInstanceNonCompliant2() {
        if (instance2 == null) {
            synchronized (DoubleCheckedLockingAssignmentCheck.class) {
                if (instance2 == null) {
                    instance2 = new DoubleCheckedLockingAssignmentCheck(); // Noncompliant
                }
            }
        }
        return instance2;
    }

    // Compliant - Using a static initializer
    private static final DoubleCheckedLockingAssignmentCheck instance3 = new DoubleCheckedLockingAssignmentCheck();
    public static DoubleCheckedLockingAssignmentCheck getInstanceCompliant1() {
        return instance3;
    }

    // Compliant - Using an enum
    private enum SingletonEnum {
        INSTANCE;

        public DoubleCheckedLockingAssignmentCheck getInstance() {
            return new DoubleCheckedLockingAssignmentCheck();
        }
    }

    public static DoubleCheckedLockingAssignmentCheck getInstanceCompliant2() {
        return SingletonEnum.INSTANCE.getInstance();
    }

    private DoubleCheckedLockingAssignmentCheck() {
        // Private constructor to prevent instantiation from outside
    }
}
