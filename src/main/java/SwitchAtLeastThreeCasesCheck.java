public class SwitchAtLeastThreeCasesCheck {

    // Noncompliant - Switch statement with only one case
    public void exampleOneNoncompliant(int value) {
        switch (value) {
            case 1:
                System.out.println("Case 1");
                break;
        }
    }

    // Noncompliant - Switch statement with two cases
    public void exampleTwoNoncompliant(String input) {
        switch (input) {
            case "A":
                System.out.println("Input is A");
                break;
            case "B":
                System.out.println("Input is B");
                break;
        } // Noncompliant
    }

    // Compliant - Switch statement with three cases
    public void exampleThreeCompliant(int option) {
        switch (option) {
            case 1:
                System.out.println("Option 1");
                break;
            case 2:
                System.out.println("Option 2");
                break;
            case 3:
                System.out.println("Option 3");
                break;
        }
    }

    // Compliant - Switch statement with more than three cases
    public void exampleFourCompliant(char character) {
        switch (character) {
            case 'a':
                System.out.println("Character is a");
                break;
            case 'b':
                System.out.println("Character is b");
                break;
            case 'c':
                System.out.println("Character is c");
                break;
            case 'd':
                System.out.println("Character is d");
                break;
        }
    }
}
