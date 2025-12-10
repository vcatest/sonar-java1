import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterMismatchCheck {

    public void nonCompliantExample1() {
        String dateString = "2023-10-26";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd"); // Noncompliant
        LocalDateTime dateTime = LocalDateTime.parse(dateString, formatter);
    }

    public void nonCompliantExample2() {
        String dateString = "26/10/2023";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // Noncompliant
        LocalDateTime dateTime = LocalDateTime.parse(dateString, formatter);
    }

    public void compliantExample1() {
        String dateString = "2023-10-26";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime dateTime = LocalDateTime.parse(dateString, formatter);
    }

    public void compliantExample2() {
        String dateString = "2023/10/26";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime dateTime = LocalDateTime.parse(dateString, formatter);
    }
}
