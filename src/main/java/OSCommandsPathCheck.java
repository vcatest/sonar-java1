public class OSCommandsPathCheck {

    public static void main(String[] args) {

        // Noncompliant - Using direct path to system commands
        try {
            Process process = Runtime.getRuntime().exec("C:\\Windows\\System32\\cmd.exe /c dir");
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Noncompliant - Using direct path to system commands with arguments
        try {
            Process process = Runtime.getRuntime().exec("/usr/bin/ls -l");
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Compliant - Using ProcessBuilder with command and arguments as separate strings
        try {
            ProcessBuilder builder = new ProcessBuilder("cmd", "/c", "dir");
            Process process = builder.start();
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Compliant - Using ProcessBuilder with command and arguments as an array
        try {
            ProcessBuilder builder = new ProcessBuilder(new String[]{"ls", "-l"});
            Process process = builder.start();
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
