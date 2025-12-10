public class HardcodedURICheck {

    public void nonCompliantExample1() {
        String url = "https://www.example.com/api/data"; // Noncompliant
        System.out.println("Fetching data from: " + url);
    }

    public void nonCompliantExample2() {
        String anotherUrl = "http://localhost:8080/users"; // Noncompliant
        // Some logic using the hardcoded URL
        System.out.println("Connecting to: " + anotherUrl);
    }

    public void compliantExample1(String baseUrl) {
        String url = baseUrl + "/api/data";
        System.out.println("Fetching data from: " + url);
    }

    public void compliantExample2(String scheme, String host, String path) {
        java.net.URI uri = java.net.URI.create(scheme + "://" + host + path);
        System.out.println("Connecting to: " + uri.toString());
    }

    public static void main(String[] args) {
        HardcodedURICheck test = new HardcodedURICheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2();
        test.compliantExample1("https://www.example.com");
        test.compliantExample2("http", "localhost", ":8080/users");
    }
}
