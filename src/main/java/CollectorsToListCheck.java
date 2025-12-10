public class CollectorsToListCheck {

    public void nonCompliantExample1() {
        java.util.stream.Stream<String> stream = java.util.stream.Stream.of("a", "b", "c");
        java.util.List<String> list = stream.collect(java.util.stream.Collectors.toList()); // Noncompliant
        System.out.println(list);
    }

    public void nonCompliantExample2() {
        java.util.stream.IntStream intStream = java.util.stream.IntStream.range(1, 5);
        java.util.List<Integer> integerList = intStream.boxed().collect(java.util.stream.Collectors.toList()); // Noncompliant
        System.out.println(integerList);
    }

    public void compliantExample1() {
        java.util.stream.Stream<String> stream = java.util.stream.Stream.of("a", "b", "c");
        java.util.ArrayList<String> list = stream.collect(java.util.ArrayList::new, java.util.ArrayList::add, java.util.ArrayList::addAll);
        System.out.println(list);
    }

    public void compliantExample2() {
        java.util.stream.IntStream intStream = java.util.stream.IntStream.range(1, 5);
        java.util.List<Integer> integerList = intStream.boxed().collect(java.util.LinkedList::new, java.util.LinkedList::add, java.util.LinkedList::addAll);
        System.out.println(integerList);
    }
}
