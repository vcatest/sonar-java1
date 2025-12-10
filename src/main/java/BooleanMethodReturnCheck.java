public class BooleanMethodReturnCheck {

    // Noncompliant
    public boolean shouldReturnTrue(boolean input) {
        if (input) {
            return true;
        } else {
            return false;
        }
    }

    // Noncompliant
    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Compliant
    public boolean isPositive(int number) {
        return number > 0;
    }

    // Compliant
    public boolean isValidEmail(String email) {
        return email != null && email.contains("@");
    }

    public static void main(String[] args) {
        BooleanMethodReturnCheck checker = new BooleanMethodReturnCheck();
        System.out.println(checker.shouldReturnTrue(true));
        System.out.println(checker.isEven(4));
        System.out.println(checker.isPositive(5));
        System.out.println(checker.isValidEmail("test@example.com"));
    }
}
