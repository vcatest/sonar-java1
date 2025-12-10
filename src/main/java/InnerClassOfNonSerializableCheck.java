public class InnerClassOfNonSerializableCheck {

    // Noncompliant - Inner class of a non-serializable class
    public class NonSerializableInner1 {
        private int x;
    }

    // Noncompliant - Inner class of a non-serializable class
    public class AnotherNonSerializableInner {
        private String s;
    }

    // Compliant - Inner class of a serializable class
    public static class SerializableOuter implements java.io.Serializable {
        public class SerializableInner implements java.io.Serializable {
            private int y;
        }
    }

    // Compliant - Outer class is serializable and inner class is static
    public static class SerializableOuterStatic implements java.io.Serializable {
        public static class SerializableInnerStatic implements java.io.Serializable {
            private double z;
        }
    }

    public static void main(String[] args) {
        // This main method is just for compilation purposes.
    }
}
