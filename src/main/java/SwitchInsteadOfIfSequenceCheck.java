public class SwitchInsteadOfIfSequenceCheck {

    // Noncompliant Example 1
    public void example1(int value) {
        if (value == 1) {
            System.out.println("One");
        } else if (value == 2) {
            System.out.println("Two");
        } else if (value == 3) {
            System.out.println("Three");
        } else {
            System.out.println("Other");
        }
    } // Noncompliant

    // Noncompliant Example 2
    public void example2(String input) {
        if ("a".equals(input)) {
            System.out.println("A");
        } else if ("b".equals(input)) {
            System.out.println("B");
        } else if ("c".equals(input)) {
            System.out.println("C");
        } else {
            System.out.println("Other");
        }
    } // Noncompliant

    // Compliant Example 1
    public void example3(int value) {
        switch (value) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Other");
        }
    }

    // Compliant Example 2
    public void example4(String input) {
        switch (input) {
            case "a":
                System.out.println("A");
                break;
            case "b":
                System.out.println("B");
                break;
            case "c":
                System.out.println("C");
                break;
            default:
                System.out.println("Other");
        }
    }
}
