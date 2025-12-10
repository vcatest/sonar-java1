public class SymmetricEqualsCheck {

    // Noncompliant - Asymmetric equals method
    public class NonCompliantClass1 {
        private int x;
        private int y;

        public NonCompliantClass1(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            NonCompliantClass1 other = (NonCompliantClass1) obj;
            return x == other.x; // Noncompliant - Only checks 'x', not 'y'
        }
    }

    // Noncompliant - Comparing different types in equals
    public class NonCompliantClass2 {
        private String name;
        private int age;

        public NonCompliantClass2(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            NonCompliantClass2 other = (NonCompliantClass2) obj;
            return this.name.equals(other.age); // Noncompliant - Comparing String with Integer
        }
    }

    // Compliant - Symmetric equals method
    public class CompliantClass1 {
        private int x;
        private int y;

        public CompliantClass1(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            CompliantClass1 other = (CompliantClass1) obj;
            return x == other.x && y == other.y;
        }
    }

    // Compliant - Correct equals and hashCode implementation
    public class CompliantClass2 {
        private String name;
        private int age;

        public CompliantClass2(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            CompliantClass2 other = (CompliantClass2) obj;
            return name.equals(other.name) && age == other.age;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            result = prime * result + age;
            return result;
        }
    }
}
