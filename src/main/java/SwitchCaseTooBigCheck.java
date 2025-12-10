public class SwitchCaseTooBigCheck {

    // Noncompliant - Too many case statements
    public void nonCompliantExample1(int input) {
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
            case 4:
                System.out.println("Case 4");
                break;
            case 5:
                System.out.println("Case 5");
                break;
            case 6:
                System.out.println("Case 6");
                break;
            case 7:
                System.out.println("Case 7");
                break;
            case 8:
                System.out.println("Case 8");
                break;
            case 9:
                System.out.println("Case 9");
                break;
            case 10:
                System.out.println("Case 10");
                break;
            case 11:
                System.out.println("Case 11");
                break;
            case 12:
                System.out.println("Case 12");
                break;
            default:
                System.out.println("Default");
        }
    }

    // Noncompliant - Too many case statements
    public void nonCompliantExample2(String input) {
        switch (input) {
            case "A":
                System.out.println("Case A");
                break;
            case "B":
                System.out.println("Case B");
                break;
            case "C":
                System.out.println("Case C");
                break;
            case "D":
                System.out.println("Case D");
                break;
            case "E":
                System.out.println("Case E");
                break;
            case "F":
                System.out.println("Case F");
                break;
            case "G":
                System.out.println("Case G");
                break;
            case "H":
                System.out.println("Case H");
                break;
            case "I":
                System.out.println("Case I");
                break;
            case "J":
                System.out.println("Case J");
                break;
            case "K":
                System.out.println("Case K");
                break;
            case "L":
                System.out.println("Case L");
                break;
            default:
                System.out.println("Default");
        }
    }

    // Compliant - Few case statements
    public void compliantExample1(int input) {
        switch (input) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Default");
        }
    }

    // Compliant - Few case statements
    public void compliantExample2(String input) {
        switch (input) {
            case "X":
                System.out.println("Case X");
                break;
            case "Y":
                System.out.println("Case Y");
                break;
            default:
                System.out.println("Default");
        }
    }
}
