public class CollectionInappropriateCallsCheck {

    // Noncompliant - Using size() on a potentially null collection
    public void nonCompliantExample1(java.util.List<String> list) {
        if (list.size() > 0) {
            System.out.println("List has elements");
        }
    }

    // Noncompliant - Calling get() on a potentially null collection without checking for null
    public void nonCompliantExample2(java.util.List<Integer> numbers) {
        int firstElement = numbers.get(0); // Noncompliant
        System.out.println("First element: " + firstElement);
    }

    // Compliant - Checking for null before calling size()
    public void compliantExample1(java.util.List<String> list) {
        if (list != null && list.size() > 0) {
            System.out.println("List has elements");
        }
    }

    // Compliant - Checking for null before calling get()
    public void compliantExample2(java.util.List<Integer> numbers) {
        if (numbers != null && !numbers.isEmpty()) {
            int firstElement = numbers.get(0);
            System.out.println("First element: " + firstElement);
        }
    }

    // Compliant - Using isEmpty() instead of size() > 0
    public void compliantExample3(java.util.List<String> list) {
        if (list != null && !list.isEmpty()) {
            System.out.println("List has elements");
        }
    }

    // Noncompliant - Calling iterator() on a potentially null collection
    public void nonCompliantExample3(java.util.List<String> list) {
        java.util.Iterator<String> iterator = list.iterator(); // Noncompliant
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
