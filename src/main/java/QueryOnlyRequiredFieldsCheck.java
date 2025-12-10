public class QueryOnlyRequiredFieldsCheck {

    public void executeQueryNonCompliant1(String query) {
        // Noncompliant
        String sql = "SELECT * FROM users";
        // Execute the query (implementation details omitted)
        System.out.println("Executing query: " + sql);
    }

    public void executeQueryNonCompliant2(String query) {
        String sql = "SELECT * FROM products WHERE category = 'electronics'";
        // Noncompliant
        // Execute the query (implementation details omitted)
        System.out.println("Executing query: " + sql);
    }

    public void executeQueryCompliant1(String query) {
        String sql = "SELECT id, name FROM users WHERE active = true";
        // Execute the query (implementation details omitted)
        System.out.println("Executing query: " + sql);
    }

    public void executeQueryCompliant2(String query) {
        String sql = "SELECT product_id, product_name, price FROM products WHERE stock > 0";
        // Execute the query (implementation details omitted)
        System.out.println("Executing query: " + sql);
    }

    public static void main(String[] args) {
        QueryOnlyRequiredFieldsCheck checker = new QueryOnlyRequiredFieldsCheck();
        checker.executeQueryNonCompliant1("SELECT * FROM users");
        checker.executeQueryNonCompliant2("SELECT * FROM products WHERE category = 'electronics'");
        checker.executeQueryCompliant1("SELECT id, name FROM users WHERE active = true");
        checker.executeQueryCompliant2("SELECT product_id, product_name, price FROM products WHERE stock > 0");
    }
}
