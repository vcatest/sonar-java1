public class PrintfMisuseCheck {

    public void nonCompliantExample1() {
        String name = "Alice";
        int age = 30;
        System.out.printf("Name: %s, Age: %d", name, age); // Noncompliant - printf used without checking format string against arguments
    }

    public void nonCompliantExample2() {
        double price = 19.99;
        System.out.printf("Price: %f", price); // Noncompliant - printf used without checking format string against arguments
    }

    public void compliantExample1() {
        String message = "Hello, world!";
        System.out.printf("%s%n", message);
    }

    public void compliantExample2() {
        int count = 10;
        System.out.printf("Count: %d%n", count);
    }

    public static void main(String[] args) {
        PrintfMisuseCheck test = new PrintfMisuseCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2();
        test.compliantExample1();
        test.compliantExample2();
    }
}
