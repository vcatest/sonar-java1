public class LongBitsToDoubleOnIntCheck {

    public void nonCompliantExample1(long longValue) {
        int intValue = (int) longValue;
        double doubleValue = Double.longBitsToDouble(longValue);
        if (intValue == 0) { // Noncompliant
            System.out.println("Long value is effectively zero as an int.");
        }
    }

    public void nonCompliantExample2(long longValue) {
        int intValue = (int) longValue;
        double doubleValue = Double.longBitsToDouble(longValue);
        if (intValue > 0) { // Noncompliant
            System.out.println("Long value is positive as an int.");
        }
    }

    public void compliantExample1(long longValue) {
        double doubleValue = Double.longBitsToDouble(longValue);
        if (doubleValue == 0.0) {
            System.out.println("Long value is effectively zero as a double.");
        }
    }

    public void compliantExample2(long longValue) {
        double doubleValue = Double.longBitsToDouble(longValue);
        if (doubleValue > 0.0) {
            System.out.println("Long value is positive as a double.");
        }
    }
}
