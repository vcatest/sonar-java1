public class SillyStringOperationsCheck {

    public void nonCompliantExample1() {
        String str = "hello";
        str = str + " world"; // Noncompliant
        System.out.println(str);
    }

    public void nonCompliantExample2() {
        String str = "foo";
        str = str.concat("bar"); // Noncompliant
        System.out.println(str);
    }

    public void compliantExample1() {
        String str = "hello";
        str = new StringBuilder(str).append(" world").toString();
        System.out.println(str);
    }

    public void compliantExample2() {
        String str = "foo";
        StringBuilder sb = new StringBuilder(str);
        sb.append("bar");
        str = sb.toString();
        System.out.println(str);
    }

    public static void main(String[] args) {
        SillyStringOperationsCheck test = new SillyStringOperationsCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2();
        test.compliantExample1();
        test.compliantExample2();
    }
}
