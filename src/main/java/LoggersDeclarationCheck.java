public class LoggersDeclarationCheck {

    // Noncompliant
    private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(LoggersDeclarationCheck.class);

    public void nonCompliantExample1() {
        logger.info("This is a log message.");
    }

    // Noncompliant
    private static final java.util.logging.Logger logger2 = java.util.logging.Logger.getLogger(LoggersDeclarationCheck.class.getName());

    public void nonCompliantExample2() {
        logger2.info("Another log message.");
    }

    // Compliant
    private static final org.slf4j.Logger logger3 = org.slf4j.LoggerFactory.getLogger(LoggersDeclarationCheck.class);

    public void compliantExample1() {
        logger3.info("This is a log message using SLF4J.");
    }

    // Compliant
    private static final org.apache.commons.logging.Log logger4 = org.apache.commons.logging.LogFactory.getLog(LoggersDeclarationCheck.class);

    public void compliantExample2() {
        logger4.info("This is a log message using Commons Logging.");
    }
}
