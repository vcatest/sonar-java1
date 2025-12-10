public class UndocumentedApiCheck {

    // Noncompliant
    public int calculateSum(int a, int b) {
        return a + b;
    }

    // Noncompliant
    private void doSomething() {
        System.out.println("Doing something...");
    }

    /**
     * This method calculates the product of two integers.
     * @param a The first integer.
     * @param b The second integer.
     * @return The product of a and b.
     */
    public int calculateProduct(int a, int b) {
        return a * b;
    }

    /**
     * This method prints a message to the console.
     * @param message The message to print.
     */
    private void printMessage(String message) {
        System.out.println(message);
    }

    /**
     * This method returns a greeting.
     * @return A greeting string.
     */
    public String getGreeting() {
        return "Hello, world!";
    }

    // Noncompliant
    int getValue() {
        return 10;
    }
}
