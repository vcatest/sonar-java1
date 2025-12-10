public class IterableIteratorCheck {

    // Noncompliant
    public void nonCompliantExample1() {
        java.util.List<String> list = java.util.Arrays.asList("a", "b", "c");
        for (java.util.Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) { // Noncompliant
            String element = iterator.next();
            System.out.println(element);
        }
    }

    // Noncompliant
    public void nonCompliantExample2() {
        java.util.Set<Integer> set = new java.util.HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        java.util.Iterator<Integer> iterator = set.iterator(); // Noncompliant
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(number);
        }
    }

    // Compliant
    public void compliantExample1() {
        java.util.List<String> list = java.util.Arrays.asList("a", "b", "c");
        for (String element : list) {
            System.out.println(element);
        }
    }

    // Compliant
    public void compliantExample2() {
        java.util.Set<Integer> set = new java.util.HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.forEach(number -> System.out.println(number));
    }
}
