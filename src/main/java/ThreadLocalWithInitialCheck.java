public class ThreadLocalWithInitialCheck {

    // Noncompliant - ThreadLocal initialized directly without a check for initial value
    private static ThreadLocal<String> threadLocal1 = new ThreadLocal<>();

    public String getValue1() {
        return threadLocal1.get();
    }

    // Noncompliant - ThreadLocal initialized directly without a check for initial value
    private static ThreadLocal<Integer> threadLocal2 = new ThreadLocal<>();

    public Integer getValue2() {
        return threadLocal2.get();
    }

    // Compliant - ThreadLocal initialized with a lambda providing an initial value
    private static ThreadLocal<String> threadLocal3 = ThreadLocal.withInitial(() -> "default value");

    public String getValue3() {
        return threadLocal3.get();
    }

    // Compliant - ThreadLocal initialized with a Supplier providing an initial value
    private static ThreadLocal<Integer> threadLocal4 = ThreadLocal.withInitial(SupplierUtil::getDefaultInteger);

    public Integer getValue4() {
        return threadLocal4.get();
    }

    static class SupplierUtil {
        public static Integer getDefaultInteger() {
            return 0;
        }
    }
}
