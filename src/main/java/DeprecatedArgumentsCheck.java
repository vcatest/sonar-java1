public class DeprecatedArgumentsCheck {

    // Noncompliant
    public void methodWithDeprecatedArg(String arg1, @Deprecated String arg2) {
        System.out.println("Using deprecated argument: " + arg2);
    }

    // Noncompliant
    public void anotherMethodWithDeprecatedArg(int arg1, @Deprecated Object arg2) {
        System.out.println("Another deprecated argument: " + arg2);
    }

    // Compliant
    public void methodWithValidArgs(String arg1, String arg2) {
        System.out.println("Using valid arguments: " + arg1 + ", " + arg2);
    }

    // Compliant
    public void methodWithNoDeprecatedArgs(int arg1, int arg2) {
        System.out.println("Using valid arguments: " + arg1 + ", " + arg2);
    }

    public static void main(String[] args) {
        DeprecatedArgumentsCheck check = new DeprecatedArgumentsCheck();
        check.methodWithDeprecatedArg("hello", "world");
        check.anotherMethodWithDeprecatedArg(1, new Object());
        check.methodWithValidArgs("hello", "world");
        check.methodWithNoDeprecatedArgs(1, 2);
    }
}
