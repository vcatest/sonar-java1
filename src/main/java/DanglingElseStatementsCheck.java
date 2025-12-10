public class DanglingElseStatementsCheck {

    public void example1Noncompliant() {
        if (true) {
            System.out.println("First condition");
        }
        else // Noncompliant
            System.out.println("This else is dangling");
    }

    public void example2Noncompliant() {
        if (false) {
            System.out.println("Condition is false");
        }
        else // Noncompliant
        {
            System.out.println("Dangling else block");
        }
    }

    public void example3Compliant() {
        if (true) {
            System.out.println("First condition");
        } else {
            System.out.println("Else block associated with the first if");
        }
    }

    public void example4Compliant() {
        if (false) {
            System.out.println("Condition is false");
        } else {
            System.out.println("Else block associated with the if");
        }
    }

    public void example5Compliant() {
        if (true) {
            System.out.println("First condition");
        } else {
            System.out.println("Else block associated with the first if");
        }

        if (false) {
            System.out.println("Second condition");
        } else {
            System.out.println("Else block associated with the second if");
        }
    }
}
