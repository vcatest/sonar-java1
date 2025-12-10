public class MathClampRangeCheck {

    public void nonCompliantExample1(int value, int min, int max) {
        int clampedValue = Math.max(min, Math.min(value, max)); // Noncompliant
        System.out.println(clampedValue);
    }

    public void nonCompliantExample2(double value, double min, double max) {
        double clampedValue = Math.max(min, Math.min(value, max)); // Noncompliant
        System.out.println(clampedValue);
    }

    public void compliantExample1(int value, int min, int max) {
        if (value < min) {
            value = min;
        } else if (value > max) {
            value = max;
        }
        System.out.println(value);
    }

    public void compliantExample2(double value, double min, double max) {
        if (value < min) {
            value = min;
        } else if (value > max) {
            value = max;
        }
        System.out.println(value);
    }

    public static void main(String[] args) {
        MathClampRangeCheck test = new MathClampRangeCheck();
        test.nonCompliantExample1(5, 1, 10);
        test.nonCompliantExample2(15.5, 1.0, 10.0);
        test.compliantExample1(12, 1, 10);
        test.compliantExample2(0.5, 1.0, 10.0);
    }
}
