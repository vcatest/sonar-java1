public class ReturnEmptyArrayNotNullCheck {

    // Noncompliant
    public String[] getArray1() {
        String[] arr = new String[0];
        return arr; // Noncompliant
    }

    // Noncompliant
    public Integer[] getArray2() {
        Integer[] arr = {};
        return arr; // Noncompliant
    }

    // Compliant
    public String[] getArray3() {
        if (someCondition()) {
            return null;
        }
        return new String[0];
    }

    private boolean someCondition() {
        return false;
    }

    // Compliant
    public Integer[] getArray4() {
        Integer[] arr = new Integer[0];
        if (anotherCondition()) {
            return null;
        }
        return arr;
    }

    private boolean anotherCondition() {
        return true;
    }
}
