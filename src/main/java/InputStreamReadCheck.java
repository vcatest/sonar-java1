public class InputStreamReadCheck {

    public void nonCompliantExample1() throws Exception {
        java.io.InputStream inputStream = new java.io.ByteArrayInputStream("test".getBytes());
        int data = inputStream.read(); // Noncompliant
        while (data != -1) {
            System.out.print((char) data);
            data = inputStream.read(); // Noncompliant
        }
        inputStream.close();
    }

    public void nonCompliantExample2() throws Exception {
        java.io.InputStream inputStream = new java.io.FileInputStream("test.txt");
        byte[] buffer = new byte[10];
        int bytesRead = inputStream.read(buffer); // Noncompliant
        if (bytesRead > 0) {
            System.out.println(new String(buffer, 0, bytesRead));
        }
        inputStream.close();
    }

    public void compliantExample1() throws Exception {
        java.io.InputStream inputStream = new java.io.ByteArrayInputStream("test".getBytes());
        java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    public void compliantExample2() throws Exception {
        java.io.InputStream inputStream = new java.io.FileInputStream("test.txt");
        java.util.Scanner scanner = new java.util.Scanner(inputStream);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();
    }
}
