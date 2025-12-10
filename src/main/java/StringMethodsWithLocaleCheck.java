public class StringMethodsWithLocaleCheck {

    public void nonCompliantExample1() {
        String str = "hello";
        String upperCaseStr = str.toUpperCase(); // Noncompliant
        System.out.println(upperCaseStr);
    }

    public void nonCompliantExample2() {
        String str = "world";
        String lowerCaseStr = str.toLowerCase(); // Noncompliant
        System.out.println(lowerCaseStr);
    }

    public void compliantExample1() {
        String str = "hello";
        String upperCaseStr = str.toUpperCase(java.util.Locale.US);
        System.out.println(upperCaseStr);
    }

    public void compliantExample2() {
        String str = "world";
        String lowerCaseStr = str.toLowerCase(java.util.Locale.ENGLISH);
        System.out.println(lowerCaseStr);
    }

    public void compliantExample3() {
        String str = "test";
        String upperCaseStr = str.toUpperCase(new java.util.Locale("fr", "FR"));
        System.out.println(upperCaseStr);
    }

    public void nonCompliantExample3() {
        String str = "mixedCase";
        String capitalizedStr = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase(); // Noncompliant
        System.out.println(capitalizedStr);
    }
}
