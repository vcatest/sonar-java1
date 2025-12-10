public class ImmediateReverseBoxingCheck {

    public void nonCompliantExample1() {
        Integer i = 10;
        int j = (int) i; // Noncompliant
        System.out.println(j);
    }

    public void nonCompliantExample2() {
        Integer k = new Integer(20);
        int l = k.intValue(); // Noncompliant
        System.out.println(l);
    }

    public void compliantExample1() {
        Integer m = 30;
        int n = m;
        System.out.println(n);
    }

    public void compliantExample2() {
        Integer o = new Integer(40);
        int p = o;
        System.out.println(p);
    }

    public static void main(String[] args) {
        ImmediateReverseBoxingCheck test = new ImmediateReverseBoxingCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2();
        test.compliantExample1();
        test.compliantExample2();
    }
}
