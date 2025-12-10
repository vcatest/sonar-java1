public class SwitchCasesShouldBeCommaSeparatedCheck {

    public void nonCompliantExample1() {
        int x = 1;
        switch (x) {
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
        } // Noncompliant
    }

    public void nonCompliantExample2() {
        String color = "red";
        switch (color) {
            case "red":
                System.out.println("Stop");
            case "yellow":
                System.out.println("Slow down");
        } // Noncompliant
    }

    public void compliantExample1() {
        int day = 3;
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
        }
    }

    public void compliantExample2() {
        String fruit = "apple";
        switch (fruit) {
            case "apple":
                System.out.println("A fruit");
                break;
            case "banana":
                System.out.println("Another fruit");
                break;
            case "orange":
                System.out.println("Yet another fruit");
                break;
        }
    }
}
