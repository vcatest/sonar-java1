public class OneDeclarationPerLineCheck {

    public void nonCompliantExamples() {
        int a = 1, b = 2; // Noncompliant
        String name = "John", address = "123 Main St"; // Noncompliant

        for (int i = 0, j = 0; i < 10; i++, j++) {
            //This is allowed as it's part of a for loop initialization
        }
    }

    public void compliantExamples() {
        int a = 1;
        int b = 2;

        String name = "John";
        String address = "123 Main St";

        int x;
        x = 5;
    }

    public static void main(String[] args) {
        OneDeclarationPerLineCheck test = new OneDeclarationPerLineCheck();
        test.nonCompliantExamples();
        test.compliantExamples();
    }
}
