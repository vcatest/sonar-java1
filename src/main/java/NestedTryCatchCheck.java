public class NestedTryCatchCheck {

    public void nonCompliantExample1() {
        try {
            int x = 10;
            try {
                int y = 0;
                int z = x / y; // Noncompliant
            } catch (ArithmeticException e) {
                System.err.println("Inner catch block");
            }
        } catch (Exception e) {
            System.err.println("Outer catch block");
        }
    }

    public void nonCompliantExample2() {
        try {
            String str = "abc";
            try {
                int num = Integer.parseInt(str); // Noncompliant
            } catch (NumberFormatException e) {
                System.err.println("Inner catch block");
                try {
                    //Another nested try-catch
                    int val = 5;
                    int res = val / 0; // Noncompliant
                } catch (ArithmeticException ae) {
                    System.err.println("Deeply nested catch");
                }
            }
        } catch (Exception e) {
            System.err.println("Outer catch block");
        }
    }

    public void compliantExample1() {
        try {
            int x = 10;
            int y = 0;
            int z = x / y;
        } catch (ArithmeticException e) {
            System.err.println("Catch block");
        }
    }

    public void compliantExample2() {
        try {
            String str = "abc";
            int num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.err.println("Catch block");
        }
    }

    public void compliantExample3() {
        try {
            //Some code
        } catch (Exception e) {
            //Handle exception
        } finally {
            //Finally block
        }
    }
}
