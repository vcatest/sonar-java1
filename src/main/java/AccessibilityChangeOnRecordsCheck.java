public class AccessibilityChangeOnRecordsCheck {

    // Noncompliant - Changing accessibility of a record field after initialization.
    private String myRecordField = "initialValue";
    public void nonCompliantExample1() {
        myRecordField = null; // Noncompliant
    }

    // Noncompliant - Changing accessibility of a record field after initialization.
    private final String anotherRecordField = "anotherInitialValue";
    public void nonCompliantExample2() {
        anotherRecordField = "newValue"; // Noncompliant - even though final, attempting reassignment is a violation
    }

    // Compliant - Initializing the record field is allowed.
    private String compliantRecordField;
    public void compliantExample1() {
        compliantRecordField = "initialValue";
    }

    // Compliant - Using the record field without changing its accessibility after initialization.
    private String yetAnotherRecordField = "yetAnotherInitialValue";
    public void compliantExample2() {
        String value = yetAnotherRecordField;
        System.out.println(value);
    }

    // Compliant - Record field is final and initialized, no further changes.
    private final String finalRecordField = "finalInitialValue";
    public void compliantExample3() {
        // No modification of finalRecordField
    }

    // Noncompliant - Changing accessibility of a record field after initialization.
    private String recordFieldWithGetter = "initialValue";
    public String getRecordFieldWithGetter() {
        return recordFieldWithGetter;
    }
    public void nonCompliantExample3() {
        recordFieldWithGetter = null; // Noncompliant
    }
}
