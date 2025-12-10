public class SystemOutOrErrUsageCheck {

    public void nonCompliantExample1() {
        System.out.println("This is a noncompliant example."); // Noncompliant
    }

    public void nonCompliantExample2() {
        System.err.println("Error message to stderr."); // Noncompliant
    }

    public void nonCompliantExample3() {
        System.out.printf("Formatted output: %s%n", "Hello"); // Noncompliant
    }

    public void compliantExample1() {
        java.util.logging.Logger.getLogger(getClass().getName()).info("This is a compliant example using Logger.");
    }

    public void compliantExample2() {
        org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(SystemOutOrErrUsageCheck.class);
        logger.info("This is a compliant example using SLF4J.");
    }

    public void compliantExample3() {
        //Using a proper logging framework is compliant.
        android.util.Log.d("MyTag", "This is a compliant example using Android logging.");
    }

    public static void main(String[] args) {
        SystemOutOrErrUsageCheck test = new SystemOutOrErrUsageCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2();
        test.nonCompliantExample3();
        test.compliantExample1();
        test.compliantExample2();
        test.compliantExample3();
    }
}
