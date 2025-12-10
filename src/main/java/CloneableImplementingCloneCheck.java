public class CloneableImplementingCloneCheck {

    // Noncompliant - Implementing Cloneable and providing a clone() method.
    public class NonCompliantClass1 implements Cloneable {
        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone(); // Noncompliant
        }
    }

    // Noncompliant - Implementing Cloneable and providing a clone() method.
    public class NonCompliantClass2 implements Cloneable {
        private int value;

        public NonCompliantClass2(int value) {
            this.value = value;
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            return new NonCompliantClass2(this.value); // Noncompliant
        }
    }

    // Compliant - Not implementing Cloneable.
    public class CompliantClass1 {
        private int value;

        public CompliantClass1(int value) {
            this.value = value;
        }
    }

    // Compliant - Implementing Cloneable but not providing a clone() method.
    public class CompliantClass2 implements Cloneable {
        private String name;

        public CompliantClass2(String name) {
            this.name = name;
        }
    }
}
