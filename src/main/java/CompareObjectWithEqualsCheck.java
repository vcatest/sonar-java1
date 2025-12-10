public class CompareObjectWithEqualsCheck {

    public void nonCompliantExample1(String str1, String str2) {
        if (str1 == str2) { // Noncompliant
            System.out.println("Strings are the same (reference)");
        } else {
            System.out.println("Strings are different (reference)");
        }
    }

    public void nonCompliantExample2(Object obj1, Object obj2) {
        if (obj1 == obj2) { // Noncompliant
            System.out.println("Objects are the same (reference)");
        } else {
            System.out.println("Objects are different (reference)");
        }
    }

    public void compliantExample1(String str1, String str2) {
        if (str1.equals(str2)) {
            System.out.println("Strings are the same (value)");
        } else {
            System.out.println("Strings are different (value)");
        }
    }

    public void compliantExample2(Object obj1, Object obj2) {
        if (obj1 != null && obj2 != null && obj1.equals(obj2)) {
            System.out.println("Objects are the same (value)");
        } else {
            System.out.println("Objects are different (value)");
        }
    }

    public static void main(String[] args) {
        CompareObjectWithEqualsCheck checker = new CompareObjectWithEqualsCheck();
        checker.nonCompliantExample1("hello", "hello");
        checker.nonCompliantExample2(new Object(), new Object());
        checker.compliantExample1("world", "world");
        checker.compliantExample2(new Object(), new Object());
    }
}
