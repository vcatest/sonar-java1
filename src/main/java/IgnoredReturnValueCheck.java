public class IgnoredReturnValueCheck {

    public void nonCompliantExample1() {
        // Noncompliant
        new java.util.Scanner(System.in).nextInt();
        
        String str = new String("test");
        // Noncompliant
        str.length();
    }

    public void nonCompliantExample2() {
        // Noncompliant
        java.lang.Math.random();

        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        // Noncompliant
        list.add("test");
    }

    public void compliantExample1() {
        int value = new java.util.Scanner(System.in).nextInt();
        System.out.println(value);

        String str = new String("test");
        int length = str.length();
        System.out.println(length);
    }

    public void compliantExample2() {
        double randomValue = java.lang.Math.random();
        System.out.println(randomValue);

        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        list.add("test");
        System.out.println(list.size());
    }
}
