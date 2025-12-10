public class OmitPermittedTypesCheck {

    // Noncompliant - Using permitted type check with String
    public void nonCompliantExample1(String input) {
        if (input instanceof String) {
            System.out.println("Input is a String");
        }
    }

    // Noncompliant - Using permitted type check with Integer
    public void nonCompliantExample2(Object obj) {
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            System.out.println("Input is an Integer: " + num);
        }
    }

    // Compliant - Direct type check using equals() for String
    public void compliantExample1(String input) {
        if ("String".equals(input.getClass().getSimpleName())) {
            System.out.println("Input is a String");
        }
    }

    // Compliant - Using .getClass() and comparing to the class object
    public void compliantExample2(Object obj) {
        if (obj.getClass() == Integer.class) {
            System.out.println("Input is an Integer");
        }
    }

    // Compliant - Using isInstance method of Class object
    public void compliantExample3(Object obj) {
        if (Integer.class.isInstance(obj)) {
            System.out.println("Input is an Integer");
        }
    }

    // Compliant - Using equals to compare class names
    public void compliantExample4(Object obj) {
        if("java.lang.String".equals(obj.getClass().getName())) {
            System.out.println("Input is a String");
        }
    }
}
