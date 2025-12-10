public class RawExceptionCheck {

    public void nonCompliantExample1() {
        try {
            // Some code that might throw an exception
            int result = 10 / 0;
        } catch (Exception e) { // Noncompliant - Catching generic Exception
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    public void nonCompliantExample2() {
        try {
            // Some code that might throw an exception
            String str = null;
            System.out.println(str.length());
        } catch (Exception e) { // Noncompliant - Catching generic Exception
            e.printStackTrace();
        }
    }

    public void compliantExample1() {
        try {
            // Some code that might throw an exception
            int result = 10 / 2;
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic error: " + e.getMessage());
        }
    }

    public void compliantExample2() {
        try {
            // Some code that might throw an exception
            String str = null;
            if (str != null) {
                System.out.println(str.length());
            } else {
                System.out.println("String is null");
            }
        } catch (NullPointerException e) {
            System.err.println("Null pointer exception: " + e.getMessage());
        }
    }
}
