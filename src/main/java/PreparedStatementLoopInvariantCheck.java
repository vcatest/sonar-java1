public class PreparedStatementLoopInvariantCheck {

    // Noncompliant - String concatenation inside the loop
    public void nonCompliantExample1(String tableName, String[] values) {
        String sql = "INSERT INTO " + tableName + " (column1) VALUES (?)";
        for (String value : values) {
            sql = sql + " OR column1 = '" + value + "'"; // Noncompliant
        }
        // Execute sql
    }

    // Noncompliant - Building SQL query string inside a loop
    public void nonCompliantExample2(int[] ids) {
        String sql = "SELECT * FROM users WHERE id IN (";
        for (int i = 0; i < ids.length; i++) {
            sql += ids[i]; // Noncompliant
            if (i < ids.length - 1) {
                sql += ",";
            }
        }
        sql += ")";
        // Execute sql
    }

    // Compliant - Using PreparedStatement with parameters
    public void compliantExample1(String tableName, String[] values) {
        String sql = "INSERT INTO " + tableName + " (column1) VALUES (?)";
        try (java.sql.PreparedStatement statement = java.sql.DriverManager.getConnection("jdbc:default", "user", "password").prepareStatement(sql)) {
            for (String value : values) {
                statement.setString(1, value);
                statement.executeUpdate();
            }
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }

    // Compliant - Using StringBuilder outside the loop and then PreparedStatement
    public void compliantExample2(int[] ids) {
        StringBuilder sb = new StringBuilder("SELECT * FROM users WHERE id IN (");
        for (int i = 0; i < ids.length; i++) {
            sb.append(ids[i]);
            if (i < ids.length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        String sql = sb.toString();

        try (java.sql.PreparedStatement statement = java.sql.DriverManager.getConnection("jdbc:default", "user", "password").prepareStatement(sql)) {
            statement.executeUpdate();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }
}
