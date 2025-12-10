public class CompareToNotOverloadedCheck {

    // Noncompliant - Overloaded compareTo method with more than one argument.
    public int compareTo(Object other) {
        return 0;
    }

    // Noncompliant - Overloaded compareTo method with multiple arguments.
    public int compareTo(Object other, int weight) {
        return 0;
    }

    // Compliant - Standard compareTo method with one argument.
    public int compareTo(CompareToNotOverloadedCheck other) {
        return 0;
    }

    // Compliant - compareTo method implemented in interface.
    public int compareTo(String other) {
        return 0;
    }

    public static void main(String[] args) {
        CompareToNotOverloadedCheck obj = new CompareToNotOverloadedCheck();
        obj.compareTo(new Object());
        obj.compareTo(new Object(), 1);
        obj.compareTo(new CompareToNotOverloadedCheck());
        obj.compareTo("test");
    }
}
