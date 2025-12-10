public class ForLoopFalseConditionCheck {

    // Noncompliant
    public void nonCompliantExample1() {
        for (int i = 0; i > 0; i++) { // Noncompliant
            System.out.println("This loop will not execute.");
        }
    }

    // Noncompliant
    public void nonCompliantExample2() {
        int j = 5;
        for (int k = 10; k < j; k++) { // Noncompliant
            System.out.println("This loop will not execute either.");
        }
    }

    // Compliant
    public void compliantExample1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("This loop will execute.");
        }
    }

    // Compliant
    public void compliantExample2() {
        int j = 5;
        for (int k = 0; k <= j; k++) {
            System.out.println("This loop will also execute.");
        }
    }

    public static void main(String[] args) {
        ForLoopFalseConditionCheck test = new ForLoopFalseConditionCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2();
        test.compliantExample1();
        test.compliantExample2();
    }
}
