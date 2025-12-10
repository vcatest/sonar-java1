public class StringConcatToTextBlockCheck {

    public void nonCompliantExample1() {
        String longString = "This is a very long string " +
                            "that needs to be constructed " +
                            "using multiple string concatenations. " +
                            "It's not very readable."; // Noncompliant
        System.out.println(longString);
    }

    public void nonCompliantExample2() {
        String name = "John";
        String greeting = "Hello, " + name + "! Welcome to our application."; // Noncompliant
        System.out.println(greeting);
    }

    public void compliantExample1() {
        String longString = """
                            This is a very long string
                            that needs to be constructed
                            using a text block.
                            It's much more readable.
                            """;
        System.out.println(longString);
    }

    public void compliantExample2() {
        String name = "John";
        String greeting = """
                           Hello, %s! Welcome to our application.
                           """.formatted(name);
        System.out.println(greeting);
    }
}
