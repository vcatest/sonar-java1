public class SwitchWithLabelsCheck {

    // Noncompliant
    public void nonCompliantExample1() {
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2: // Noncompliant
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Unknown day");
        }
    }

    // Noncompliant
    public void nonCompliantExample2() {
        String fruit = "apple";
        switch (fruit) {
            case "banana":
                System.out.println("It's a banana");
                break;
            case "apple": // Noncompliant
                System.out.println("It's an apple");
                break;
            case "orange":
                System.out.println("It's an orange");
                break;
            default:
                System.out.println("Unknown fruit");
        }
    }

    // Compliant
    public void compliantExample1() {
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Unknown day");
        }
    }

    // Compliant
    public void compliantExample2() {
        String fruit = "apple";
        switch (fruit) {
            case "banana":
                System.out.println("It's a banana");
                break;
            case "apple":
                System.out.println("It's an apple");
                break;
            case "orange":
                System.out.println("It's an orange");
                break;
            default:
                System.out.println("Unknown fruit");
        }
    }
}
