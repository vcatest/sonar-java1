public class OutputStreamOverrideWriteCheck {

    // Noncompliant - Overriding OutputStream and not calling super.write()
    public static class NonCompliantExample1 {
        public static void main(String[] args) {
            java.io.OutputStream out = new java.io.ByteArrayOutputStream();
            java.io.OutputStream customOut = new java.io.OutputStream() {
                @Override
                public void write(int b) {
                    // Noncompliant - Missing super.write(b);
                }
            };
            customOut.write(65);
        }
    }

    // Noncompliant - Overriding OutputStream and not calling super.write() with byte array
    public static class NonCompliantExample2 {
        public static void main(String[] args) {
            java.io.OutputStream out = new java.io.ByteArrayOutputStream();
            java.io.OutputStream customOut = new java.io.OutputStream() {
                @Override
                public void write(byte[] b) {
                    // Noncompliant - Missing super.write(b);
                }
            };
            customOut.write(new byte[]{65});
        }
    }

    // Compliant - Overriding OutputStream and calling super.write()
    public static class CompliantExample1 {
        public static void main(String[] args) {
            java.io.OutputStream out = new java.io.ByteArrayOutputStream();
            java.io.OutputStream customOut = new java.io.OutputStream() {
                @Override
                public void write(int b) {
                    super.write(b);
                }
            };
            customOut.write(65);
        }
    }

    // Compliant - Overriding OutputStream and calling super.write() with byte array
    public static class CompliantExample2 {
        public static void main(String[] args) {
            java.io.OutputStream out = new java.io.ByteArrayOutputStream();
            java.io.OutputStream customOut = new java.io.OutputStream() {
                @Override
                public void write(byte[] b) {
                    super.write(b);
                }
            };
            customOut.write(new byte[]{65});
        }
    }
}
