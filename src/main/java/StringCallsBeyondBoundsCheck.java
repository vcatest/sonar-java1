public class StringCallsBeyondBoundsCheck {

    public void nonCompliantExample1(String str, int index) {
        char c = str.charAt(index); // Noncompliant
        System.out.println(c);
    }

    public void nonCompliantExample2(String str, int length) {
        String sub = str.substring(length); // Noncompliant
        System.out.println(sub);
    }

    public void compliantExample1(String str, int index) {
        if (index >= 0 && index < str.length()) {
            char c = str.charAt(index);
            System.out.println(c);
        } else {
            System.out.println("Index out of bounds");
        }
    }

    public void compliantExample2(String str, int length) {
        if (length >= 0 && length <= str.length()) {
            String sub = str.substring(0, length);
            System.out.println(sub);
        } else {
            System.out.println("Length out of bounds");
        }
    }

    public static void main(String[] args) {
        StringCallsBeyondBoundsCheck test = new StringCallsBeyondBoundsCheck();
        test.nonCompliantExample1("hello", 5);
        test.nonCompliantExample2("world", 6);
        test.compliantExample1("test", 2);
        test.compliantExample2("example", 4);
    }
}
