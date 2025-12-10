import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class UselessImportCheck {

    public void nonCompliantExample1() {
        // ArrayList is never used
        String message = "Hello";
        System.out.println(message);
    }

    // Noncompliant - unused import

    public void nonCompliantExample2() {
        // HashMap is never used
        int number = 10;
        System.out.println(number);
    }

    public void compliantExample1() {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        System.out.println(names);
    }

    public void compliantExample2() {
        Date now = new Date();
        System.out.println(now);
    }
}
