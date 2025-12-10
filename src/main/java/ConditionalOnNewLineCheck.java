public class ConditionalOnNewLineCheck {

    public void nonCompliantExample1() {
        if (true)
            System.out.println("This is on the same line."); // Noncompliant
    }

    public void nonCompliantExample2() {
        if (false) {
            System.out.println("This is also on the same line."); // Noncompliant
        }
    }

    public void compliantExample1() {
        if (true) {
            System.out.println("This is on a new line.");
        }
    }

    public void compliantExample2() {
        if (false) {
            System.out.println("This is also on a new line.");
        }
    }

    public void compliantExample3() {
        if (true)
            {
                System.out.println("This is also compliant.");
            }
    }

    public void nonCompliantExample3() {
        if (true)
            System.out.println("Another violation."); // Noncompliant
        else
            System.out.println("Also on the same line."); // Noncompliant
    }
}
