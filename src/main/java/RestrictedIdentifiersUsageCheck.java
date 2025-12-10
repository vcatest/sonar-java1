public class RestrictedIdentifiersUsageCheck {

    public void nonCompliantExample1() {
        int a_variable = 10; // Noncompliant
        System.out.println(a_variable);
    }

    public void nonCompliantExample2() {
        String my_string = "Hello"; // Noncompliant
        System.out.println(my_string);
    }

    public void compliantExample1() {
        int avarable = 10;
        System.out.println(avarable);
    }

    public void compliantExample2() {
        String mystring = "Hello";
        System.out.println(mystring);
    }

    public static void main(String[] args) {
        RestrictedIdentifiersUsageCheck test = new RestrictedIdentifiersUsageCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2();
        test.compliantExample1();
        test.compliantExample2();
    }
}
