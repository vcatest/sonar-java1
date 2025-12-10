public class ToArrayCheck {

    public void nonCompliantExample1() {
        String[] arr = {"a", "b", "c"};
        Object[] objArr = arr.clone(); // Noncompliant
        System.out.println(objArr[0]);
    }

    public void nonCompliantExample2() {
        Integer[] numbers = {1, 2, 3};
        Object[] objects = numbers.toArray(); // Noncompliant
        for (Object obj : objects) {
            System.out.println(obj);
        }
    }

    public void compliantExample1() {
        String[] arr = {"a", "b", "c"};
        String[] newArr = new String[arr.length];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        System.out.println(newArr[0]);
    }

    public void compliantExample2() {
        Integer[] numbers = {1, 2, 3};
        Integer[] newNumbers = new Integer[numbers.length];
        System.arraycopy(numbers, 0, newNumbers, 0, numbers.length);
        for (Integer number : newNumbers) {
            System.out.println(number);
        }
    }
}
