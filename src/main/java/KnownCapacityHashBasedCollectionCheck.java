public class KnownCapacityHashBasedCollectionCheck {

    public void nonCompliantExample1() {
        java.util.HashMap<String, Integer> map = new java.util.HashMap<>(10); // Noncompliant
        for (int i = 0; i < 15; i++) {
            map.put("key" + i, i);
        }
    }

    public void nonCompliantExample2() {
        java.util.HashSet<String> set = new java.util.HashSet<>(5); // Noncompliant
        for (int i = 0; i < 8; i++) {
            set.add("element" + i);
        }
    }

    public void compliantExample1() {
        java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("key" + i, i);
        }
    }

    public void compliantExample2() {
        java.util.HashSet<String> set = new java.util.HashSet<>();
        for (int i = 0; i < 5; i++) {
            set.add("element" + i);
        }
    }

    public void compliantExample3() {
        java.util.HashMap<String, Integer> map = new java.util.HashMap<>(100);
        for (int i = 0; i < 100; i++) {
            map.put("key" + i, i);
        }
    }
}
