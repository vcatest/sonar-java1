public class UseSwitchExpressionCheck {

    // Noncompliant
    public String getDayOfWeekOld(int day) {
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            default:
                dayName = "Unknown";
        }
        return dayName;
    }

    // Noncompliant
    public String getMonthOld(int month) {
        String monthName = "";
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
                monthName = "Invalid Month";
        }
        return monthName;
    }

    // Compliant
    public String getDayOfWeekNew(int day) {
        return switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Unknown";
        };
    }

    // Compliant
    public String getMonthNew(int month) {
        return switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            default -> "Invalid Month";
        };
    }
}
