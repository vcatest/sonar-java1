public class ArrayHashCodeAndToStringCheck {

    // Noncompliant - Using hashCode() on an array directly
    public void nonCompliantExample1() {
        int[] myArray = {1, 2, 3};
        int hashCode = myArray.hashCode(); // Noncompliant
        System.out.println("Hash code: " + hashCode);
    }

    // Noncompliant - Using toString() on an array directly
    public void nonCompliantExample2() {
        String[] myStringArray = {"a", "b", "c"};
        String toString = myStringArray.toString(); // Noncompliant
        System.out.println("String representation: " + toString);
    }

    // Compliant - Using Arrays.hashCode() for arrays
    public void compliantExample1() {
        int[] myArray = {1, 2, 3};
        int hashCode = java.util.Arrays.hashCode(myArray);
        System.out.println("Hash code: " + hashCode);
    }

    // Compliant - Using Arrays.toString() for arrays
    public void compliantExample2() {
        String[] myStringArray = {"a", "b", "c"};
        String toString = java.util.Arrays.toString(myStringArray);
        System.out.println("String representation: " + toString);
    }

    public static void main(String[] args) {
        ArrayHashCodeAndToStringCheck test = new ArrayHashCodeAndToStringCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2();
        test.compliantExample1();
        test.compliantExample2();
    }
}
