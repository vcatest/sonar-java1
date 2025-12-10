public class TextBlocksInComplexExpressionsCheck {

    public void nonCompliantExample1() {
        String message = "Hello " +
                         """
                         World!
                         This is a multiline string.
                         """ +
                         " How are you?"; // Noncompliant
        System.out.println(message);
    }

    public void nonCompliantExample2() {
        boolean condition = true;
        String result = condition ? """
                                  This is true.
                                  """ : """
                                         This is false.
                                         """; // Noncompliant
        System.out.println(result);
    }

    public void compliantExample1() {
        String message = "Hello World!";
        System.out.println(message);
    }

    public void compliantExample2() {
        String longString = """
                This is a long string
                that is defined using a text block.
                It is perfectly acceptable.
                """;
        System.out.println(longString);
    }

    public void compliantExample3() {
        String part1 = "First part";
        String part2 = "Second part";
        String combined = part1 + part2;
        System.out.println(combined);
    }

    public void compliantExample4() {
        boolean condition = true;
        String result;
        if (condition) {
            result = "This is true.";
        } else {
            result = "This is false.";
        }
        System.out.println(result);
    }
}
