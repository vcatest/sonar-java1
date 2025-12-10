public class StreamPeekCheck {

    // Noncompliant
    public void noncompliantExample1() {
        java.util.stream.Stream.of("a", "b", "c")
                .peek(System.out::println)
                .count();
    }

    // Noncompliant
    public void noncompliantExample2() {
        java.util.stream.Stream.of(1, 2, 3)
                .peek(x -> System.out.println("Value: " + x))
                .reduce(0, Integer::sum);
    }

    // Compliant
    public void compliantExample1() {
        java.util.stream.Stream.of("a", "b", "c")
                .forEach(System.out::println);
    }

    // Compliant
    public void compliantExample2() {
        java.util.stream.Stream.of(1, 2, 3)
                .map(x -> {
                    System.out.println("Value: " + x);
                    return x;
                })
                .reduce(0, Integer::sum);
    }
}
