public class SwitchRedundantKeywordCheck {

    public void nonCompliantExample1(String input) {
        if (input == null) {
            System.out.println("Input is null");
        } else {
            switch (input) {
                case "A":
                    System.out.println("Case A");
                    break;
                case "B":
                    System.out.println("Case B");
                    break;
                default:
                    System.out.println("Default case");
            }
        }
    } // Noncompliant

    public void nonCompliantExample2(int number) {
        if (number > 0) {
            switch (number) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                default:
                    System.out.println("Other");
            }
        } else {
            System.out.println("Negative or zero");
        }
    } // Noncompliant

    public void compliantExample1(String input) {
        if (input != null) {
            switch (input) {
                case "A":
                    System.out.println("Case A");
                    break;
                case "B":
                    System.out.println("Case B");
                    break;
                default:
                    System.out.println("Default case");
            }
        } else {
            System.out.println("Input is null");
        }
    }

    public void compliantExample2(int number) {
        if (number <= 0) {
            System.out.println("Negative or zero");
        } else {
            switch (number) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                default:
                    System.out.println("Other");
            }
        }
    }
}
