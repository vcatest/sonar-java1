public class MarkdownJavadocSyntaxCheck {

    /**
     * Noncompliant example 1: Markdown style heading within Javadoc.
     * # This is a heading
     * @param arg The argument.
     */
    public void nonCompliantExample1(String arg) {
    }

    /**
     * Noncompliant example 2:  Markdown style list within Javadoc.
     * - Item 1
     * - Item 2
     * @return The result.
     */
    public int nonCompliantExample2() {
        return 0;
    }

    /**
     * Compliant example 1: Standard Javadoc with no markdown.
     * This is a standard Javadoc comment.
     * @param arg The argument.
     */
    public void compliantExample1(String arg) {
    }

    /**
     * Compliant example 2: Javadoc with HTML tags (allowed).
     * This is a Javadoc comment with <b>bold</b> text.
     * @return The result.
     */
    public int compliantExample2() {
        return 1;
    }

    /**
     * Noncompliant example 3: Markdown style bold text.
     * **This is bold text**
     * @param input The input string.
     */
    public void nonCompliantExample3(String input) {
    }

    /**
     * Compliant example 3: Standard Javadoc with no markdown.
     * This is a standard Javadoc comment.
     * @param arg The argument.
     */
    public void compliantExample3(String arg) {
    }
}
