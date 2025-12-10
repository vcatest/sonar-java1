public class IndexOfWithPositiveNumberCheck {

    public void nonCompliantExample1() {
        String str = "hello";
        int index = str.indexOf('l', 5); // Noncompliant
        System.out.println(index);
    }

    public void nonCompliantExample2() {
        String str = "world";
        int index = str.indexOf('o', 2); // Noncompliant
        System.out.println(index);
    }

    public void compliantExample1() {
        String str = "hello";
        int index = str.indexOf('l', 0);
        System.out.println(index);
    }

    public void compliantExample2() {
        String str = "world";
        int index = str.indexOf('o', -1);
        System.out.println(index);
    }

    public void compliantExample3() {
        String str = "example";
        int index = str.indexOf('e');
        System.out.println(index);
    }

    public void nonCompliantExample3() {
        String str = "test";
        int index = str.indexOf('t', 1); // Noncompliant
        System.out.println(index);
    }
}
