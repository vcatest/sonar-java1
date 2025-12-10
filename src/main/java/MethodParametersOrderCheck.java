public class MethodParametersOrderCheck {

    // Noncompliant - Incorrect parameter order. String should come before int.
    public void nonCompliantMethod1(String message, int count) {
        System.out.println(message + " - " + count);
    }

    // Noncompliant - Incorrect parameter order. int should come before String.
    public void nonCompliantMethod2(int id, String name) {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    // Compliant - Correct parameter order. int comes before String.
    public void compliantMethod1(int age, String city) {
        System.out.println("Age: " + age + ", City: " + city);
    }

    // Compliant - Correct parameter order. String comes before int.
    public void compliantMethod2(String product, int quantity) {
        System.out.println("Product: " + product + ", Quantity: " + quantity);
    }

    // Compliant - Correct parameter order. int comes before boolean.
    public void compliantMethod3(int value, boolean isValid) {
        System.out.println("Value: " + value + ", Is Valid: " + isValid);
    }

    // Noncompliant - Incorrect parameter order. boolean should come before int.
    public void nonCompliantMethod3(boolean flag, int number) {
        System.out.println("Flag: " + flag + ", Number: " + number);
    }
}
