public class MutableMembersUsageCheck {

    // Noncompliant - Mutable member variable directly modified
    private int mutableValue;

    public void nonCompliantMethod1() {
        mutableValue = 10;
    }

    // Noncompliant - Mutable member variable modified through a setter
    private String mutableString;

    public void setMutableString(String mutableString) {
        this.mutableString = mutableString; // Noncompliant
    }

    // Compliant - Immutable member variable
    private final int immutableValue = 5;

    public int getImmutableValue() {
        return immutableValue;
    }

    // Compliant - Using a getter to access a mutable variable without direct modification
    private int anotherMutableValue;

    public int getAnotherMutableValue() {
        return anotherMutableValue;
    }

    public void compliantMethod() {
        int value = getAnotherMutableValue();
        // No direct modification of the member variable here.
    }
}
