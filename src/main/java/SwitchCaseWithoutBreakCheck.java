public class SwitchCaseWithoutBreakCheck {

    public void nonCompliantExample1(int input) {
        switch (input) {
            case 1:
                System.out.println("Case 1");
            case 2: // Noncompliant
                System.out.println("Case 2");
                break;
            case 3:
                System.out.println("Case 3");
                break;
            default:
                System.out.println("Default");
        }
    }

    public void nonCompliantExample2(String input) {
        switch (input) {
            case "a":
                System.out.println("Case a");
            case "b": // Noncompliant
                System.out.println("Case b");
            case "c":
                System.out.println("Case c");
                break;
            default:
                System.out.println("Default");
        }
    }

    public void compliantExample1(int input) {
        switch (input) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            case 3:
                System.out.println("Case 3");
                break;
            default:
                System.out.println("Default");
        }
    }

    public void compliantExample2(String input) {
        switch (input) {
            case "a":
                System.out.println("Case a");
                break;
            case "b":
                System.out.println("Case b");
                break;
            case "c":
                System.out.println("Case c");
                break;
            default:
                System.out.println("Default");
        }
    }
}
