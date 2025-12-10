public class PrimitiveWrappersInTernaryOperatorCheck {

    public void nonCompliantExample1() {
        Integer x = 10;
        Integer result1 = (x > 5) ? new Integer(0) : new Integer(1); // Noncompliant
        System.out.println(result1);
    }

    public void nonCompliantExample2() {
        Double y = 3.14;
        Double result2 = (y < 4.0) ? Double.valueOf(2.71) : Double.valueOf(1.618); // Noncompliant
        System.out.println(result2);
    }

    public void compliantExample1() {
        Integer x = 10;
        int result3 = (x > 5) ? 0 : 1;
        System.out.println(result3);
    }

    public void compliantExample2() {
        Double y = 3.14;
        double result4 = (y < 4.0) ? 2.71 : 1.618;
        System.out.println(result4);
    }

    public void compliantExample3() {
        Boolean flag = true;
        boolean result5 = (flag) ? true : false;
        System.out.println(result5);
    }

    public void nonCompliantExample3() {
        Long z = 123L;
        Long result6 = (z > 100) ? Long.valueOf(456L) : Long.valueOf(789L); // Noncompliant
        System.out.println(result6);
    }
}
