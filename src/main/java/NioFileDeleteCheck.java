public class NioFileDeleteCheck {

    import java.io.IOException;
    import java.nio.file.Files;
    import java.nio.file.Path;
    import java.nio.file.Paths;

    public void nonCompliantExample1() throws IOException {
        Path filePath = Paths.get("temp.txt");
        Files.delete(filePath); // Noncompliant
    }

    public void nonCompliantExample2() throws IOException {
        Path filePath = Paths.get("temp.txt");
        try {
            Files.delete(filePath); // Noncompliant
        } catch (IOException e) {
            System.err.println("Error deleting file: " + e.getMessage());
        }
    }

    public void compliantExample1() throws IOException {
        Path filePath = Paths.get("temp.txt");
        try {
            Files.deleteIfExists(filePath);
        } catch (IOException e) {
            System.err.println("Error deleting file: " + e.getMessage());
        }
    }

    public void compliantExample2() throws IOException {
        Path filePath = Paths.get("temp.txt");
        if (Files.exists(filePath)) {
            Files.delete(filePath);
        }
    }

    public static void main(String[] args) throws IOException {
        NioFileDeleteCheck test = new NioFileDeleteCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2();
        test.compliantExample1();
        test.compliantExample2();
    }
}
