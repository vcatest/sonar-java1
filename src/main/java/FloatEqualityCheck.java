public class FloatEqualityCheck {

    public void nonCompliantExample1(float a, float b) {
        if (a == b) { // Noncompliant
            System.out.println("Floats are equal");
        } else {
            System.out.println("Floats are not equal");
        }
    }

    public void nonCompliantExample2(float x, float y, float z) {
        if (x == y && y == z) { // Noncompliant
            System.out.println("All floats are equal");
        } else {
            System.out.println("Not all floats are equal");
        }
    }

    public void compliantExample1(float a, float b) {
        final float EPSILON = 0.00001f;
        if (Math.abs(a - b) < EPSILON) {
            System.out.println("Floats are approximately equal");
        } else {
            System.out.println("Floats are not approximately equal");
        }
    }

    public void compliantExample2(float x, float y) {
        float difference = Math.abs(x - y);
        if (Float.compare(difference, 0.00001f) < 0) {
            System.out.println("Floats are approximately equal");
        } else {
            System.out.println("Floats are not approximately equal");
        }
    }
}
