public class PrimitiveTypeBoxingWithToStringCheck {

    public void nonCompliantExample1() {
        Integer i = 5;
        String s = i.toString(); // Noncompliant
        System.out.println(s);
    }

    public void nonCompliantExample2() {
        Double d = 3.14;
        String str = d.toString(); // Noncompliant
        System.out.println(str);
    }

    public void nonCompliantExample3() {
        Boolean b = true;
        String boolStr = b.toString(); // Noncompliant
        System.out.println(boolStr);
    }

    public void compliantExample1() {
        int i = 5;
        String s = String.valueOf(i);
        System.out.println(s);
    }

    public void compliantExample2() {
        double d = 3.14;
        String str = String.valueOf(d);
        System.out.println(str);
    }

    public void compliantExample3() {
        boolean b = true;
        String boolStr = String.valueOf(b);
        System.out.println(boolStr);
    }

    public void compliantExample4() {
        Integer i = 5;
        String s = "" + i;
        System.out.println(s);
    }
}
