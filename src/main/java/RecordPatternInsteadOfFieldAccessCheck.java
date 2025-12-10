public class RecordPatternInsteadOfFieldAccessCheck {

    // Noncompliant - Using field access on a record
    public void nonCompliantExample1(Point p) {
        int x = p.x(); // Noncompliant
        int y = p.y(); // Noncompliant
        System.out.println("X: " + x + ", Y: " + y);
    }

    // Noncompliant - Multiple field accesses
    public void nonCompliantExample2(Point p) {
        int sum = p.x() + p.y(); // Noncompliant
        System.out.println("Sum: " + sum);
    }

    // Compliant - Using record pattern matching
    public void compliantExample1(Object obj) {
        if (obj instanceof Point p) {
            int x = p.x();
            int y = p.y();
            System.out.println("X: " + x + ", Y: " + y);
        }
    }

    // Compliant - Using record pattern matching with variable declaration
    public void compliantExample2(Object obj) {
        if (obj instanceof Point p) {
            int x = p.x();
            int y = p.y();
            System.out.println("X: " + x + ", Y: " + y);
        }
    }

    record Point(int x, int y) {}
}
