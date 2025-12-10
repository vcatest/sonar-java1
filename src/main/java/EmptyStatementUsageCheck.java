public class EmptyStatementUsageCheck {

    public void nonCompliantExample1() {
        int x = 10;
        ; // Noncompliant
        System.out.println("This is a non-compliant example.");
    }

    public void nonCompliantExample2() {
        if (true) {
            ; // Noncompliant
        }
        System.out.println("Another non-compliant example.");
    }

    public void compliantExample1() {
        int y = 20;
        System.out.println("This is a compliant example.");
    }

    public void compliantExample2() {
        if (false) {
            System.out.println("This is also a compliant example.");
        }
    }

    public void compliantExample3() {
        int z = 30;
        z++;
        System.out.println("Compliant with meaningful statement");
    }
}
