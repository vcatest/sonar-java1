public class UnderscoreMisplacedOnNumberCheck {

    public void nonCompliantExamples() {
        long number1 = 1_000_000L; // Noncompliant
        int number2 = 1000_000; // Noncompliant

        double number3 = 1.0_000; // Noncompliant - although technically valid, likely intent is not readability
        float number4 = 1.234_567f; // Noncompliant - same as above
    }

    public void compliantExamples() {
        long number5 = 1000000L;
        int number6 = 1000000;

        double number7 = 1.000;
        float number8 = 1.234567f;

        long number9 = 1_000;
        int number10 = 1_000;
    }

    public static void main(String[] args) {
        UnderscoreMisplacedOnNumberCheck test = new UnderscoreMisplacedOnNumberCheck();
        test.nonCompliantExamples();
        test.compliantExamples();
    }
}
