public class LambdaTypeParameterCheck {

    // Noncompliant
    public void nonCompliantExample1() {
        Runnable r = () -> {
            int x = 10;
            System.out.println(x);
        };
        r.run();
    }

    // Noncompliant
    public void nonCompliantExample2() {
        java.util.function.Consumer<String> consumer = s -> {
            System.out.println(s.length());
        };
        consumer.accept("hello");
    }

    // Compliant
    public void compliantExample1() {
        java.util.function.Function<Integer, String> function = (Integer i) -> String.valueOf(i);
        System.out.println(function.apply(5));
    }

    // Compliant
    public void compliantExample2() {
        java.util.function.Predicate<String> predicate = (String s) -> s.length() > 0;
        System.out.println(predicate.test("test"));
    }

    public static void main(String[] args) {
        LambdaTypeParameterCheck test = new LambdaTypeParameterCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2();
        test.compliantExample1();
        test.compliantExample2();
    }
}
