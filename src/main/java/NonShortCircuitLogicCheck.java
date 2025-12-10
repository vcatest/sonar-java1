public class NonShortCircuitLogicCheck {

    public void nonCompliantExample1(boolean condition1, boolean condition2) {
        if (condition1 && condition2) { // Noncompliant
            System.out.println("Both conditions are true");
        }
    }

    public void nonCompliantExample2(boolean condition1, boolean condition2) {
        if (condition2 && condition1) { // Noncompliant
            System.out.println("Both conditions are true");
        }
    }

    public void compliantExample1(boolean condition1, boolean condition2) {
        if (condition1 && (condition2)) {
            System.out.println("Both conditions are true");
        }
    }

    public void compliantExample2(boolean condition1, boolean condition2) {
        if ((condition1) && condition2) {
            System.out.println("Both conditions are true");
        }
    }

    public void compliantExample3(boolean condition1, boolean condition2) {
        if (condition1 && true) {
            System.out.println("Condition 1 is true");
        }
    }

    public void compliantExample4(boolean condition1, boolean condition2) {
        if (true && condition1) {
            System.out.println("Condition 1 is true");
        }
    }
}
