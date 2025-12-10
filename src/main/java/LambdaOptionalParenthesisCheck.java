public class LambdaOptionalParenthesisCheck {

    public void nonCompliantExamples() {
        // Noncompliant
        Runnable runnable1 = () -> System.out.println("Hello");

        // Noncompliant
        java.util.List<String> list = new java.util.ArrayList<>();
        list.forEach(s -> System.out.println(s));
    }

    public void compliantExamples() {
        Runnable runnable2 = ( ) -> System.out.println("Hello");

        java.util.List<String> list2 = new java.util.ArrayList<>();
        list2.forEach((String s) -> System.out.println(s));
    }

    public static void main(String[] args) {
        LambdaOptionalParenthesisCheck test = new LambdaOptionalParenthesisCheck();
        test.nonCompliantExamples();
        test.compliantExamples();
    }
}
