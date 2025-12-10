public class SwitchLastCaseIsDefaultCheck {

    // Noncompliant
    public void testNoncompliant1() {
        int day = 2;
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
            default: // Noncompliant
                dayName = "Unknown";
                break;
        }
        System.out.println(dayName);
    }

    // Noncompliant
    public void testNoncompliant2() {
        String fruit = "orange";
        String color;
        switch (fruit) {
            case "apple":
                color = "red";
                break;
            case "banana":
                color = "yellow";
                break;
            case "grape":
                color = "purple";
                break;
            default: // Noncompliant
                color = "unknown";
                break;
        }
        System.out.println(color);
    }

    // Compliant
    public void testCompliant1() {
        int day = 2;
        String dayName;
        switch (day) {
            default: // Compliant
                dayName = "Unknown";
                break;
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
        }
        System.out.println(dayName);
    }

    // Compliant
    public void testCompliant2() {
        String fruit = "orange";
        String color;
        switch (fruit) {
            default: // Compliant
                color = "unknown";
                break;
            case "apple":
                color = "red";
                break;
            case "banana":
                color = "yellow";
                break;
            case "grape":
                color = "purple";
                break;
        }
        System.out.println(color);
    }
}
