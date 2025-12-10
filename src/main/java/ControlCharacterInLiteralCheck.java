public class ControlCharacterInLiteralCheck {

    public void nonCompliantExample1() {
        String str1 = "Hello\nWorld"; // Noncompliant
        System.out.println(str1);
    }

    public void nonCompliantExample2() {
        String str2 = "This string has a\t tab."; // Noncompliant
        System.out.println(str2);
    }

    public void compliantExample1() {
        String str3 = "Hello World";
        System.out.println(str3);
    }

    public void compliantExample2() {
        String str4 = "This string is clean.";
        System.out.println(str4);
    }

    public void compliantExample3() {
        String str5 = "Hello\\nWorld"; //Escaped control character
        System.out.println(str5);
    }
}
