import java.util.Arrays;

public class UnnamedVariableShouldUseVarCheck {

    public void nonCompliantExample1() {
        for (String item : Arrays.asList("a", "b", "c")) { // Noncompliant
            System.out.println(item);
        }
    }

    public void nonCompliantExample2() {
        try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.StringReader("test"))) { // Noncompliant
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    public void compliantExample1() {
        for (var item : Arrays.asList("a", "b", "c")) {
            System.out.println(item);
        }
    }

    public void compliantExample2() {
        try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.StringReader("test"))) {
            var line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    public void compliantExample3() {
        java.util.List<String> list = java.util.Arrays.asList("a", "b", "c");
        for (var item : list) {
            System.out.println(item);
        }
    }

    public void nonCompliantExample3() {
        try (java.sql.Connection connection = java.sql.DriverManager.getConnection("jdbc:h2:mem:test", "user", "password")) { // Noncompliant
            java.sql.Statement statement = connection.createStatement();
            java.sql.ResultSet resultSet = statement.executeQuery("SELECT * FROM test_table");
            while (resultSet.next()) {
                String value;
                value = resultSet.getString(1);
                System.out.println(value);
            }
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }
}
