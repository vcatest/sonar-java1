public class RedundantTypeCastCheck {

    public void nonCompliantExample1() {
        Integer number = 10;
        int result = (int) number; // Noncompliant
        System.out.println(result);
    }

    public void nonCompliantExample2() {
        Double decimal = 3.14;
        float floatValue = (float) decimal; // Noncompliant
        System.out.println(floatValue);
    }

    public void compliantExample1() {
        Integer number = 10;
        int result = number;
        System.out.println(result);
    }

    public void compliantExample2() {
        Double decimal = 3.14;
        float floatValue = decimal.floatValue();
        System.out.println(floatValue);
    }

    public void compliantExample3() {
        Long longValue = 1234567890L;
        int intValue = longValue.intValue();
        System.out.println(intValue);
    }

    public void nonCompliantExample3() {
        String str = "123";
        int num = (int) str; // Noncompliant
    }
}
