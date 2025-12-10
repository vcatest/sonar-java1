public class CastArithmeticOperandCheck {

    public void nonCompliantExample1(double value) {
        int result = (int) value + 5; // Noncompliant
        System.out.println(result);
    }

    public void nonCompliantExample2(long largeNumber) {
        float result = 10.5f + (float) largeNumber; // Noncompliant
        System.out.println(result);
    }

    public void compliantExample1(double value) {
        double result = value + 5;
        System.out.println(result);
    }

    public void compliantExample2(long largeNumber) {
        double result = 10.5 + largeNumber;
        System.out.println(result);
    }

    public void compliantExample3(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    public void nonCompliantExample3(int a, double b) {
        int result = a + (int)b; // Noncompliant
        System.out.println(result);
    }
}
