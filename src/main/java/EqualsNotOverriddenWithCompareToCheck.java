public class EqualsNotOverriddenWithCompareToCheck {

    // Noncompliant - equals() is overridden but doesn't call super.equals()
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

    // Noncompliant - equals() is overridden but doesn't call super.equals()
    public class NonCompliantClass2 {
        private String name;

        public NonCompliantClass2(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null) return false;
            NonCompliantClass2 other = (NonCompliantClass2) o;
            return name.equals(other.name); // Noncompliant
        }
    }

    // Compliant - equals() is overridden and calls super.equals()
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
            return super.equals(obj) && value == other.value;
        }
    }

    // Compliant - equals() is not overridden
    public class CompliantClass2 {
        private String name;

        public CompliantClass2(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
