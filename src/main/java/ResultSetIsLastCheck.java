public class ResultSetIsLastCheck {

    public void nonCompliantExample1(java.sql.ResultSet rs) throws java.sql.SQLException {
        if (rs.isLast()) { // Noncompliant
            System.out.println("Last row");
        } else {
            System.out.println("Not last row");
        }
    }

    public void nonCompliantExample2(java.sql.ResultSet rs) throws java.sql.SQLException {
        while (rs.next()) {
            if (rs.isLast()) { // Noncompliant
                System.out.println("Processing last row");
            }
            System.out.println(rs.getString(1));
        }
    }

    public void compliantExample1(java.sql.ResultSet rs) throws java.sql.SQLException {
        if (rs.getRow() == rs.getLast()) {
            System.out.println("Last row");
        } else {
            System.out.println("Not last row");
        }
    }

    public void compliantExample2(java.sql.ResultSet rs) throws java.sql.SQLException {
        int rowCount = 0;
        while (rs.next()) {
            rowCount++;
        }
        if (rowCount > 0) {
            rs.last();
            System.out.println("Processing last row");
        }
    }
}
