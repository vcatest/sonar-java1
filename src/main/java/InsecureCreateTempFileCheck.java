import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class InsecureCreateTempFileCheck {

    public void nonCompliantExample1() throws Exception {
        File tempFile = File.createTempFile("temp", ".txt"); // Noncompliant
        tempFile.deleteOnExit();
        FileWriter fw = new FileWriter(tempFile);
        fw.write("Some data");
        fw.close();
    }

    public void nonCompliantExample2() throws Exception {
        File tempDir = new File("tmp");
        if (!tempDir.exists()) {
            tempDir.mkdir();
        }
        File tempFile = File.createTempFile("temp", ".txt", tempDir); // Noncompliant
        tempFile.deleteOnExit();
        FileWriter fw = new FileWriter(tempFile);
        fw.write("Some data");
        fw.close();
    }

    public void compliantExample1() throws Exception {
        File tempFile = File.createTempFile("temp", ".txt", new File("java.io.tmpdir"));
        tempFile.deleteOnExit();
        FileWriter fw = new FileWriter(tempFile);
        fw.write("Some data");
        fw.close();
    }

    public void compliantExample2() throws Exception {
        File tempDir = new File(System.getProperty("java.io.tmpdir"));
        File tempFile = File.createTempFile("temp", ".txt", tempDir);
        tempFile.deleteOnExit();
        FileWriter fw = new FileWriter(tempFile);
        fw.write("Some data");
        fw.close();
    }
}
