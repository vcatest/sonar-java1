public class LoggerClassCheck {

    // Noncompliant - using Log4j logger
    private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(LoggerClassCheck.class);

    public void nonCompliantExample1() {
        // logger.info("This is a log message."); // commented out since logger is commented
    }

    // Noncompliant
    private static final java.util.logging.Logger logger2 = java.util.logging.Logger.getLogger(LoggerClassCheck.class.getName());

    public void nonCompliantExample2() {
        logger2.info("Another log message.");
    }

    // Compliant - using SLF4J (commented out for compilation)
    // private static final org.slf4j.Logger logger3 = org.slf4j.LoggerFactory.getLogger(LoggerClassCheck.class);

    public void compliantExample1() {
        // logger3.info("This is a log message using SLF4J."); // commented out
    }

    // Compliant - using Commons Logging (commented out for compilation)
    // private static final org.apache.commons.logging.Log logger4 = org.apache.commons.logging.LogFactory.getLog(LoggerClassCheck.class);

    public void compliantExample2() {
        // logger4.info("This is a log message using Commons Logging."); // commented out
    }
}
