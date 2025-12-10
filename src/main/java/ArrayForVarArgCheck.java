public class ArrayForVarArgCheck {

    public void nonCompliantExample1(String... args) {
        String[] myArray = {"hello", "world"};
        myMethod(myArray); // Noncompliant
    }

    public void myMethod(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    public void nonCompliantExample2(int... numbers) {
        int[] nums = {1, 2, 3};
        anotherMethod(nums); // Noncompliant
    }

    public void anotherMethod(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum: " + sum);
    }

    public void compliantExample1(String... args) {
        myMethod(args);
    }

    public void compliantExample2(int... numbers) {
        anotherMethod(numbers);
    }

    public void compliantExample3(String[] args) {
        myMethod(args);
    }

    public void compliantExample4(int[] numbers) {
        anotherMethod(numbers);
    }
}
