public class DisallowedClassCheck {

    // Noncompliant - Using java.util.Date directly
    java.util.Date date = new java.util.Date();

    // Noncompliant - Using java.sql.Date directly
    java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());

    // Compliant - Using LocalDate from java.time
    java.time.LocalDate localDate = java.time.LocalDate.now();

    // Compliant - Using OffsetDateTime from java.time
    java.time.OffsetDateTime offsetDateTime = java.time.OffsetDateTime.now();

    public void someMethod() {
        // Compliant - Using Calendar is allowed
        java.util.Calendar calendar = java.util.Calendar.getInstance();
    }
}
