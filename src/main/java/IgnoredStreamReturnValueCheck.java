public class IgnoredStreamReturnValueCheck {

    public void nonCompliantExample1() throws Exception {
        java.io.InputStream inputStream = new java.io.FileInputStream("test.txt");
        inputStream.read(); // Noncompliant
        inputStream.close();
    }

    public void nonCompliantExample2() throws Exception {
        java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader("test.txt"));
        reader.readLine(); // Noncompliant
        reader.close();
    }

    public void compliantExample1() throws Exception {
        java.io.InputStream inputStream = new java.io.FileInputStream("test.txt");
        int value = inputStream.read();
        if (value != -1) {
            // Process the value
        }
        inputStream.close();
    }

    public void compliantExample2() throws Exception {
        java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader("test.txt"));
        String line = reader.readLine();
        if (line != null) {
            // Process the line
        }
        reader.close();
    }
}
