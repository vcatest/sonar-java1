public class DefaultInitializedFieldCheck {

    // Noncompliant
    private int nonInitializedField;

    public int getNonInitializedField() {
        return nonInitializedField;
    }

    // Noncompliant
    private String anotherNonInitializedField;

    public String getAnotherNonInitializedField() {
        return anotherNonInitializedField;
    }

    // Compliant
    private int initializedField = 0;

    public int getInitializedField() {
        return initializedField;
    }

    // Compliant
    private String initializedStringField = "";

    public String getInitializedStringField() {
        return initializedStringField;
    }

    public static void main(String[] args) {
        DefaultInitializedFieldCheck test = new DefaultInitializedFieldCheck();
        System.out.println(test.getNonInitializedField());
        System.out.println(test.getAnotherNonInitializedField());
        System.out.println(test.getInitializedField());
        System.out.println(test.getInitializedStringField());
    }
}
