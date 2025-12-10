public class PatternMatchUsingIfCheck {

    public void nonCompliantExample1(String input) {
        if (input.matches(".*[0-9].*")) { // Noncompliant
            System.out.println("Input contains a number.");
        } else {
            System.out.println("Input does not contain a number.");
        }
    }

    public void nonCompliantExample2(String input) {
        if (input != null && input.matches("[a-zA-Z]+")) { // Noncompliant
            System.out.println("Input is a word.");
        } else {
            System.out.println("Input is not a word or is null.");
        }
    }

    public void compliantExample1(String input) {
        if (input != null && input.chars().allMatch(Character::isLetter)) {
            System.out.println("Input is a word.");
        } else {
            System.out.println("Input is not a word or is null.");
        }
    }

    public void compliantExample2(String input) {
        if (input != null && input.matches("\\d+")) {
            System.out.println("Input contains only numbers.");
        } else {
            System.out.println("Input does not contain only numbers or is null.");
        }
    }

    public void compliantExample3(String input) {
        if (input != null && input.matches("[a-zA-Z0-9]+")) {
            System.out.println("Input contains alphanumeric characters.");
        } else {
            System.out.println("Input does not contain alphanumeric characters or is null.");
        }
    }
}
