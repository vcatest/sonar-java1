public class DateAndTimesCheck {

    public void nonCompliantExample1() {
        java.util.Date now = new java.util.Date();
        String dateString = now.toString(); // Noncompliant
        System.out.println("Date as string: " + dateString);
    }

    public void nonCompliantExample2() {
        long currentTimeMillis = System.currentTimeMillis();
        String timeString = String.valueOf(currentTimeMillis); // Noncompliant
        System.out.println("Time in milliseconds as string: " + timeString);
    }

    public void compliantExample1() {
        java.time.LocalDate today = java.time.LocalDate.now();
        String formattedDate = today.toString();
        System.out.println("Date as string: " + formattedDate);
    }

    public void compliantExample2() {
        java.time.LocalDateTime now = java.time.LocalDateTime.now();
        java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String formattedDateTime = now.format(formatter);
        System.out.println("Date and Time as string: " + formattedDateTime);
    }
}
