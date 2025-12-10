public class LambdaTooBigCheck {

    // Noncompliant - Lambda expression is too long
    public void nonCompliantExample1() {
        Runnable task = () -> {
            String longString = "This is a very long string to demonstrate a violation of the LambdaTooBigCheck rule. It contains many characters and multiple lines of code within the lambda expression.  We are intentionally making it long to trigger the rule.  This should definitely be flagged as non-compliant.";
            System.out.println(longString);
            int sum = 0;
            for (int i = 0; i < 100; i++) {
                sum += i;
            }
            System.out.println("Sum: " + sum);
        };
        task.run();
    }

    // Noncompliant - Lambda expression with multiple statements and complex logic
    public void nonCompliantExample2() {
        java.util.function.Predicate<Integer> predicate = (n) -> {
            if (n % 2 == 0) {
                System.out.println(n + " is even");
                return true;
            } else {
                System.out.println(n + " is odd");
                if (n > 10) {
                    System.out.println(n + " is also greater than 10");
                    return false;
                } else {
                    return true;
                }
            }
        }; // Noncompliant
        System.out.println(predicate.test(5));
        System.out.println(predicate.test(12));
    }

    // Compliant - Simple lambda expression
    public void compliantExample1() {
        java.util.function.Function<Integer, Integer> square = x -> x * x;
        System.out.println(square.apply(5));
    }

    // Compliant - Lambda expression with a single return statement
    public void compliantExample2() {
        java.util.function.Predicate<String> isEmpty = s -> s.isEmpty();
        System.out.println(isEmpty.test(""));
        System.out.println(isEmpty.test("hello"));
    }

    public static void main(String[] args) {
        LambdaTooBigCheck test = new LambdaTooBigCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2();
        test.compliantExample1();
        test.compliantExample2();
    }
}
