public class UselessImportCheck {

    // Noncompliant
    import java.util.ArrayList;

    public void nonCompliantExample1() {
        // ArrayList is never used
        String message = "Hello";
        System.out.println(message);
    }

    // Noncompliant
    import java.util.HashMap;

    public void nonCompliantExample2() {
        // HashMap is never used
        int number = 10;
        System.out.println(number);
    }

    import java.util.List;

    public void compliantExample1() {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        System.out.println(names);
    }

    import java.util.Date;

    public void compliantExample2() {
        Date now = new Date();
        System.out.println(now);
    }
}
