public class CollectionMethodsWithLinearComplexityCheck {

    // Noncompliant - Using contains() on a large list can lead to linear complexity.
    public boolean checkContains(java.util.List<String> list, String element) {
        return list.contains(element); // Noncompliant
    }

    // Noncompliant - Iterating through a list to check for existence is linear complexity.
    public boolean checkExists(java.util.List<Integer> list, int value) {
        for (Integer item : list) {
            if (item == value) {
                return true;
            }
        }
        return false; // Noncompliant
    }

    // Compliant - Using a HashSet for membership checks provides constant time complexity.
    public boolean checkHashSetContains(java.util.HashSet<String> set, String element) {
        return set.contains(element);
    }

    // Compliant - Using a HashMap for membership checks provides constant time complexity.
    public boolean checkHashMapContainsKey(java.util.HashMap<Integer, String> map, Integer key) {
        return map.containsKey(key);
    }

    public static void main(String[] args) {
        CollectionMethodsWithLinearComplexityCheck test = new CollectionMethodsWithLinearComplexityCheck();

        java.util.List<String> largeList = new java.util.ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            largeList.add("item" + i);
        }
        test.checkContains(largeList, "item5000");

        java.util.List<Integer> intList = new java.util.ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            intList.add(i);
        }
        test.checkExists(intList, 500);

        java.util.HashSet<String> hashSet = new java.util.HashSet<>();
        for (int i = 0; i < 10000; i++) {
            hashSet.add("item" + i);
        }
        test.checkHashSetContains(hashSet, "item5000");

        java.util.HashMap<Integer, String> hashMap = new java.util.HashMap<>();
        for (int i = 0; i < 1000; i++) {
            hashMap.put(i, "value" + i);
        }
        test.checkHashMapContainsKey(hashMap, 500);
    }
}
