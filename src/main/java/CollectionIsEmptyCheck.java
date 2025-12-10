public class CollectionIsEmptyCheck {

    public void nonCompliantExample1(java.util.List<String> list) {
        if (list.size() == 0) { // Noncompliant
            System.out.println("List is empty");
        } else {
            System.out.println("List is not empty");
        }
    }

    public void nonCompliantExample2(java.util.Set<Integer> set) {
        if (set.isEmpty() == true) { // Noncompliant
            System.out.println("Set is empty");
        } else {
            System.out.println("Set is not empty");
        }
    }

    public void compliantExample1(java.util.List<String> list) {
        if (list == null || list.isEmpty()) {
            System.out.println("List is null or empty");
        } else {
            System.out.println("List is not empty");
        }
    }

    public void compliantExample2(java.util.Map<Integer, String> map) {
        if (map == null || map.isEmpty()) {
            System.out.println("Map is null or empty");
        } else {
            System.out.println("Map is not empty");
        }
    }
}
