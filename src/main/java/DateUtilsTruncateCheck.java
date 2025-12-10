import java.util.Date;
import org.apache.commons.lang3.time.DateUtils;

public class DateUtilsTruncateCheck {

    public void nonCompliantExample1() {
        Date date = new Date();
        Date truncatedDate = DateUtils.truncate(date, java.util.Calendar.DAY_OF_MONTH); // Noncompliant
        System.out.println(truncatedDate);
    }

    public void nonCompliantExample2() {
        Date date = new Date();
        Date truncatedDate = DateUtils.truncate(date, java.util.Calendar.HOUR_OF_DAY); // Noncompliant
        System.out.println(truncatedDate);
    }

    public void compliantExample1() {
        Date date = new Date();
        long milliseconds = date.getTime();
        Date compliantDate = new Date(milliseconds);
        System.out.println(compliantDate);
    }

    public void compliantExample2() {
        Date date = new Date();
        Date compliantDate = new Date(date.getTime());
        System.out.println(compliantDate);
    }
}
