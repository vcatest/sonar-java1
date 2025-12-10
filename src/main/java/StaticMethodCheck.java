public class StaticMethodCheck {

    // Noncompliant
    public static void myStaticMethod() {
        System.out.println("This is a static method.");
    }

    // Noncompliant
    public static int calculateSum(int a, int b) {
        return a + b; // Noncompliant
    }

    public void myInstanceMethod() {
        System.out.println("This is an instance method.");
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    // Compliant
    public static void anotherStaticMethod(String message) {
        System.out.println(message);
    }

    // Compliant
    public static double divide(double numerator, double denominator) {
        if (denominator == 0) {
            return 0;
        }
        return numerator / denominator;
    }
}
