public class DateFormatWeekYearCheck {

    public void nonCompliantExample1() {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("wwyy"); // Noncompliant
        java.util.Date date = new java.util.Date();
        String formattedDate = sdf.format(date);
        System.out.println(formattedDate);
    }

    public void nonCompliantExample2() {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("WWyy"); // Noncompliant
        java.util.Date date = new java.util.Date();
        String formattedDate = sdf.format(date);
        System.out.println(formattedDate);
    }

    public void compliantExample1() {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-ww");
        java.util.Date date = new java.util.Date();
        String formattedDate = sdf.format(date);
        System.out.println(formattedDate);
    }

    public void compliantExample2() {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-W");
        java.util.Date date = new java.util.Date();
        String formattedDate = sdf.format(date);
        System.out.println(formattedDate);
    }

    public static void main(String[] args) {
        DateFormatWeekYearCheck test = new DateFormatWeekYearCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2();
        test.compliantExample1();
        test.compliantExample2();
    }
}
