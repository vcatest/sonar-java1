public class RawTypeCheck {

    public void nonCompliantExample1() {
        java.util.ArrayList list = new java.util.ArrayList(); // Noncompliant
        list.add("test");
        list.add(1);
    }

    public void nonCompliantExample2() {
        java.util.HashMap map = new java.util.HashMap(); // Noncompliant
        map.put("key", "value");
        map.put(1, 1.0);
    }

    public void compliantExample1() {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        list.add("test");
    }

    public void compliantExample2() {
        java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
        map.put("key", 1);
    }

    public void compliantExample3() {
        java.util.List<Double> doubleList = new java.util.ArrayList<>();
        doubleList.add(3.14);
    }

    public void nonCompliantExample3() {
        java.util.Vector v = new java.util.Vector(); // Noncompliant
        v.add(1);
        v.add("string");
    }
}
