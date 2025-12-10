public class SimpleStringLiteralForSingleLineStringsCheck {

    public void nonCompliantExamples() {
        String message1 = "Hello, world!"; // Noncompliant
        String message2 = "This is a test string."; // Noncompliant

        if (true) {
            System.out.println("Condition is true");
        }
    }

    public void compliantExamples() {
        String message3 = String.valueOf("Hello, world!");
        String message4 = new String("This is a test string.");

        if (true) {
            System.out.println(String.valueOf("Condition is true"));
        }
    }

    public static void main(String[] args) {
        SimpleStringLiteralForSingleLineStringsCheck test = new SimpleStringLiteralForSingleLineStringsCheck();
        test.nonCompliantExamples();
        test.compliantExamples();
    }
}
