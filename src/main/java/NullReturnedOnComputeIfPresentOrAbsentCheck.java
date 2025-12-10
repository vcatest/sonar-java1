public class NullReturnedOnComputeIfPresentOrAbsentCheck {

    public void nonCompliantExample1() {
        java.util.Map<String, Integer> map = new java.util.HashMap<>();
        Integer value = map.computeIfPresentOrAbsent("key", k -> null); // Noncompliant
        if (value == null) {
            System.out.println("Value is null");
        }
    }

    public void nonCompliantExample2() {
        java.util.Map<String, String> map = new java.util.HashMap<>();
        String result = map.computeIfPresentOrAbsent("anotherKey", k -> {
            if (k.equals("anotherKey")) {
                return null;
            }
            return "someValue";
        }); // Noncompliant
        System.out.println(result);
    }

    public void compliantExample1() {
        java.util.Map<String, Integer> map = new java.util.HashMap<>();
        Integer value = map.computeIfPresentOrAbsent("key", k -> 10);
        if (value != null) {
            System.out.println("Value is: " + value);
        }
    }

    public void compliantExample2() {
        java.util.Map<String, String> map = new java.util.HashMap<>();
        String result = map.computeIfPresentOrAbsent("anotherKey", k -> {
            if (k.equals("anotherKey")) {
                return "defaultValue";
            }
            return "someValue";
        });
        System.out.println(result);
    }

    public void compliantExample3() {
        java.util.Map<String, Integer> map = new java.util.HashMap<>();
        map.put("existingKey", 5);
        Integer value = map.computeIfPresentOrAbsent("existingKey", k -> k + 1);
        System.out.println(value);
    }

    public void nonCompliantExample3() {
        java.util.Map<String, Double> map = new java.util.HashMap<>();
        Double result = map.computeIfPresentOrAbsent("testKey", k -> {
            return null;
        }); // Noncompliant
        System.out.println(result);
    }
}
