public class IdenticalCasesInSwitchCheck {

    // Noncompliant
    public void testNoncompliant1() {
        int value = 1;
        switch (value) {
            case 1:
                System.out.println("Case 1");
                break;
            case 1: // Noncompliant
                System.out.println("Case 1 again");
                break;
            default:
                System.out.println("Default");
        }
    }

    // Noncompliant
    public void testNoncompliant2() {
        String str = "abc";
        switch (str) {
            case "abc":
                System.out.println("abc");
                break;
            case "abc": // Noncompliant
                System.out.println("abc again");
                break;
            default:
                System.out.println("Default");
        }
    }

    // Compliant
    public void testCompliant1() {
        int value = 1;
        switch (value) {
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

    // Compliant
    public void testCompliant2() {
        String str = "abc";
        switch (str) {
            case "abc":
                System.out.println("abc");
                break;
            case "def":
                System.out.println("def");
                break;
            default:
                System.out.println("Default");
        }
    }
}
