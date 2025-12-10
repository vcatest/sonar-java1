public class InputStreamOverrideReadCheck {

    // Noncompliant - Overriding read() without calling super.read()
    public class BadInputStream1 extends java.io.InputStream {
        @Override
        public int read() {
            return -1; // Noncompliant
        }
    }

    // Noncompliant - Overriding read(byte[] b) without calling super.read(b)
    public class BadInputStream2 extends java.io.InputStream {
        @Override
        public int read(byte[] b) {
            return 0; // Noncompliant
        }
    }

    // Compliant - Overriding read() and calling super.read()
    public class GoodInputStream1 extends java.io.InputStream {
        @Override
        public int read() {
            return super.read();
        }
    }

    // Compliant - Overriding read(byte[] b) and calling super.read(b)
    public class GoodInputStream2 extends java.io.InputStream {
        @Override
        public int read(byte[] b) {
            return super.read(b);
        }
    }

    public static void main(String[] args) {
        // This main method is just for compilation purposes.  The rule is checked on the class definitions.
    }
}
