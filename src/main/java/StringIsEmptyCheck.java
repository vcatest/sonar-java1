public class StringIsEmptyCheck {

    public void nonCompliantExample1(String str) {
        if (str.length() == 0) { // Noncompliant
            System.out.println("String is empty");
        }
    }

    public void nonCompliantExample2(CharSequence charSequence) {
        if (charSequence.length() == 0) { // Noncompliant
            System.out.println("CharSequence is empty");
        }
    }

    public void compliantExample1(String str) {
        if (str.isEmpty()) {
            System.out.println("String is empty");
        }
    }

    public void compliantExample2(CharSequence charSequence) {
        if (charSequence.isEmpty()) {
            System.out.println("CharSequence is empty");
        }
    }

    public static void main(String[] args) {
        StringIsEmptyCheck check = new StringIsEmptyCheck();
        check.nonCompliantExample1("test");
        check.nonCompliantExample2("another test");
        check.compliantExample1("test");
        check.compliantExample2("another test");
    }
}
