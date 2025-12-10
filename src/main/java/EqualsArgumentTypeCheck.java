public class EqualsArgumentTypeCheck {

    public void nonCompliantExample1() {
        String str = "hello";
        int num = 10;
        boolean result = str.equals(num); // Noncompliant
        System.out.println(result);
    }

    public void nonCompliantExample2() {
        Double d = 3.14;
        String s = "3.14";
        boolean isEqual = s.equals(d); // Noncompliant
        System.out.println(isEqual);
    }

    public void compliantExample1() {
        String str1 = "hello";
        String str2 = "hello";
        boolean result = str1.equals(str2);
        System.out.println(result);
    }

    public void compliantExample2() {
        Integer num1 = 10;
        Integer num2 = 10;
        boolean isEqual = num1.equals(num2);
        System.out.println(isEqual);
    }

    public void compliantExample3() {
        String str = "test";
        Object obj = str;
        boolean isEqual = str.equals(obj);
        System.out.println(isEqual);
    }
}
