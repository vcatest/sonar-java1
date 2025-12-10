public class LambdaSingleExpressionCheck {

    public void nonCompliantExamples() {
        // Noncompliant
        Runnable runnable1 = () -> {
            System.out.println("Hello");
            System.out.println("World");
        };

        // Noncompliant
        java.util.function.Function<Integer, Integer> function1 = (x) -> {
            int y = x * 2;
            return y;
        };
    }

    public void compliantExamples() {
        Runnable runnable2 = () -> System.out.println("Hello");

        java.util.function.Function<Integer, Integer> function2 = x -> x * 2;
    }

    public static void main(String[] args) {
        LambdaSingleExpressionCheck test = new LambdaSingleExpressionCheck();
        test.nonCompliantExamples();
        test.compliantExamples();
    }
}
