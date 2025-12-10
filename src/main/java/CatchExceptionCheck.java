public class CatchExceptionCheck {

    public void nonCompliantExample1() {
        try {
            int result = 10 / 0;
        } catch (Exception e) { // Noncompliant
            System.err.println("An error occurred.");
        }
    }

    public void nonCompliantExample2() {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (Exception e) { // Noncompliant
            e.printStackTrace();
        }
    }

    public void compliantExample1() {
        try {
            int result = 10 / 2;
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic error occurred.");
        }
    }

    public void compliantExample2() {
        try {
            String str = "hello";
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.err.println("Null pointer exception occurred.");
        }
    }

    public static void main(String[] args) {
        CatchExceptionCheck test = new CatchExceptionCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2();
        test.compliantExample1();
        test.compliantExample2();
    }
}
