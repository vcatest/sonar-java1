public class MissingCurlyBracesCheck {

    public void nonCompliantExample1() {
        if (true)
            System.out.println("This is missing curly braces."); // Noncompliant
        else
            System.out.println("This is also missing curly braces."); // Noncompliant
    }

    public void nonCompliantExample2(int value) {
        if (value > 0)
            System.out.println("Value is positive."); // Noncompliant
        else if (value < 0)
            System.out.println("Value is negative."); // Noncompliant
        else
            System.out.println("Value is zero.");
    }

    public void compliantExample1() {
        if (true) {
            System.out.println("This has curly braces.");
        } else {
            System.out.println("This also has curly braces.");
        }
    }

    public void compliantExample2(int value) {
        if (value > 0) {
            System.out.println("Value is positive.");
        } else if (value < 0) {
            System.out.println("Value is negative.");
        } else {
            System.out.println("Value is zero.");
        }
    }
}
