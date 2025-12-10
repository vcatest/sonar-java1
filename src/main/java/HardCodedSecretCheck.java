public class HardCodedSecretCheck {

    public void nonCompliantExample1() {
        String apiKey = "YOUR_API_KEY"; // Noncompliant
        System.out.println("API Key: " + apiKey);
    }

    public void nonCompliantExample2() {
        String password = "MySecretPassword123"; // Noncompliant
        String databaseUrl = "jdbc:mysql://localhost:3306/mydb?user=root&password=" + password;
        System.out.println("Database URL: " + databaseUrl);
    }

    public void compliantExample1() {
        String apiKey = System.getenv("API_KEY");
        System.out.println("API Key: " + apiKey);
    }

    public void compliantExample2() {
        String password = System.getProperty("db.password");
        String databaseUrl = "jdbc:mysql://localhost:3306/mydb?user=root&password=" + password;
        System.out.println("Database URL: " + databaseUrl);
    }

    public static void main(String[] args) {
        HardCodedSecretCheck test = new HardCodedSecretCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2();
        test.compliantExample1();
        test.compliantExample2();
    }
}
