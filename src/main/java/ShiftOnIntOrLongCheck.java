public class ShiftOnIntOrLongCheck {

    public void nonCompliantExample1(int i) {
        boolean result = (i >> 31) == 0; // Noncompliant
        System.out.println(result);
    }

    public void nonCompliantExample2(long l) {
        boolean result = (l >> 63) == 0; // Noncompliant
        System.out.println(result);
    }

    public void compliantExample1(int i) {
        boolean result = Integer.compare(i, 0) >= 0;
        System.out.println(result);
    }

    public void compliantExample2(long l) {
        boolean result = Long.compare(l, 0L) >= 0;
        System.out.println(result);
    }

    public void compliantExample3(int i) {
        boolean result = i >= 0;
        System.out.println(result);
    }

    public void compliantExample4(long l) {
        boolean result = l >= 0L;
        System.out.println(result);
    }
}
