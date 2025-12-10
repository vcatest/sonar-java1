public class RegexPatternsNeedlesslyCheck {

    public void nonCompliantExample1(String input) {
        if (input.matches("\\d+")) { // Noncompliant
            System.out.println("Input is a number");
        }
    }

    public void nonCompliantExample2(String input) {
        if (input.matches("[a-zA-Z]+")) { // Noncompliant
            System.out.println("Input is a string of letters");
        }
    }

    public void compliantExample1(String input) {
        if (input.matches("[0-9]+")) {
            System.out.println("Input is a number");
        }
    }

    public void compliantExample2(String input) {
        if (input.matches("[a-zA-Z]+")) {
            System.out.println("Input is a string of letters");
        }
    }

    public void compliantExample3(String input) {
        if (java.util.regex.Pattern.matches("[0-9]+", input)) {
            System.out.println("Input is a number");
        }
    }

    public void compliantExample4(String input) {
        if (java.util.regex.Pattern.matches("[a-zA-Z]+", input)) {
            System.out.println("Input is a string of letters");
        }
    }
}
