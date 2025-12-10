public class TabCharacterCheck {

    public void nonCompliantExample1() {
        String message = "This\tstring\tcontains\ttabs."; // Noncompliant
        System.out.println(message);
    }

    public void nonCompliantExample2() {
        int[] numbers = {1, 2, 3, \t4, 5}; // Noncompliant
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public void compliantExample1() {
        String message = "This string contains spaces.";
        System.out.println(message);
    }

    public void compliantExample2() {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public void compliantExample3() {
        String multiLineString = "This is a string\n" +
                                 "that spans multiple lines\n" +
                                 "without using tabs.";
        System.out.println(multiLineString);
    }
}
