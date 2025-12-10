public class UnnecessaryEscapeSequencesInTextBlockCheck {

    public void nonCompliantExamples() {
        String text1 = "This is a string with an unnecessary escape sequence: \n"; // Noncompliant
        String text2 = "Another example: \"This is a quote with an unnecessary escape: \\\"\""; // Noncompliant
        String text3 = "Yet another: \tThis has a tab escape."; // Noncompliant
        String text4 = "And one more: \rThis has a carriage return."; // Noncompliant
    }

    public void compliantExamples() {
        String text1 = "This is a string with a newline:\n";
        String text2 = "This is a quote: \"This is a quote\"";
        String text3 = "This string uses a tab character:\tThis has a tab.";
        String text4 = "This string uses a carriage return:\rThis has a carriage return.";
        String text5 = "This is a string with backslash: \\";
    }

    public static void main(String[] args) {
        UnnecessaryEscapeSequencesInTextBlockCheck test = new UnnecessaryEscapeSequencesInTextBlockCheck();
        test.nonCompliantExamples();
        test.compliantExamples();
    }
}
