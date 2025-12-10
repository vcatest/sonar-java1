import java.io.IOException;

public class CombineCatchCheck {

    // Noncompliant
    public void example1() {
        try {
            // Some code that might throw an exception
        } catch (Exception e) {
            // Handle the exception
        } catch (IOException e) {
            // Handle the IOException
        }
    }

    // Noncompliant
    public void example2() {
        try {
            // Some code that might throw an exception
        } catch (ArithmeticException e) {
            // Handle ArithmeticException
        } catch (NullPointerException e) {
            // Handle NullPointerException
        } catch (Exception e) {
            // Handle other exceptions
        }
    }

    // Compliant
    public void example3() {
        try {
            // Some code that might throw an exception
        } catch (Exception e) {
            // Handle all exceptions in one block
        }
    }

    // Compliant
    public void example4() {
        try {
            // Some code that might throw an exception
        } catch (IOException | ClassNotFoundException e) {
            // Handle IOException or ClassNotFoundException
        }
    }
}
