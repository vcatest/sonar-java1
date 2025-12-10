public class ConfusingOverloadCheck {

    // Noncompliant - Overloaded methods with similar parameters but different types.
    public void process(int a, String b) {
        System.out.println("Processing int and String");
    }
    public void process(String a, int b) { // Noncompliant
        System.out.println("Processing String and int");
    }

    // Noncompliant - Overloaded methods where the order of parameters is confusing.
    public void calculate(double x, double y) {
        System.out.println("Calculating x and y");
    }
    public void calculate(double y, double x) { // Noncompliant
        System.out.println("Calculating y and x");
    }

    // Compliant - Methods with distinct parameter lists.
    public void display(String message) {
        System.out.println("Displaying message: " + message);
    }
    public void display(int number) {
        System.out.println("Displaying number: " + number);
    }

    // Compliant - Methods with clearly different parameter types and order.
    public void update(String key, int value) {
        System.out.println("Updating key: " + key + ", value: " + value);
    }
    public void update(int id, String name) {
        System.out.println("Updating id: " + id + ", name: " + name);
    }
}
