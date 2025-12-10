public class ReplaceLambdaByMethodRefCheck {

    public void nonCompliantExamples() {
        // Example 1
        java.util.List<String> strings = java.util.Arrays.asList("a", "b", "c");
        strings.forEach(s -> System.out.println(s)); // Noncompliant

        // Example 2
        java.util.List<Integer> numbers = java.util.Arrays.asList(1, 2, 3);
        numbers.stream().map(n -> n * 2).forEach(n -> System.out.println(n)); // Noncompliant
    }

    public void compliantExamples() {
        // Example 1
        java.util.List<String> strings = java.util.Arrays.asList("a", "b", "c");
        strings.forEach(System.out::println);

        // Example 2
        java.util.List<Integer> numbers = java.util.Arrays.asList(1, 2, 3);
        numbers.stream().map(n -> n * 2).forEach(System.out::println);
    }

    public static void main(String[] args) {
        ReplaceLambdaByMethodRefCheck test = new ReplaceLambdaByMethodRefCheck();
        test.nonCompliantExamples();
        test.compliantExamples();
    }
}
