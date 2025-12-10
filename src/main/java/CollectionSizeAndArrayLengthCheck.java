public class CollectionSizeAndArrayLengthCheck {

    public void nonCompliantExample1() {
        int[] myArray = new int[0]; // Noncompliant
        System.out.println("Array length: " + myArray.length);
    }

    public void nonCompliantExample2() {
        java.util.ArrayList<String> myList = new java.util.ArrayList<>(); // Noncompliant
        System.out.println("List size: " + myList.size());
    }

    public void compliantExample1() {
        int[] myArray = new int[10];
        System.out.println("Array length: " + myArray.length);
    }

    public void compliantExample2() {
        java.util.ArrayList<String> myList = new java.util.ArrayList<>(5);
        System.out.println("List size: " + myList.size());
    }

    public void compliantExample3() {
        int[] myArray = new int[]{1, 2, 3};
        System.out.println("Array length: " + myArray.length);
    }

    public void nonCompliantExample3() {
        String[] stringArray = new String[0]; // Noncompliant
        for (String s : stringArray) {
            System.out.println(s);
        }
    }
}
