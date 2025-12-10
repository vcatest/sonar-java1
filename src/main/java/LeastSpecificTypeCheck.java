import java.util.List;

public class LeastSpecificTypeCheck {

    // Noncompliant - Using Object when String is more specific
    public void example1(Object obj) {
        String str = (String) obj;
        System.out.println(str.length());
    }

    // Noncompliant - Using Number when Integer is more specific
    public void example2(Number num) {
        int value = num.intValue();
        System.out.println(value + 1);
    }

    // Compliant - Using String directly
    public void example3(String str) {
        System.out.println(str.length());
    }

    // Compliant - Using Integer directly
    public void example4(Integer num) {
        int value = num.intValue();
        System.out.println(value + 1);
    }

    // Noncompliant - Using Comparable when Integer is more specific
    public void example5(Comparable comp) {
        Integer intVal = (Integer) comp;
        System.out.println(intVal.compareTo(10));
    }

    // Compliant - Using List<String> instead of List
    public void example6(List<String> stringList) {
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}
