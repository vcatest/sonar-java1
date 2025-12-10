public class BatchSQLStatementsCheck {

    public void nonCompliantExample1(java.util.List<Integer> ids) throws java.sql.SQLException {
        java.sql.Connection connection = java.sql.DriverManager.getConnection("jdbc:default");
        java.sql.Statement statement = connection.createStatement();

        for (Integer id : ids) { // Noncompliant
            String sql = "SELECT * FROM users WHERE id = " + id;
            statement.executeQuery(sql);
        }

        statement.close();
        connection.close();
    }

    public void nonCompliantExample2(java.util.Map<String, String> params) throws java.sql.SQLException {
        java.sql.Connection connection = java.sql.DriverManager.getConnection("jdbc:default");
        java.sql.Statement statement = connection.createStatement();

        for (java.util.Map.Entry<String, String> entry : params.entrySet()) { // Noncompliant
            String key = entry.getKey();
            String value = entry.getValue();
            String sql = "UPDATE settings SET value = '" + value + "' WHERE key = '" + key + "'";
            statement.executeUpdate(sql);
        }

        statement.close();
        connection.close();
    }

    public void compliantExample1(java.util.List<Integer> ids) throws java.sql.SQLException {
        java.sql.Connection connection = java.sql.DriverManager.getConnection("jdbc:default");
        java.sql.Statement statement = connection.createStatement();

        StringBuilder sqlBuilder = new StringBuilder();
        for (Integer id : ids) {
            sqlBuilder.append("SELECT * FROM users WHERE id = ").append(id).append(";");
        }
        String sql = sqlBuilder.toString();
        statement.executeQuery(sql);

        statement.close();
        connection.close();
    }

    public void compliantExample2(java.util.List<String> queries) throws java.sql.SQLException {
        java.sql.Connection connection = java.sql.DriverManager.getConnection("jdbc:default");
        java.sql.Statement statement = connection.createStatement();

        java.util.stream.Stream<String> queryStream = queries.stream();
        queryStream.forEach(query -> {
            try {
                statement.executeUpdate(query);
            } catch (java.sql.SQLException e) {
                // Handle exception
            }
        });

        statement.close();
        connection.close();
    }
}
