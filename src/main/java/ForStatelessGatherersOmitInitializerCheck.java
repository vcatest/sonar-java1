public class ForStatelessGatherersOmitInitializerCheck {

    // Noncompliant - Initializing a field in a stateless gatherer.
    private int count = 0; 

    public void nonCompliantExample1() {
        count++;
        System.out.println("Count: " + count);
    }

    // Noncompliant - Initializing a field with a non-constant value.
    private String message = "Initial Value";

    public void nonCompliantExample2() {
        message = "Updated Value";
        System.out.println(message);
    }

    // Compliant - No initialization.  Field is only assigned within the method.
    private int value;

    public void compliantExample1(int initialValue) {
        value = initialValue;
        System.out.println("Value: " + value);
    }

    // Compliant - Field is final and initialized directly.
    private final int constantValue = 10;

    public void compliantExample2() {
        System.out.println("Constant Value: " + constantValue);
    }
}
