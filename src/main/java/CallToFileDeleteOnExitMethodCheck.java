public class CallToFileDeleteOnExitMethodCheck {

    // Noncompliant - Direct call to deleteOnExit without try-finally
    public void nonCompliantExample1() {
        File file = new File("temp.txt");
        file.deleteOnExit(); // Noncompliant
    }

    // Noncompliant - deleteOnExit called within a loop
    public void nonCompliantExample2(List<File> files) {
        for (File file : files) {
            file.deleteOnExit(); // Noncompliant
        }
    }

    // Compliant - deleteOnExit called within a try-finally block
    public void compliantExample1() {
        File file = new File("temp.txt");
        try {
            // Some operation with the file
        } finally {
            file.deleteOnExit();
        }
    }

    // Compliant - deleteOnExit called within a try-with-resources block
    public void compliantExample2() {
        try (FileOutputStream fos = new FileOutputStream("temp.txt")) {
            // Write to the file
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Compliant - deleteOnExit called after file creation, within a try-finally
    public void compliantExample3() {
        File file = null;
        try {
            file = new File("temp.txt");
            // Some operation with the file
        } finally {
            if (file != null) {
                file.deleteOnExit();
            }
        }
    }

    // Noncompliant - deleteOnExit called in a method that might throw an exception before the call
    public void nonCompliantExample3() throws IOException {
        File file = new File("temp.txt");
        throw new IOException("Simulated IO Exception");
        file.deleteOnExit(); // Noncompliant - This line might not be reached
    }
}
