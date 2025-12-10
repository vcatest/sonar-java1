public class OctalValuesCheck {

    public void nonCompliantExamples() {
        int octalValue1 = 012; // Noncompliant
        int octalValue2 = 0777; // Noncompliant

        System.out.println("Noncompliant examples");
    }

    public void compliantExamples() {
        int decimalValue1 = 10;
        int decimalValue2 = 63;
        int octalValue3 = 0x12;
        int octalValue4 = 0x777;

        System.out.println("Compliant examples");
    }

    public static void main(String[] args) {
        OctalValuesCheck test = new OctalValuesCheck();
        test.nonCompliantExamples();
        test.compliantExamples();
    }
}
