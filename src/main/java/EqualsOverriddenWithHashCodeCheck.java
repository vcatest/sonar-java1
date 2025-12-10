public class EqualsOverriddenWithHashCodeCheck {

    // Noncompliant - Equals overridden without hashCode
    public class NonCompliantClass1 {
        private int value;

        public NonCompliantClass1(int value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            NonCompliantClass1 other = (NonCompliantClass1) obj;
            return value == other.value; // Noncompliant
        }
    }

    // Noncompliant - Equals overridden without hashCode
    public class NonCompliantClass2 {
        private String name;

        public NonCompliantClass2(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            NonCompliantClass2 that = (NonCompliantClass2) o;
            return name.equals(that.name); // Noncompliant
        }
    }

    // Compliant - Equals and hashCode overridden correctly
    public class CompliantClass1 {
        private int value;

        public CompliantClass1(int value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            CompliantClass1 other = (CompliantClass1) obj;
            return value == other.value;
        }

        @Override
        public int hashCode() {
            return Integer.hashCode(value);
        }
    }

    // Compliant - Equals and hashCode overridden correctly
    public class CompliantClass2 {
        private String name;

        public CompliantClass2(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CompliantClass2 that = (CompliantClass2) o;
            return name.equals(that.name);
        }

        @Override
        public int hashCode() {
            return name.hashCode();
        }
    }
}
