public class NullShouldNotBeUsedWithOptionalCheck {

    public void nonCompliantExample1(String input) {
        if (input == null || input.isEmpty()) { // Noncompliant
            System.out.println("Input is null or empty");
        }
    }

    public void nonCompliantExample2(java.util.Optional<String> optionalString) {
        if (optionalString == null || !optionalString.isPresent()) { // Noncompliant
            System.out.println("Optional string is null or empty");
        }
    }

    public void compliantExample1(String input) {
        if (input != null && !input.isEmpty()) {
            System.out.println("Input is not null and not empty");
        } else {
            System.out.println("Input is null or empty");
        }
    }

    public void compliantExample2(java.util.Optional<String> optionalString) {
        if (optionalString.isPresent()) {
            System.out.println("Optional string is present: " + optionalString.get());
        } else {
            System.out.println("Optional string is empty");
        }
    }

    public void compliantExample3(java.util.Optional<String> optionalString) {
        optionalString.ifPresent(s -> System.out.println("Optional string is present: " + s));
    }
}
