public class IteratorNextExceptionCheck {

    public void nonCompliantExample1() {
        java.util.Iterator<String> iterator = java.util.Arrays.asList("a", "b", "c").iterator();
        while (true) {
            String s = iterator.next(); // Noncompliant
            System.out.println(s);
        }
    }

    public void nonCompliantExample2() {
        java.util.Iterator<Integer> iterator = java.util.Arrays.asList(1, 2, 3).iterator();
        try {
            while (true) {
                Integer i = iterator.next(); // Noncompliant
                System.out.println(i);
            }
        } catch (java.util.NoSuchElementException e) {
            //Catching the exception doesn't fix the underlying issue of potentially infinite next() calls
            System.out.println("End of list");
        }
    }

    public void compliantExample1() {
        java.util.Iterator<String> iterator = java.util.Arrays.asList("a", "b", "c").iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }
    }

    public void compliantExample2() {
        java.util.Iterator<Integer> iterator = java.util.Arrays.asList(1, 2, 3).iterator();
        for (Integer i : iterator) {
            System.out.println(i);
        }
    }
}
