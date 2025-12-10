public class JacksonDeserializationCheck {

    // Noncompliant - Using default constructor without explicit deserialization protection
    public class NonCompliantClass1 {
        private String sensitiveData;

        public NonCompliantClass1() {} // Noncompliant

        public String getSensitiveData() {
            return sensitiveData;
        }
    }

    // Noncompliant - Using a setter without validation
    public class NonCompliantClass2 {
        private String sensitiveData;

        public void setSensitiveData(String sensitiveData) { // Noncompliant
            this.sensitiveData = sensitiveData;
        }

        public String getSensitiveData() {
            return sensitiveData;
        }
    }

    // Compliant - Using a private constructor and factory method
    public class CompliantClass1 {
        private final String sensitiveData;

        private CompliantClass1(String sensitiveData) {
            this.sensitiveData = sensitiveData;
        }

        public static CompliantClass1 create(String sensitiveData) {
            // Add validation logic here if needed
            return new CompliantClass1(sensitiveData);
        }

        public String getSensitiveData() {
            return sensitiveData;
        }
    }

    // Compliant - Using a final field and no setters
    public class CompliantClass2 {
        private final String sensitiveData;

        public CompliantClass2(String sensitiveData) {
            this.sensitiveData = sensitiveData;
        }

        public String getSensitiveData() {
            return sensitiveData;
        }
    }
}
