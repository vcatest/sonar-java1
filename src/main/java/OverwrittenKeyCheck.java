public class OverwrittenKeyCheck {

    // Noncompliant - Overwriting a key in a map with a different value.
    public void nonCompliantExample1(java.util.Map<String, Integer> map) {
        map.put("key1", 10);
        map.put("key1", 20); // Noncompliant
    }

    // Noncompliant - Overwriting a key in a map with a null value.
    public void nonCompliantExample2(java.util.Map<String, String> map) {
        map.put("key2", "value1");
        map.put("key2", null); // Noncompliant
    }

    // Compliant - Adding a new key to the map.
    public void compliantExample1(java.util.Map<String, Double> map) {
        map.put("key3", 3.14);
        map.put("key4", 2.71);
    }

    // Compliant - Retrieving a value from the map without modification.
    public void compliantExample2(java.util.Map<String, Boolean> map) {
        map.put("key5", true);
        boolean value = map.get("key5");
        System.out.println(value);
    }

    public static void main(String[] args) {
        OverwrittenKeyCheck test = new OverwrittenKeyCheck();
        java.util.Map<String, Integer> map1 = new java.util.HashMap<>();
        test.nonCompliantExample1(map1);

        java.util.Map<String, String> map2 = new java.util.HashMap<>();
        test.nonCompliantExample2(map2);

        java.util.Map<String, Double> map3 = new java.util.HashMap<>();
        test.compliantExample1(map3);

        java.util.Map<String, Boolean> map4 = new java.util.HashMap<>();
        test.compliantExample2(map4);
    }
}
