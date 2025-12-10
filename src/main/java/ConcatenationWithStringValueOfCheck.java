public class ConcatenationWithStringValueOfCheck {

    public void nonCompliantExample1() {
        String message = "The value is: " + String.valueOf(123); // Noncompliant
        System.out.println(message);
    }

    public void nonCompliantExample2() {
        int number = 456;
        String result = "Result: " + String.valueOf(number); // Noncompliant
        System.out.println(result);
    }

    public void compliantExample1() {
        String message = "The value is: " + 123;
        System.out.println(message);
    }

    public void compliantExample2() {
        int number = 456;
        String result = "Result: " + number;
        System.out.println(result);
    }

    public void compliantExample3() {
        String str = "Hello";
        int num = 10;
        String combined = str + num;
        System.out.println(combined);
    }

    public void nonCompliantExample3() {
        double pi = 3.14159;
        String piString = "Pi is approximately: " + String.valueOf(pi); // Noncompliant
        System.out.println(piString);
    }
}
