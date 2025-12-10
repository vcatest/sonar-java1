import java.io.IOException;
import java.sql.SQLException;

public class ThrowsSeveralCheckedExceptionCheck {

    // Noncompliant - Throws multiple checked exceptions
    public void method1() throws Exception, IOException {
        // Some code here
    }

    // Noncompliant - Throws multiple checked exceptions
    public void method2(int x) throws IOException, SQLException {
        if (x > 0) {
            throw new IOException("IO Error");
        } else {
            throw new SQLException("SQL Error");
        }
    }

    // Compliant - Throws only one checked exception
    public void method3() throws IOException {
        // Some code here
    }

    // Compliant - Throws no checked exceptions (only unchecked)
    public void method4() {
        // Some code here
        if (true) {
            throw new IllegalArgumentException("Invalid argument");
        }
    }

    // Compliant - Throws a single checked exception
    public void method5() throws SQLException {
        // Some code here
    }

    // Noncompliant - Throws multiple checked exceptions
    public void method6() throws ArithmeticException, IOException, NullPointerException {
        // Some code here
    }
}
