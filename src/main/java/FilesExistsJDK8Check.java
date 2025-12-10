public class FilesExistsJDK8Check {

    public void nonCompliantExample1() {
        java.io.File file = new java.io.File("somefile.txt"); // Noncompliant
        if (file.exists()) {
            System.out.println("File exists");
        }
    }

    public void nonCompliantExample2() {
        java.nio.file.Path path = java.nio.file.Paths.get("anotherfile.txt"); // Noncompliant
        if (java.nio.file.Files.exists(path)) {
            System.out.println("File exists");
        }
    }

    public void compliantExample1() {
        java.nio.file.Path path = java.nio.file.Paths.get("myfile.txt");
        try {
            java.nio.file.Files.createFile(path);
        } catch (java.io.IOException e) {
            // Handle exception
        }
        System.out.println("File created");
    }

    public void compliantExample2() {
        java.io.File file = new java.io.File("newfile.txt");
        try {
            file.createNewFile();
        } catch (java.io.IOException e) {
            // Handle exception
        }
        System.out.println("File created");
    }
}
