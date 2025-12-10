public class HardcodedIpCheck {

    public void nonCompliantExample1() {
        String ipAddress = "192.168.1.1"; // Noncompliant
        System.out.println("Connecting to " + ipAddress);
    }

    public void nonCompliantExample2() {
        if (true) {
            String serverIp = "10.0.0.5"; // Noncompliant
            System.out.println("Server IP: " + serverIp);
        }
    }

    public void compliantExample1(String ipAddress) {
        System.out.println("Connecting to " + ipAddress);
    }

    public void compliantExample2() {
        String ipAddress = System.getenv("SERVER_IP");
        if (ipAddress != null) {
            System.out.println("Server IP: " + ipAddress);
        } else {
            System.out.println("Server IP not configured.");
        }
    }
}
