public class HasNextCallingNextCheck {

    public void nonCompliantExample1(java.util.Iterator<String> iterator) {
        while (iterator.hasNext()) { // Noncompliant
            String next = iterator.next();
            System.out.println(next);
        }
    }

    public void nonCompliantExample2(java.util.List<Integer> list) {
        java.util.Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) { // Noncompliant
            Integer value = iterator.next();
            System.out.println(value);
        }
    }

    public void compliantExample1(java.util.Iterator<String> iterator) {
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }

    public void compliantExample2(java.util.List<Integer> list) {
        for (Integer value : list) {
            System.out.println(value);
        }
    }

    public void compliantExample3(java.util.Iterator<String> iterator) {
        if (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
