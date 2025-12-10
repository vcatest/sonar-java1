public class IndentationAfterConditionalCheck {

    public void nonCompliantExample1() {
        if (true)
        {
            System.out.println("This is not indented correctly."); // Noncompliant
        }
    }

    public void nonCompliantExample2() {
        if (false)
            {
            System.out.println("Another incorrect indentation."); // Noncompliant
        }
    }

    public void compliantExample1() {
        if (true) {
            System.out.println("This is indented correctly.");
        }
    }

    public void compliantExample2() {
        if (false) {
            System.out.println("This is also indented correctly.");
        }
    }

    public void compliantExample3() {
        if (true)
        {
            System.out.println("This is also indented correctly.");
        }
    }

    public void compliantExample4() {
        if (false)
        {
            System.out.println("This is also indented correctly.");
        }
    }
}
