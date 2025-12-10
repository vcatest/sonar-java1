public class CollectionConstructorReferenceCheck {

    public void nonCompliantExample1() {
        java.util.ArrayList<String> list = new java.util.ArrayList<>(java.util.Arrays.asList("a", "b", "c")); // Noncompliant
    }

    public void nonCompliantExample2() {
        java.util.HashSet<Integer> set = new java.util.HashSet<>(java.util.List.of(1, 2, 3)); // Noncompliant
    }

    public void compliantExample1() {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
    }

    public void compliantExample2() {
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
    }
}
