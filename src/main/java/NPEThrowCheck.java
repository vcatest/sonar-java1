public class NPEThrowCheck {

    public void nonCompliantExample1(String input) {
        if (input.length() > 5) {
            throw new IllegalArgumentException(input.substring(0, 10)); // Noncompliant
        }
    }

    public void nonCompliantExample2(String input) {
        if (input != null && input.contains("test")) {
            String upperCaseInput = input.toUpperCase();
            throw new RuntimeException(upperCaseInput); // Noncompliant
        }
    }

    public void compliantExample1(String input) {
        if (input != null && input.length() > 5) {
            throw new IllegalArgumentException(input.substring(0, 10));
        }
    }

    public void compliantExample2(String input) {
        if (input != null && input.contains("test")) {
            String upperCaseInput = input.toUpperCase();
            if (upperCaseInput != null) {
                throw new RuntimeException(upperCaseInput);
            }
        }
    }

    public void compliantExample3(String input) {
        if (input == null) {
            return;
        }
        if (input.length() > 5) {
            throw new IllegalArgumentException(input.substring(0, 10));
        }
    }

    public void nonCompliantExample3(String input) {
        String result = input.trim();
        throw new NullPointerException(result); // Noncompliant
    }
}
