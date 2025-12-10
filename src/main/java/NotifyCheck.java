public class NotifyCheck {

    // Noncompliant - Using System.out.println for notification.  Should use a logging framework.
    public void nonCompliantExample1() {
        System.out.println("Important information!");
    }

    // Noncompliant - Directly printing to console in a critical section.
    public void nonCompliantExample2(boolean condition) {
        if (condition) {
            System.out.println("Error occurred!");
        }
    }

    // Compliant - Using a logging framework (e.g., SLF4J)
    private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(NotifyCheck.class);
    public void compliantExample1() {
        logger.info("Information logged using SLF4J.");
    }

    // Compliant - Using a logging framework with error level.
    public void compliantExample2(int value) {
        if (value < 0) {
            logger.error("Invalid value: " + value);
        }
    }

    public static void main(String[] args) {
        NotifyCheck check = new NotifyCheck();
        check.nonCompliantExample1();
        check.nonCompliantExample2(true);
        check.compliantExample1();
        check.compliantExample2(-5);
    }
}
