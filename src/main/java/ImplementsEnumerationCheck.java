public class ImplementsEnumerationCheck {

    // Noncompliant - Using a raw type for an enumeration-like structure
    public class NoncompliantExample1 {
        private java.util.List values = new java.util.ArrayList(); // Noncompliant

        public void addValue(String value) {
            values.add(value);
        }

        public java.util.List getValues() {
            return values;
        }
    }

    // Noncompliant - Using an int constant instead of an enum
    public class NoncompliantExample2 {
        public static final int STATUS_ACTIVE = 1; // Noncompliant
        public static final int STATUS_INACTIVE = 0; // Noncompliant

        private int status;

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }
    }

    // Compliant - Using an enum
    public enum CompliantExample1 {
        STATUS_ACTIVE,
        STATUS_INACTIVE
    }

    // Compliant - Using a String constant with a dedicated class
    public class CompliantExample2 {
        public static final String STATUS_ACTIVE = "ACTIVE";
        public static final String STATUS_INACTIVE = "INACTIVE";

        private String status;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
}
