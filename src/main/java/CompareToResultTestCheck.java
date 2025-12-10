public class CompareToResultTestCheck {

    public void nonCompliantExample1() {
        String str1 = "abc";
        String str2 = "abd";
        if (str1.compareTo(str2) > 0) { // Noncompliant
            System.out.println("str1 is greater than str2");
        } else {
            System.out.println("str1 is not greater than str2");
        }
    }

    public void nonCompliantExample2() {
        Integer num1 = 5;
        Integer num2 = 10;
        if (num1.compareTo(num2) < 0) { // Noncompliant
            System.out.println("num1 is less than num2");
        } else {
            System.out.println("num1 is not less than num2");
        }
    }

    public void compliantExample1() {
        String str1 = "abc";
        String str2 = "abd";
        int comparisonResult = str1.compareTo(str2);
        if (comparisonResult > 0) {
            System.out.println("str1 is greater than str2");
        } else {
            System.out.println("str1 is not greater than str2");
        }
    }

    public void compliantExample2() {
        Integer num1 = 5;
        Integer num2 = 10;
        int comparisonResult = num1.compareTo(num2);
        if (comparisonResult < 0) {
            System.out.println("num1 is less than num2");
        } else {
            System.out.println("num1 is not less than num2");
        }
    }
}
