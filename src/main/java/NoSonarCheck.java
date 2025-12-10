public class NoSonarCheck {

    public void nonCompliantExample1() {
        int x = 10; // Noncompliant
        System.out.println(x);
    }

    public void nonCompliantExample2() {
        String message = "Hello"; // Noncompliant
        System.out.println(message);
    }

    public void compliantExample1() {
        int y = 20;
        String label = "y";
        System.out.println(label + ":" + y);
    }

    public void compliantExample2() {
        double pi = 3.14159;
        System.out.println("The value of pi is: " + pi);
    }
}
