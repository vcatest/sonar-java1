public class ArrayDesignatorOnVariableCheck {

    public void nonCompliantExample1() {
        int[] myArray = new int[5];
        System.out.println(myArray[0]);
        int i = 0;
        System.out.println(myArray[i]); // Noncompliant
    }

    public void nonCompliantExample2() {
        String[] names = {"Alice", "Bob", "Charlie"};
        int index = 1;
        String name = names[index];
        System.out.println(name);
        System.out.println(names[index]); // Noncompliant
    }

    public void compliantExample1() {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public void compliantExample2() {
        String[] colors = {"red", "green", "blue"};
        int j = 0;
        while (j < colors.length) {
            System.out.println(colors[j]);
            j++;
        }
    }
}
