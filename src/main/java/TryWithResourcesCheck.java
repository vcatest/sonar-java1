public class TryWithResourcesCheck {

    public void nonCompliantExample1() throws Exception {
        java.io.FileReader file = new java.io.FileReader("test.txt");
        java.io.BufferedReader reader = new java.io.BufferedReader(file);
        try {
            String line = reader.readLine();
            System.out.println(line);
        } finally {
            reader.close(); // Noncompliant
            file.close(); // Noncompliant
        }
    }

    public void nonCompliantExample2() throws Exception {
        java.sql.Connection connection = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "user", "password");
        java.sql.Statement statement = connection.createStatement();
        try {
            java.sql.ResultSet resultSet = statement.executeQuery("SELECT * FROM test_table");
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
            }
        } finally {
            statement.close(); // Noncompliant
            connection.close(); // Noncompliant
        }
    }

    public void compliantExample1() throws Exception {
        try (java.io.FileReader file = new java.io.FileReader("test.txt");
             java.io.BufferedReader reader = new java.io.BufferedReader(file)) {
            String line = reader.readLine();
            System.out.println(line);
        }
    }

    public void compliantExample2() throws Exception {
        try (java.sql.Connection connection = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "user", "password");
             java.sql.Statement statement = connection.createStatement()) {
            java.sql.ResultSet resultSet = statement.executeQuery("SELECT * FROM test_table");
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
            }
        }
    }
}
