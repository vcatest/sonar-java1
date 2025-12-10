public class SwitchWithTooManyCasesCheck {

    // Noncompliant - Switch with more than 5 cases
    public String getDayOfWeekNoncompliant(int day) {
        String dayOfWeek = "Invalid day";
        switch (day) {
            case 1:
                dayOfWeek = "Sunday";
                break;
            case 2:
                dayOfWeek = "Monday";
                break;
            case 3:
                dayOfWeek = "Tuesday";
                break;
            case 4:
                dayOfWeek = "Wednesday";
                break;
            case 5:
                dayOfWeek = "Thursday";
                break;
            case 6:
                dayOfWeek = "Friday";
                break;
            case 7:
                dayOfWeek = "Saturday";
                break;
        }
        return dayOfWeek;
    }

    // Noncompliant - Switch with more than 5 cases
    public String getMonthNoncompliant(int month) {
        String monthName = "Invalid month";
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
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
        }
        return monthName;
    }

    // Compliant - Switch with less than 5 cases
    public String getSeasonCompliant(int month) {
        String season = "Unknown";
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
        }
        return season;
    }

    // Compliant - Switch with 4 cases
    public String getCardinalDirectionCompliant(int direction) {
        String cardinalDirection = "Invalid direction";
        switch (direction) {
            case 1:
                cardinalDirection = "North";
                break;
            case 2:
                cardinalDirection = "East";
                break;
            case 3:
                cardinalDirection = "South";
                break;
            case 4:
                cardinalDirection = "West";
                break;
        }
        return cardinalDirection;
    }
}
