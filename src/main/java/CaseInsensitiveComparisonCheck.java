public class CaseInsensitiveComparisonCheck {

    public void nonCompliantExample1(String str1, String str2) {
        if (str1.equals(str2)) { // Noncompliant
            System.out.println("Strings are equal (case sensitive)");
        } else {
            System.out.println("Strings are not equal (case sensitive)");
        }
    }

    public void nonCompliantExample2(String str1, String str2) {
        if (str1 == str2) { // Noncompliant
            System.out.println("Strings are the same object (case sensitive)");
        } else {
            System.out.println("Strings are different objects (case sensitive)");
        }
    }

    public void compliantExample1(String str1, String str2) {
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Strings are equal (case insensitive)");
        } else {
            System.out.println("Strings are not equal (case insensitive)");
        }
    }

    public void compliantExample2(String str1, String str2) {
        if (str1.compareToIgnoreCase(str2) == 0) {
            System.out.println("Strings are equal (case insensitive)");
        } else {
            System.out.println("Strings are not equal (case insensitive)");
        }
    }

    public static void main(String[] args) {
        CaseInsensitiveComparisonCheck check = new CaseInsensitiveComparisonCheck();
        check.nonCompliantExample1("Hello", "hello");
        check.nonCompliantExample2("World", "world");
        check.compliantExample1("Test", "test");
        check.compliantExample2("Example", "example");
    }
}
