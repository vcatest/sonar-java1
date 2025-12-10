public class RedundantStreamCollectCheck {

    // Noncompliant
    public static void example1() {
        java.util.stream.Stream<Integer> stream = java.util.stream.Stream.of(1, 2, 3);
        java.util.List<Integer> list = stream.collect(java.util.stream.Collectors.toList()); // Noncompliant
        list.forEach(System.out::println);
    }

    // Noncompliant
    public static void example2() {
        java.util.stream.Stream<String> stream = java.util.stream.Stream.of("a", "b", "c");
        java.util.List<String> list = stream.collect(java.util.stream.Collectors.toCollection(java.util.ArrayList::new)); // Noncompliant
        System.out.println(list);
    }

    // Compliant
    public static void example3() {
        java.util.stream.Stream<Integer> stream = java.util.stream.Stream.of(1, 2, 3);
        stream.forEach(System.out::println);
    }

    // Compliant
    public static void example4() {
        java.util.stream.Stream<String> stream = java.util.stream.Stream.of("a", "b", "c");
        stream.forEach(System.out::println);
    }

    public static void main(String[] args) {
        System.out.println("Running examples...");
        example1();
        example2();
        example3();
        example4();
    }
}
