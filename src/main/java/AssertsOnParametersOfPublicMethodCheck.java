public class AssertsOnParametersOfPublicMethodCheck {

    // Noncompliant - Asserting on a public method parameter
    public void publicMethodWithAssertion(String input) {
        assert input != null : "Input cannot be null";
    }

    // Noncompliant - Asserting on a public method parameter
    public int calculate(int value) {
        assert value > 0 : "Value must be positive";
        return value * 2;
    }

    // Compliant - No assertion on public method parameters
    public String greet(String name) {
        String greeting = "Hello, " + name + "!";
        return greeting;
    }

    // Compliant - Assertion is within a private helper method
    public void processData(String data) {
        validateData(data);
        // ... rest of the processing logic
    }

    private void validateData(String data) {
        assert data != null : "Data cannot be null"; // Assertion is in a private method
    }
}
