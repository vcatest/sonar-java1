public class CollectionCallingItselfCheck {

    // Noncompliant - Calling add() on the same list within a loop can lead to infinite loops or unexpected behavior.
    public void nonCompliantExample1(java.util.ArrayList<String> list) {
        while (true) {
            list.add("test"); // Noncompliant
        }
    }

    // Noncompliant - Recursively adding the list itself.
    public void nonCompliantExample2(java.util.ArrayList<String> list) {
        list.add(list); // Noncompliant
    }

    // Compliant - Adding elements to the list without referencing the list itself during the addition.
    public void compliantExample1(java.util.ArrayList<String> list) {
        for (int i = 0; i < 10; i++) {
            list.add("element " + i);
        }
    }

    // Compliant - Using a different collection to populate the list.
    public void compliantExample2(java.util.ArrayList<String> list, java.util.List<String> sourceList) {
        list.addAll(sourceList);
    }

    public static void main(String[] args) {
        CollectionCallingItselfCheck test = new CollectionCallingItselfCheck();
        java.util.ArrayList<String> list1 = new java.util.ArrayList<>();
        test.nonCompliantExample1(list1);

        java.util.ArrayList<String> list2 = new java.util.ArrayList<>();
        test.nonCompliantExample2(list2);

        java.util.ArrayList<String> list3 = new java.util.ArrayList<>();
        test.compliantExample1(list3);

        java.util.ArrayList<String> list4 = new java.util.ArrayList<>();
        java.util.List<String> source = new java.util.ArrayList<>();
        source.add("a");
        source.add("b");
        test.compliantExample2(list4, source);
    }
}
