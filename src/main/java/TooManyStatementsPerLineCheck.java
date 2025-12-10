public class TooManyStatementsPerLineCheck {

    public void nonCompliantExample1() {
        int x = 1; int y = 2; int z = 3; // Noncompliant
    }

    public void nonCompliantExample2() {
        String a = "hello"; String b = "world"; System.out.println(a + b); // Noncompliant
    }

    public void compliantExample1() {
        int x = 1;
        int y = 2;
        int z = 3;
    }

    public void compliantExample2() {
        String a = "hello";
        String b = "world";
        System.out.println(a + b);
    }

    public void compliantExample3() {
        int result = 0;
        result = result + 1;
        result = result + 2;
        System.out.println(result);
    }

    public void nonCompliantExample3() {
        boolean condition1 = true; boolean condition2 = false; boolean condition3 = true; // Noncompliant
    }
}
