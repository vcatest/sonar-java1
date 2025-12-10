public class StringToPrimitiveConversionCheck {

    public void nonCompliantExample1() {
        String numberString = "123";
        int number = Integer.parseInt(numberString); // Noncompliant
        System.out.println(number);
    }

    public void nonCompliantExample2() {
        String doubleString = "3.14";
        double number = Double.parseDouble(doubleString); // Noncompliant
        System.out.println(number);
    }

    public void compliantExample1() {
        String numberString = "456";
        try {
            int number = Integer.valueOf(numberString);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format: " + numberString);
        }
    }

    public void compliantExample2() {
        String booleanString = "true";
        boolean flag = Boolean.parseBoolean(booleanString);
        System.out.println(flag);
    }

    public static void main(String[] args) {
        StringToPrimitiveConversionCheck test = new StringToPrimitiveConversionCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2();
        test.compliantExample1();
        test.compliantExample2();
    }
}
