public class PrintfFailCheck {

    public void nonCompliantExample1() {
        System.out.printf("Value is: %d", 10); // Noncompliant
    }

    public void nonCompliantExample2() {
        String name = "Alice";
        System.out.printf("Hello, %s!", name); // Noncompliant
    }

    public void compliantExample1() {
        System.out.println("Value is: " + 10);
    }

    public void compliantExample2() {
        String name = "Alice";
        System.out.println("Hello, " + name + "!");
    }

    public void compliantExample3() {
        int value = 5;
        String message = String.format("The value is %d", value);
        System.out.println(message);
    }

    public void compliantExample4() {
        String city = "New York";
        String country = "USA";
        System.out.println("City: " + city + ", Country: " + country);
    }
}
