public class CompareToReturnValueCheck {

    public void nonCompliantExample1(String str1, String str2) {
        if (str1.compareTo(str2) > 0) { // Noncompliant
            System.out.println("str1 is greater than str2");
        } else {
            System.out.println("str1 is not greater than str2");
        }
    }

    public void nonCompliantExample2(String str1, String str2) {
        int comparisonResult = str1.compareTo(str2);
        if (comparisonResult > 0) { // Noncompliant
            System.out.println("str1 is greater than str2");
        } else {
            System.out.println("str1 is not greater than str2");
        }
    }

    public void compliantExample1(String str1, String str2) {
        int comparisonResult = str1.compareTo(str2);
        if (comparisonResult > 0) {
            System.out.println("str1 is greater than str2");
        } else if (comparisonResult < 0) {
            System.out.println("str1 is less than str2");
        } else {
            System.out.println("str1 is equal to str2");
        }
    }

    public void compliantExample2(String str1, String str2) {
        if (str1.compareTo(str2) > 0) {
            System.out.println("str1 is greater than str2");
        } else if (str1.compareTo(str2) < 0) {
            System.out.println("str1 is less than str2");
        } else {
            System.out.println("str1 is equal to str2");
        }
    }
}
