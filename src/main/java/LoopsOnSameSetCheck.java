public class LoopsOnSameSetCheck {

    // Noncompliant - Iterating over the same collection multiple times without storing the result.
    public void nonCompliantExample1(int[] data) {
        for (int i = 0; i < data.length; i++) { // Noncompliant
            System.out.println(data[i]);
        }
        for (int i = 0; i < data.length; i++) { // Noncompliant
            System.out.println(data[i] * 2);
        }
    }

    // Noncompliant - Nested loops iterating over the same collection.
    public void nonCompliantExample2(String[] names) {
        for (String name : names) { // Noncompliant
            for (String otherName : names) { // Noncompliant
                System.out.println(name + " " + otherName);
            }
        }
    }

    // Compliant - Storing the collection in a variable and iterating over it once.
    public void compliantExample1(int[] numbers) {
        int[] localNumbers = numbers;
        for (int number : localNumbers) {
            System.out.println(number);
        }
    }

    // Compliant - Using streams to process the collection once.
    public void compliantExample2(List<String> items) {
        items.stream()
                .forEach(item -> System.out.println(item.toUpperCase()));
    }

    // Compliant - Iterating over different collections.
    public void compliantExample3(int[] data1, int[] data2) {
        for (int i = 0; i < data1.length; i++) {
            System.out.println(data1[i]);
        }
        for (int i = 0; i < data2.length; i++) {
            System.out.println(data2[i]);
        }
    }

    // Compliant - Using a single loop with multiple operations.
    public void compliantExample4(int[] values) {
        for (int value : values) {
            System.out.println(value);
            System.out.println(value * 2);
        }
    }
}

import java.util.List;
