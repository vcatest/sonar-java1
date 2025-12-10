public class DisallowedConstructorCheck {

    // Noncompliant
    public DisallowedConstructorCheck() {
        System.out.println("Default constructor called");
    }

    // Noncompliant
    public DisallowedConstructorCheck(int x) {
        System.out.println("Parameterized constructor called");
    }

    // Compliant
    private DisallowedConstructorCheck(String s) {
        System.out.println("Private constructor called");
    }

    // Compliant
    public static DisallowedConstructorCheck createInstance(String s) {
        return new DisallowedConstructorCheck(s);
    }

    public static void main(String[] args) {
        // Example usage - demonstrating compliance through factory method
        DisallowedConstructorCheck instance = DisallowedConstructorCheck.createInstance("test");
    }
}
