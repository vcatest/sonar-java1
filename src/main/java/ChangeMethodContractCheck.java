public class ChangeMethodContractCheck {

    // Noncompliant - Adding a new exception type to a throws clause
    public void method1(int x) throws IllegalArgumentException, NullPointerException {
        if (x < 0) {
            throw new IllegalArgumentException("x must be positive");
        }
        System.out.println("x is: " + x);
    }

    // Noncompliant - Changing the return type of a method
    public String method2(int x) { // Originally returned void
        return String.valueOf(x);
    }

    // Compliant - Adding a parameter without changing the contract
    public void method3(int x, String message) {
        System.out.println(message + ": " + x);
    }

    // Compliant - No change to method signature or throws clause
    public void method4(int x) {
        System.out.println("x is: " + x);
    }

    public static void main(String[] args) {
        ChangeMethodContractCheck test = new ChangeMethodContractCheck();
        test.method1(5);
        String result = test.method2(10);
        System.out.println(result);
        test.method3(7, "Value");
        test.method4(3);
    }
}
