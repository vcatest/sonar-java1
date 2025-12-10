public class CloneMethodCallsSuperCloneCheck {

    // Noncompliant - Calling super.clone() directly within a clone method.
    public class NonCompliantClass1 {
        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone(); // Noncompliant
        }
    }

    // Noncompliant - Calling super.clone() and then assigning it to a variable.
    public class NonCompliantClass2 {
        @Override
        public Object clone() throws CloneNotSupportedException {
            Object clonedObject = super.clone(); // Noncompliant
            return clonedObject;
        }
    }

    // Compliant - Implementing a proper clone method with deep copy.
    public class CompliantClass1 {
        private int value;

        public CompliantClass1(int value) {
            this.value = value;
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            CompliantClass1 cloned = new CompliantClass1(this.value);
            return cloned;
        }
    }

    // Compliant - Using a copy constructor instead of clone().
    public class CompliantClass2 {
        private String data;

        public CompliantClass2(String data) {
            this.data = data;
        }

        public CompliantClass2(CompliantClass2 other) {
            this.data = other.data;
        }
    }
}
