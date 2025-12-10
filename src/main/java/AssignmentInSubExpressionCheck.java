public class AssignmentInSubExpressionCheck {

    public void nonCompliantExample1() {
        int x = 10;
        boolean result = (x = 5) > 0; // Noncompliant
        System.out.println(result);
    }

    public void nonCompliantExample2() {
        int y = 20;
        String message = "Value: " + (y = 15); // Noncompliant
        System.out.println(message);
    }

    public void compliantExample1() {
        int a = 30;
        boolean result = a > 0;
        a = 5;
        System.out.println(result);
    }

    public void compliantExample2() {
        int b = 40;
        String message = "Value: " + b;
        b = 15;
        System.out.println(message);
    }

    public void compliantExample3() {
        int c = 50;
        if ((c = 60) > 0) { //This is still compliant because the assignment is the entire condition
            System.out.println("c is greater than 0");
        }
    }
}
