public class JdbcDriverExplicitLoadingCheck {

    // Noncompliant - Explicitly loading JDBC driver using Class.forName
    public void nonCompliantExample1() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Noncompliant - Explicitly loading JDBC driver using Class.forName
    public void nonCompliantExample2() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Compliant - Relying on driver auto-registration (ServiceLoader)
    public void compliantExample1() {
        try {
            java.sql.Connection connection = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "user", "password");
            connection.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }

    // Compliant - Relying on driver auto-registration (ServiceLoader)
    public void compliantExample2() {
        try {
            java.sql.Connection connection = java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "user", "password");
            connection.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }
}
