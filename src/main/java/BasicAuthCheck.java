public class BasicAuthCheck {

    // Noncompliant - Hardcoded username and password
    public void nonCompliantExample1() {
        String username = "admin";
        String password = "password123";
        // Use these credentials to authenticate against a service.
        // This is a security risk.
    }

    // Noncompliant - Hardcoded credentials in a string
    public void nonCompliantExample2() {
        String authString = "Basic " + java.util.Base64.getEncoder().encodeToString("user:secret".getBytes());
        // Use authString for authentication.
    }

    // Compliant - Credentials retrieved from environment variables
    public void compliantExample1() {
        String username = System.getenv("USERNAME");
        String password = System.getenv("PASSWORD");
        // Use username and password from environment variables.
    }

    // Compliant - Credentials retrieved from a secure configuration file
    public void compliantExample2() {
        // Assume credentials are loaded from a secure configuration file
        String username = getUsernameFromConfig();
        String password = getPasswordFromConfig();
        // Use username and password from the configuration file.
    }

    private String getUsernameFromConfig() {
        // Placeholder for reading username from a secure config file
        return "config_user";
    }

    private String getPasswordFromConfig() {
        // Placeholder for reading password from a secure config file
        return "config_password";
    }
}
