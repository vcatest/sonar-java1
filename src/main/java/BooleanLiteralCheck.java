public class BooleanLiteralCheck {

    public void nonCompliantExample1() {
        boolean flag = true; // Noncompliant
        if (flag) {
            System.out.println("Flag is true");
        }
    }

    public void nonCompliantExample2() {
        Boolean isActive = false; // Noncompliant
        String message = isActive ? "Active" : "Inactive";
        System.out.println(message);
    }

    public void compliantExample1() {
        boolean isEnabled = 1 == 1;
        if (isEnabled) {
            System.out.println("Enabled");
        }
    }

    public void compliantExample2() {
        Boolean isValid = !("test".isEmpty());
        System.out.println("Is valid: " + isValid);
    }

    public static void main(String[] args) {
        BooleanLiteralCheck check = new BooleanLiteralCheck();
        check.nonCompliantExample1();
        check.nonCompliantExample2();
        check.compliantExample1();
        check.compliantExample2();
    }
}
