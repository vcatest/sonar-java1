public class SwitchDefaultLastCaseCheck {

    // Noncompliant
    public void example1() {
        int day = 2;
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            default:
                dayName = "Unknown"; // Noncompliant
                break;
        }
    }

    // Noncompliant
    public void example2() {
        int month = 13;
        String monthName;
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            default:
                monthName = "Invalid Month"; // Noncompliant
                break;
        }
    }

    // Compliant
    public void example3() {
        int day = 2;
        String dayName;
        switch (day) {
            default:
                dayName = "Unknown";
                break;
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
        }
    }

    // Compliant
    public void example4() {
        int month = 13;
        String monthName;
        switch (month) {
            default:
                monthName = "Invalid Month";
                break;
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
        }
    }
}
