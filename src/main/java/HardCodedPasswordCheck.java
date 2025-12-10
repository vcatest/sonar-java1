public class HardCodedPasswordCheck {

    public void nonCompliantExample1() {
        String username = "admin";
        String password = "password123"; // Noncompliant
        // Simulate authentication
        if (username.equals("admin") && password.equals("password123")) {
            System.out.println("Authentication successful");
        } else {
            System.out.println("Authentication failed");
        }
    }

    public void nonCompliantExample2() {
        String apiKey = "SUPER_SECRET_KEY"; // Noncompliant
        // Use the API key to access a resource
        System.out.println("Accessing resource with API key: " + apiKey);
    }

    public void compliantExample1() {
        String username = "admin";
        String password = System.getenv("ADMIN_PASSWORD");
        // Simulate authentication
        if (username.equals("admin") && password != null && password.equals(System.getenv("ADMIN_PASSWORD"))) {
            System.out.println("Authentication successful");
        } else {
            System.out.println("Authentication failed");
        }
    }

    public void compliantExample2() {
        // Retrieve credentials from a secure configuration file
        String databaseUrl = "jdbc:mysql://localhost:3306/mydb";
        String databaseUsername = System.getenv("DB_USERNAME");
        String databasePassword = System.getenv("DB_PASSWORD");

        // Connect to the database
        try {
            java.sql.Connection connection = java.sql.DriverManager.getConnection(databaseUrl, databaseUsername, databasePassword);
            System.out.println("Connected to the database");
            connection.close();
        } catch (java.sql.SQLException e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
        }
    }
}
