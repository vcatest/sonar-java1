public class MathClampMethodsCheck {

    public void nonCompliantExample1() {
        int value = 10;
        int min = 0;
        int max = 5;
        int clampedValue = Math.max(min, Math.min(value, max)); // Noncompliant
    }

    public void nonCompliantExample2() {
        double value = 2.5;
        double min = 1.0;
        double max = 3.0;
        double clampedValue = Math.max(min, Math.min(value, max)); // Noncompliant
    }

    public void compliantExample1() {
        int value = 10;
        int min = 0;
        int max = 5;
        int clampedValue = Math.max(min, value);
        if (clampedValue > max) {
            clampedValue = max;
        }
    }

    public void compliantExample2() {
        double value = 2.5;
        double min = 1.0;
        double max = 3.0;
        double clampedValue = Math.max(min, value);
        if (clampedValue > max) {
            clampedValue = max;
        }
    }
}
