public class SpecializedFunctionalInterfacesCheck {

    // Noncompliant - Using Runnable instead of a more specific functional interface
    public void example1() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable example");
            }
        }).start(); // Noncompliant
    }

    // Noncompliant - Using Callable instead of Supplier when only a value is needed
    public void example2() {
        java.util.concurrent.Callable<String> task = () -> "Hello"; // Noncompliant
        try {
            System.out.println(task.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Compliant - Using Consumer for a simple action
    public void example3() {
        java.util.function.Consumer<String> printMessage = message -> System.out.println(message);
        printMessage.accept("Consumer example");
    }

    // Compliant - Using Function to transform a value
    public void example4() {
        java.util.function.Function<Integer, String> intToString = (number) -> String.valueOf(number);
        System.out.println(intToString.apply(123));
    }

    // Compliant - Using Predicate for a boolean test
    public void example5() {
        java.util.function.Predicate<String> isLong = s -> s.length() > 5;
        System.out.println(isLong.test("example"));
    }

    // Compliant - Using Supplier for a value without input
    public void example6() {
        java.util.function.Supplier<String> greeting = () -> "Hello, world!";
        System.out.println(greeting.get());
    }
}
