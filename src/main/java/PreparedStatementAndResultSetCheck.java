public class PreparedStatementAndResultSetCheck {

    public void nonCompliantExample1() throws Exception {
        java.sql.Connection connection = java.sql.DriverManager.getConnection("jdbc:default:connection");
        java.sql.Statement statement = connection.createStatement(); // Noncompliant
        java.sql.ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
        while (resultSet.next()) {
            System.out.println(resultSet.getString("username"));
        }
        resultSet.close();
        statement.close();
        connection.close();
    }

    public void nonCompliantExample2() throws Exception {
        java.sql.Connection connection = java.sql.DriverManager.getConnection("jdbc:default:connection");
        String query = "SELECT * FROM products WHERE price > ?";
        java.sql.Statement statement = connection.createStatement(); // Noncompliant
        java.sql.ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            System.out.println(resultSet.getDouble("price"));
        }
        resultSet.close();
        statement.close();
        connection.close();
    }

    public void compliantExample1() throws Exception {
        java.sql.Connection connection = java.sql.DriverManager.getConnection("jdbc:default:connection");
        String query = "SELECT * FROM employees WHERE department = ?";
        java.sql.PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, "IT");
        java.sql.ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
        }
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }

    public void compliantExample2() throws Exception {
        java.sql.Connection connection = java.sql.DriverManager.getConnection("jdbc:default:connection");
        String query = "INSERT INTO orders (customer_id, total_amount) VALUES (?, ?)";
        java.sql.PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, 123);
        preparedStatement.setDouble(2, 99.99);
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
    }
}
