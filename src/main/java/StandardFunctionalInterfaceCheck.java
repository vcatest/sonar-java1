import java.util.function.Function;
import java.util.function.Predicate;

public class StandardFunctionalInterfaceCheck {

    // Noncompliant - Using a custom functional interface with a single abstract method when a standard one exists.
    interface MyFunctionalInterface {
        void doSomething(String s);
    }

    public void nonCompliantExample1() {
        MyFunctionalInterface func = s -> System.out.println(s); // Noncompliant
        func.doSomething("Hello");
    }

    // Noncompliant - Another instance of using a custom functional interface unnecessarily.
    interface AnotherFunctionalInterface {
        int calculate(int a, int b);
    }

    public void nonCompliantExample2() {
        AnotherFunctionalInterface calculator = (a, b) -> a + b; // Noncompliant
        int result = calculator.calculate(5, 3);
        System.out.println(result);
    }

    // Compliant - Using a standard functional interface (Function)
    public void compliantExample1() {
        Function<String, Void> func = s -> {
            System.out.println(s);
            return null;
        };
        func.apply("World");
    }

    // Compliant - Using a standard functional interface (Predicate)
    public void compliantExample2() {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        boolean result = isEven.test(4);
        System.out.println(result);
    }
}
