public class SuspiciousListRemoveCheck {

    // Noncompliant - Removing elements from a list while iterating using a simple for loop can lead to skipped elements.
    public void nonCompliantExample1(java.util.List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("removeMe")) {
                list.remove(i); // Noncompliant
                i--; // Necessary to avoid skipping elements, but still problematic
            }
        }
    }

    // Noncompliant - Similar issue as above, removing during iteration with a for loop.
    public void nonCompliantExample2(java.util.List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i); // Noncompliant
            }
        }
    }

    // Compliant - Using an Iterator to safely remove elements during iteration.
    public void compliantExample1(java.util.List<String> list) {
        java.util.Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("removeMe")) {
                iterator.remove();
            }
        }
    }

    // Compliant - Using a stream to filter the list and create a new list without modifying the original during iteration.
    public void compliantExample2(java.util.List<Integer> numbers) {
        java.util.List<Integer> oddNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(java.util.stream.Collectors.toList());
        numbers.clear();
        numbers.addAll(oddNumbers);
    }
}
