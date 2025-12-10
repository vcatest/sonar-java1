public class RedundantRecordMethodsCheck {

    // Noncompliant - Redundant getter for a record field
    public record Example1(String name) {
        public String name() { // Noncompliant
            return name;
        }
    }

    // Noncompliant - Redundant toString method for a record
    public record Example2(int value) {
        @Override
        public String toString() { // Noncompliant
            return "Example2{" +
                    "value=" + value +
                    '}';
        }
    }

    // Compliant - Simple record with no redundant methods
    public record Example3(String city, int population) {}

    // Compliant - Record with a custom method that is not redundant
    public record Example4(double x, double y) {
        public double distanceToOrigin() {
            return Math.sqrt(x * x + y * y);
        }
    }

    public static void main(String[] args) {
        // This main method is just for compilation purposes.
        Example1 e1 = new Example1("test");
        Example2 e2 = new Example2(10);
        Example3 e3 = new Example3("London", 8982000);
        Example4 e4 = new Example4(3.0, 4.0);
    }
}
