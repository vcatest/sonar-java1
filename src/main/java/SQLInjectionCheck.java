public class SQLInjectionCheck {

    public void nonCompliantExample1(String userInput) {
        String query = "SELECT * FROM users WHERE username = '" + userInput + "'"; // Noncompliant
        // Execute the query (in a real scenario)
        System.out.println("Executing query: " + query);
    }

    public void nonCompliantExample2(String userInput) {
        String query = "SELECT * FROM products WHERE product_id = " + userInput; // Noncompliant
        // Execute the query (in a real scenario)
        System.out.println("Executing query: " + query);
    }

    public void compliantExample1(String userInput) {
        String query = "SELECT * FROM users WHERE username = ?";
        // Use a PreparedStatement to prevent SQL injection
        // PreparedStatement preparedStatement = connection.prepareStatement(query);
        // preparedStatement.setString(1, userInput);
        // ResultSet resultSet = preparedStatement.executeQuery();
        System.out.println("Executing query with prepared statement: " + query + " and parameter: " + userInput);
    }

    public void compliantExample2(String userInput) {
        String query = "SELECT * FROM products WHERE product_id = ?";
        // Use a PreparedStatement to prevent SQL injection
        // PreparedStatement preparedStatement = connection.prepareStatement(query);
        // preparedStatement.setString(1, userInput);
        // ResultSet resultSet = preparedStatement.executeQuery();
        System.out.println("Executing query with prepared statement: " + query + " and parameter: " + userInput);
    }
}
