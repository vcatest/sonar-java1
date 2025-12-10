public class InvalidDateValuesCheck {

    public void nonCompliantExample1() {
        java.util.Date date = new java.util.Date(31, 12, 2023); // Noncompliant - Invalid date values (month 31 is not valid)
        System.out.println(date);
    }

    public void nonCompliantExample2() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(2024, 13, 1); // Noncompliant - Invalid month value (13 is not a valid month)
        java.util.Date date = calendar.getTime();
        System.out.println(date);
    }

    public void compliantExample1() {
        java.util.Date date = new java.util.Date(2023, 11, 31); // Month is 0-indexed (December is 11)
        System.out.println(date);
    }

    public void compliantExample2() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(2024, 11, 31); // Valid month and day
        java.util.Date date = calendar.getTime();
        System.out.println(date);
    }
}
