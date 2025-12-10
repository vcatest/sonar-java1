public class RedundantCloseCheck {

    public void nonCompliantExample1() throws Exception {
        java.io.FileInputStream fis = new java.io.FileInputStream("test.txt");
        java.io.BufferedInputStream bis = new java.io.BufferedInputStream(fis);
        try {
            // Read from the stream
        } finally {
            bis.close(); // Noncompliant
            fis.close(); // Noncompliant
        }
    }

    public void nonCompliantExample2() throws Exception {
        java.io.FileWriter fw = new java.io.FileWriter("test.txt");
        java.io.BufferedWriter bw = new java.io.BufferedWriter(fw);
        try {
            bw.write("test");
        } finally {
            bw.close(); // Noncompliant
            fw.close(); // Noncompliant
        }
    }

    public void compliantExample1() throws Exception {
        java.io.FileInputStream fis = new java.io.FileInputStream("test.txt");
        java.io.BufferedInputStream bis = new java.io.BufferedInputStream(fis);
        try {
            // Read from the stream
        } finally {
            bis.close();
        }
    }

    public void compliantExample2() throws Exception {
        java.io.FileWriter fw = new java.io.FileWriter("test.txt");
        java.io.BufferedWriter bw = new java.io.BufferedWriter(fw);
        try {
            bw.write("test");
        } finally {
            bw.close();
        }
    }
}
