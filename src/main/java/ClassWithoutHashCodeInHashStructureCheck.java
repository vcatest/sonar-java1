public class ClassWithoutHashCodeInHashStructureCheck {

    // Noncompliant - Using object in a HashSet without overriding hashCode()
    public class NonCompliantClass1 {
        private int value;

        public NonCompliantClass1(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    // Noncompliant - Using object as a key in a HashMap without overriding hashCode()
    public class NonCompliantClass2 {
        private String name;

        public NonCompliantClass2(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    // Compliant - Overriding hashCode() and equals()
    public class CompliantClass1 {
        private int value;

        public CompliantClass1(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        @Override
        public int hashCode() {
            return value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            CompliantClass1 other = (CompliantClass1) obj;
            return value == other.value;
        }
    }

    // Compliant - Using a class with hashCode() overridden correctly
    public class CompliantClass2 {
        private String name;

        public CompliantClass2(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public int hashCode() {
            return name.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            CompliantClass2 other = (CompliantClass2) obj;
            return name.equals(other.name);
        }
    }
}
