public class LeftCurlyBraceStartLineCheck {

    public void nonCompliantExample1() {
        if (true) // Noncompliant
        {
            System.out.println("This is non-compliant.");
        }
    }

    public void nonCompliantExample2() {
        for (int i = 0; i < 10; i++) // Noncompliant
        {
            System.out.println(i);
        }
    }

    public void compliantExample1() {
        if (true) {
            System.out.println("This is compliant.");
        }
    }

    public void compliantExample2() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public void compliantExample3() {
        try {
            System.out.println("Try block");
        } catch (Exception e) {
            System.out.println("Catch block");
        }
    }

    public void nonCompliantExample3() {
        try { // Noncompliant
        {
            System.out.println("Nested try block - noncompliant");
        }
        } catch (Exception e) {
            System.out.println("Catch block");
        }
    }
}
