public class ReversedMethodSequencedCollectionCheck {

    // Noncompliant - Reversed order of add and size
    public void nonCompliantExample1(java.util.List<String> list) {
        list.size();
        list.add("element");
    }

    // Noncompliant - Reversed order of get and size
    public void nonCompliantExample2(java.util.List<String> list) {
        list.size();
        list.get(0);
    }

    // Compliant - Correct order of add and size
    public void compliantExample1(java.util.List<String> list) {
        list.add("element");
        list.size();
    }

    // Compliant - Correct order of get and size
    public void compliantExample2(java.util.List<String> list) {
        list.get(0);
        list.size();
    }

    // Noncompliant - Reversed order of remove and size
    public void nonCompliantExample3(java.util.List<String> list) {
        list.size();
        list.remove(0);
    }

    // Compliant - Correct order of remove and size
    public void compliantExample3(java.util.List<String> list) {
        list.remove(0);
        list.size();
    }
}
