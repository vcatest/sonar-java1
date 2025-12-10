public class VolatileNonPrimitiveFieldCheck {

    // Noncompliant - Non-volatile field of a non-primitive type
    private String nonVolatileString;

    // Noncompliant - Non-volatile field of a non-primitive type
    private Object nonVolatileObject;

    // Compliant - Volatile field of a non-primitive type
    private volatile List<Integer> volatileList;

    // Compliant - Primitive field (no volatility needed)
    private int primitiveInt;

    public void setNonVolatileString(String value) {
        this.nonVolatileString = value;
    }

    public String getNonVolatileString() {
        return this.nonVolatileString;
    }

    public void setNonVolatileObject(Object value) {
        this.nonVolatileObject = value;
    }

    public Object getNonVolatileObject() {
        return this.nonVolatileObject;
    }

    public void setVolatileList(List<Integer> value) {
        this.volatileList = value;
    }

    public List<Integer> getVolatileList() {
        return this.volatileList;
    }

    public int getPrimitiveInt() {
        return primitiveInt;
    }

    public void setPrimitiveInt(int primitiveInt) {
        this.primitiveInt = primitiveInt;
    }
}
