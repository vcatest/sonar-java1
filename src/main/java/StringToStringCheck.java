public class StringToStringCheck {

    public void nonCompliantExample1() {
        String str = "hello";
        String newStr = str.toString(); // Noncompliant
        System.out.println(newStr);
    }

    public void nonCompliantExample2() {
        String s = new String("world");
        String anotherStr = s.toString(); // Noncompliant
        System.out.println(anotherStr);
    }

    public void compliantExample1() {
        String str = "hello";
        String newStr = str;
        System.out.println(newStr);
    }

    public void compliantExample2() {
        String s = new String("world");
        String anotherStr = s;
        System.out.println(anotherStr);
    }

    public static void main(String[] args) {
        StringToStringCheck test = new StringToStringCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2();
        test.compliantExample1();
        test.compliantExample2();
    }
}
