public class RawByteBitwiseOperationsCheck {

    public void nonCompliantExample1() {
        byte b1 = 10;
        byte b2 = 5;
        int result = b1 & b2; // Noncompliant
        System.out.println(result);
    }

    public void nonCompliantExample2() {
        byte b1 = -1;
        byte b2 = 1;
        int result = b1 | b2; // Noncompliant
        System.out.println(result);
    }

    public void compliantExample1() {
        int i1 = 10;
        int i2 = 5;
        int result = i1 & i2;
        System.out.println(result);
    }

    public void compliantExample2() {
        short s1 = 10;
        short s2 = 5;
        int result = s1 & s2;
        System.out.println(result);
    }

    public void compliantExample3() {
        byte b1 = 10;
        byte b2 = 5;
        short result = (short)(b1 & b2);
        System.out.println(result);
    }
}
