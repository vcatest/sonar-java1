public class MapKeyNotComparableCheck {

    public void nonCompliantExample1() {
        java.util.HashMap<Object, String> map = new java.util.HashMap<>();
        map.put(new Object(), "value1"); // Noncompliant
        map.put("key2", "value2");
    }

    public void nonCompliantExample2() {
        java.util.HashMap<java.util.Date, Integer> dateMap = new java.util.HashMap<>();
        dateMap.put(new java.util.Date(), 1); // Noncompliant
        dateMap.put(new java.util.Date(), 2);
    }

    public void compliantExample1() {
        java.util.HashMap<String, Integer> stringMap = new java.util.HashMap<>();
        stringMap.put("key1", 1);
        stringMap.put("key2", 2);
    }

    public void compliantExample2() {
        java.util.HashMap<Integer, String> integerMap = new java.util.HashMap<>();
        integerMap.put(1, "value1");
        integerMap.put(2, "value2");
    }
}
