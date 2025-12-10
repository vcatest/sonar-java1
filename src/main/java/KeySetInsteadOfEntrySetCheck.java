public class KeySetInsteadOfEntrySetCheck {

    // Noncompliant
    public void nonCompliantExample1(java.util.Map<String, Integer> map) {
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }

    // Noncompliant
    public void nonCompliantExample2(java.util.HashMap<String, String> myMap) {
        for (String key : myMap.keySet()) {
            String value = myMap.get(key);
            System.out.println(key + ":" + value);
        }
    }

    // Compliant
    public void compliantExample1(java.util.Map<String, Integer> map) {
        for (java.util.Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }

    // Compliant
    public void compliantExample2(java.util.HashMap<String, String> myMap) {
        for (java.util.Map.Entry<String, String> entry : myMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ":" + value);
        }
    }
}
