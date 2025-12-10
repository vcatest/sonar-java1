public class SillyEqualsCheck {

    public void nonCompliantExample1() {
        String a = "hello";
        String b = "Hello";
        if (a == b) { // Noncompliant
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }

    public void nonCompliantExample2() {
        Integer x = 10;
        Integer y = 10;
        if (x == y) { // Noncompliant
            System.out.println("Integers are equal");
        } else {
            System.out.println("Integers are not equal");
        }
    }

    public void compliantExample1() {
        String a = "hello";
        String b = "Hello";
        if (a.equals(b)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }

    public void compliantExample2() {
        Integer x = 10;
        Integer y = 10;
        if (x.equals(y)) {
            System.out.println("Integers are equal");
        } else {
            System.out.println("Integers are not equal");
        }
    }
}
