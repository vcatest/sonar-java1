public class EscapedUnicodeCharactersCheck {

    public void nonCompliantExample1() {
        String str1 = "This is a string with an escaped unicode character: \u00A9"; // Noncompliant
        System.out.println(str1);
    }

    public void nonCompliantExample2() {
        String str2 = "Another example: \u20AC is the Euro symbol."; // Noncompliant
        System.out.println(str2);
    }

    public void compliantExample1() {
        String str3 = "This string uses the copyright symbol directly: ©";
        System.out.println(str3);
    }

    public void compliantExample2() {
        String str4 = "Using a string literal without escaped unicode.";
        System.out.println(str4);
    }

    public void compliantExample3() {
        String str5 = "This string uses a unicode character that is directly representable: ∑";
        System.out.println(str5);
    }
}
