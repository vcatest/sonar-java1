public class ConfusingVarargCheck {

    // Noncompliant - Potential ambiguity with method call and varargs
    public void example1(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum: " + sum);
    }

    public void callExample1() {
        example1(1, 2, 3); // Noncompliant - Could be interpreted as a single argument array
        example1(new int[]{4, 5, 6});
    }

    // Noncompliant - Similar ambiguity, especially with method chaining
    public String example2(String... parts) {
        StringBuilder sb = new StringBuilder();
        for (String part : parts) {
            sb.append(part);
        }
        return sb.toString();
    }

    public void callExample2() {
        String result = example2("Hello", " ", "World"); // Noncompliant
        System.out.println(result);
    }

    // Compliant - Explicit array argument
    public void example3(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum: " + sum);
    }

    public void callExample3() {
        example3(new int[]{7, 8, 9});
    }

    // Compliant - No varargs, clear argument list
    public void example4(int first, int second, int third) {
        int sum = first + second + third;
        System.out.println("Sum: " + sum);
    }

    public void callExample4() {
        example4(10, 11, 12);
    }
}
