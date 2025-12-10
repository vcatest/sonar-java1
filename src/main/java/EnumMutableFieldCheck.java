public class EnumMutableFieldCheck {

    // Noncompliant - Mutable field in an enum
    public enum NonCompliantEnum1 {
        INSTANCE;
        private String mutableField = "initial value";

        public String getMutableField() {
            return mutableField;
        }

        public void setMutableField(String mutableField) { // Noncompliant
            this.mutableField = mutableField;
        }
    }

    // Noncompliant - Mutable field in an enum
    public enum NonCompliantEnum2 {
        INSTANCE;
        private StringBuilder mutableField = new StringBuilder("initial value");

        public String getMutableField() {
            return mutableField.toString();
        }

        public void appendToMutableField(String text) { // Noncompliant
            mutableField.append(text);
        }
    }

    // Compliant - Final field in an enum
    public enum CompliantEnum1 {
        INSTANCE;
        private final String immutableField = "initial value";

        public String getImmutableField() {
            return immutableField;
        }
    }

    // Compliant - No mutable fields in an enum
    public enum CompliantEnum2 {
        INSTANCE;
        private int value;

        CompliantEnum2(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        NonCompliantEnum1.INSTANCE.setMutableField("new value");
        NonCompliantEnum2.INSTANCE.appendToMutableField(" appended text");

        CompliantEnum1.INSTANCE.getImmutableField();
        CompliantEnum2.INSTANCE.getValue();
    }
}
