public class CompareStringsBoxedTypesWithEqualsCheck {

    public void nonCompliantExample1() {
        Integer a = 1;
        Integer b = 1;
        if (a == b) { // Noncompliant
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }

    public void nonCompliantExample2() {
        String str1 = new String("test");
        String str2 = new String("test");
        if (str1 == str2) { // Noncompliant
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }

    public void compliantExample1() {
        Integer a = 1;
        Integer b = 1;
        if (a.equals(b)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }

    public void compliantExample2() {
        String str1 = new String("test");
        String str2 = new String("test");
        if (str1.equals(str2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
