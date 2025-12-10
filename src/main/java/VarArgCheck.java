public class VarArgCheck {

    // Noncompliant - Using varargs directly in a method call without proper handling.
    public void nonCompliantExample1(String... args) {
        if (args != null) {
            for (String arg : args) {
                System.out.println(arg);
            }
        }
    }

    // Noncompliant - Passing a collection to a varargs method without explicitly creating an array.
    public void nonCompliantExample2(java.util.List<String> list) {
        nonCompliantExample1(list.toArray(new String[0])); // Noncompliant
    }

    // Compliant - Using varargs with explicit array creation.
    public void compliantExample1(String... args) {
        if (args != null) {
            for (String arg : args) {
                System.out.println(arg);
            }
        }
    }

    // Compliant - Passing an array directly to a varargs method.
    public void compliantExample2() {
        String[] myArray = {"hello", "world"};
        compliantExample1(myArray);
    }

    public static void main(String[] args) {
        VarArgCheck check = new VarArgCheck();
        check.nonCompliantExample1("a", "b", "c");
        check.nonCompliantExample2(java.util.Arrays.asList("x", "y"));
        check.compliantExample1("p", "q");
        check.compliantExample2();
    }
}
