public class ThrowCheckedExceptionCheck {

    public void nonCompliantExample1() throws Exception {
        // Noncompliant
        throw new Exception("This is a checked exception");
    }

    public void nonCompliantExample2() throws java.io.IOException {
        // Noncompliant
        throw new java.io.IOException("File not found");
    }

    public void compliantExample1() {
        try {
            // Simulate a checked exception scenario
            java.io.File file = new java.io.File("nonexistent_file.txt");
            java.io.FileReader reader = new java.io.FileReader(file);
        } catch (java.io.FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }

    public void compliantExample2() {
        try {
            // Simulate a checked exception scenario
            java.net.Socket socket = new java.net.Socket("localhost", 8080);
        } catch (java.net.UnknownHostException e) {
            System.err.println("Host not found: " + e.getMessage());
        } catch (java.io.IOException e) {
            System.err.println("IO Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ThrowCheckedExceptionCheck test = new ThrowCheckedExceptionCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2();
        test.compliantExample1();
        test.compliantExample2();
    }
}
