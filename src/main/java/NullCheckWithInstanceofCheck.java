public class NullCheckWithInstanceofCheck {

    public void nonCompliantExample1(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            // Noncompliant
            if (str == null) {
                System.out.println("String is null");
            }
        }
    }

    public void nonCompliantExample2(Object obj) {
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            // Noncompliant
            if (num == null) {
                System.out.println("Integer is null");
            }
        }
    }

    public void compliantExample1(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            if (str != null && !str.isEmpty()) {
                System.out.println("String is not null and not empty");
            }
        }
    }

    public void compliantExample2(Object obj) {
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            if (num != null) {
                System.out.println("Integer is not null");
            }
        }
    }

    public void compliantExample3(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            if (str != null) {
                System.out.println("String is not null");
            }
        }
    }
}
