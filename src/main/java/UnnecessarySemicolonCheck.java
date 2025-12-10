public class UnnecessarySemicolonCheck {

    public void nonCompliantExample1() {
        int x = 10;; // Noncompliant
        System.out.println(x);
    }

    public void nonCompliantExample2() {
        String message = "Hello";; // Noncompliant
        System.out.println(message);
    }

    public void compliantExample1() {
        int y = 20;
        System.out.println(y);
    }

    public void compliantExample2() {
        String greeting = "World";
        System.out.println(greeting);
    }

    public static void main(String[] args) {
        UnnecessarySemicolonCheck test = new UnnecessarySemicolonCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2();
        test.compliantExample1();
        test.compliantExample2();
    }
}
