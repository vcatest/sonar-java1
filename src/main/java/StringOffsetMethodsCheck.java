public class StringOffsetMethodsCheck {

    public void nonCompliantExample1(String str, int offset) {
        String sub = str.substring(offset); // Noncompliant
        System.out.println(sub);
    }

    public void nonCompliantExample2(String str, int beginIndex, int endIndex) {
        String sub = str.substring(beginIndex, endIndex); // Noncompliant
        System.out.println(sub);
    }

    public void compliantExample1(String str) {
        if (str != null && !str.isEmpty()) {
            String trimmed = str.trim();
            System.out.println(trimmed);
        }
    }

    public void compliantExample2(String str, int index) {
        if (str != null && index >= 0 && index < str.length()) {
            char c = str.charAt(index);
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        StringOffsetMethodsCheck check = new StringOffsetMethodsCheck();
        check.nonCompliantExample1("  hello world  ", 2);
        check.nonCompliantExample2("abcdefg", 1, 4);
        check.compliantExample1("  hello world  ");
        check.compliantExample2("abcdefg", 2);
    }
}
