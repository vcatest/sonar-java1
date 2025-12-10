public class TextBlockTabsAndSpacesCheck {

    public void nonCompliantExample1() {
        String text = """
        	This is a text block with tabs.
        	It should not have tabs.
        """; // Noncompliant
    }

    public void nonCompliantExample2() {
        String text = """
        This is a text block with mixed tabs and spaces.
        	This line has a tab at the beginning.
        """; // Noncompliant
    }

    public void compliantExample1() {
        String text = """
        This is a text block with only spaces.
        It is compliant with the rule.
        """;
    }

    public void compliantExample2() {
        String text = """
        This is another compliant text block.
        Using only spaces for indentation.
        """;
    }

    public static void main(String[] args) {
        TextBlockTabsAndSpacesCheck test = new TextBlockTabsAndSpacesCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2();
        test.compliantExample1();
        test.compliantExample2();
    }
}
