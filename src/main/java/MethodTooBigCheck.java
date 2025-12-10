public class MethodTooBigCheck {

    // Noncompliant - Method is too long
    public void veryLongMethod() {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        String message = "The sum is: " + sum;
        System.out.println(message);
        if (sum > 5000) {
            System.out.println("Sum is greater than 5000");
        } else {
            System.out.println("Sum is less than or equal to 5000");
        }
        // More code to make it longer
        String longString = "This is a very long string to add to the method length. " +
                            "It's purpose is solely to violate the MethodTooBigCheck rule. " +
                            "We are adding more and more text to ensure the method exceeds the limit. " +
                            "This is just filler to make the method longer. " +
                            "And even more filler to really push the line count up.";
        System.out.println(longString);
        // Even more code
        int anotherSum = 0;
        for (int j = 100; j < 200; j++) {
            anotherSum += j;
        }
        System.out.println("Another sum: " + anotherSum);
    } // Noncompliant

    // Noncompliant - Another long method
    public String anotherVeryLongMethod(int a, int b, String inputString) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 50; i++) {
            result.append(a + b);
            result.append(inputString);
        }
        String finalResult = result.toString();
        if (finalResult.length() > 1000) {
            return "Result is too long";
        } else {
            return finalResult;
        }
        // More code to make it longer
        String filler = "This is filler text to make the method longer. " +
                       "It's added to ensure the method violates the rule. " +
                       "We are adding more and more text to increase the line count. " +
                       "This is just for testing purposes. " +
                       "And even more filler to really push the line count up.";
        System.out.println(filler);
        // Even more code
        int calculation = a * b;
        String calculationString = String.valueOf(calculation);
        return calculationString;
    } // Noncompliant

    // Compliant - Short and concise method
    public int add(int a, int b) {
        return a + b;
    }

    // Compliant - Method with a reasonable length
    public String greet(String name) {
        return "Hello, " + name + "!";
    }
}
