public class InnerClassOfSerializableCheck {

    // Noncompliant - Inner class implements Serializable directly
    public class NonCompliantInner1 implements java.io.Serializable {
        private int value;

        public NonCompliantInner1(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    } // Noncompliant

    // Noncompliant - Inner class extends Serializable class
    public class NonCompliantInner2 extends java.util.ArrayList<Integer> implements java.io.Serializable {
        public NonCompliantInner2() {
            super();
        }
    } // Noncompliant

    // Compliant - Inner class is not Serializable
    public class CompliantInner1 {
        private int value;

        public CompliantInner1(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    // Compliant - Outer class implements Serializable, inner class does not
    public static class CompliantInner2 implements java.io.Serializable {
        private int value;

        public CompliantInner2(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
