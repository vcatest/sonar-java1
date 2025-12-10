import java.math.BigDecimal;

public class MathOnFloatCheck {

    public void nonCompliantExample1() {
        float a = 1.0f;
        float b = 2.0f;
        float result = a + b; // Noncompliant
        System.out.println(result);
    }

    public void nonCompliantExample2() {
        float x = 3.14f;
        float y = 2.71f;
        float z = x * y; // Noncompliant
        System.out.println(z);
    }

    public void compliantExample1() {
        double a = 1.0;
        double b = 2.0;
        double result = a + b;
        System.out.println(result);
    }

    public void compliantExample2() {
        BigDecimal num1 = new BigDecimal("1.5");
        BigDecimal num2 = new BigDecimal("2.5");
        BigDecimal result = num1.add(num2);
        System.out.println(result);
    }

    public void compliantExample3() {
        float a = 1.0f;
        int b = 2;
        float result = a + b;
        System.out.println(result);
    }
}
