public class StringIndexOfRangesCheck {

    public void nonCompliantExample1(String str, int start, int end) {
        if (start < 0 || end > str.length() || start > end) {
            System.out.println("Invalid range");
        }
        String sub = str.substring(start, end); // Noncompliant
        System.out.println(sub);
    }

    public void nonCompliantExample2(String str, int start, int end) {
        if (start < 0 || end > str.length()) {
            System.out.println("Invalid range");
        }
        String sub = str.substring(start, end); // Noncompliant
        System.out.println(sub);
    }

    public void compliantExample1(String str, int start, int end) {
        if (start < 0 || end > str.length() || start > end) {
            System.out.println("Invalid range");
            return;
        }
        String sub = str.substring(start, Math.min(end, str.length()));
        System.out.println(sub);
    }

    public void compliantExample2(String str, int start, int end) {
        if (start < 0 || end > str.length()) {
            System.out.println("Invalid range");
            return;
        }
        int safeEnd = Math.min(end, str.length());
        String sub = str.substring(start, safeEnd);
        System.out.println(sub);
    }
}
