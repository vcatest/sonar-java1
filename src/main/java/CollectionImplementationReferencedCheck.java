public class CollectionImplementationReferencedCheck {

    // Noncompliant - Directly referencing ArrayList
    public void nonCompliantExample1() {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        list.add("Hello"); // Noncompliant
    }

    // Noncompliant - Directly referencing LinkedList
    public void nonCompliantExample2() {
        java.util.LinkedList<Integer> linkedList = new java.util.LinkedList<>();
        linkedList.add(1); // Noncompliant
    }

    // Compliant - Using interface Collection
    public void compliantExample1() {
        java.util.Collection<Double> collection = new java.util.HashSet<>();
        collection.add(3.14);
    }

    // Compliant - Using interface List
    public void compliantExample2() {
        java.util.List<Boolean> list = new java.util.ArrayList<>();
        list.add(true);
    }

    // Compliant - Using interface Set
    public void compliantExample3() {
        java.util.Set<String> set = new java.util.HashSet<>();
        set.add("World");
    }

    // Noncompliant - Directly referencing Vector
    public void nonCompliantExample3() {
        java.util.Vector<Long> vector = new java.util.Vector<>();
        vector.add(12345L); // Noncompliant
    }
}
