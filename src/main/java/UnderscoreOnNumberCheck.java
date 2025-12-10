public class UnderscoreOnNumberCheck {

    public void nonCompliantExamples() {
        int _number1 = 10; // Noncompliant
        double number_two = 3.14; // Noncompliant
        long number3 = 1234567890L;
        float number4 = 2.71828f;
    }

    public void compliantExamples() {
        int number1 = 10;
        double number2 = 3.14;
        long number3 = 1234567890L;
        float number4 = 2.71828f;
    }

    public static void main(String[] args) {
        UnderscoreOnNumberCheck test = new UnderscoreOnNumberCheck();
        test.nonCompliantExamples();
        test.compliantExamples();
    }
}
