public class BooleanInversionCheck {

    public void nonCompliantExample1(boolean condition) {
        if (!condition) { // Noncompliant
            System.out.println("Condition is false");
        } else {
            System.out.println("Condition is true");
        }
    }

    public void nonCompliantExample2(boolean isValid) {
        if (!(isValid)) { // Noncompliant
            System.out.println("Invalid data");
        } else {
            System.out.println("Valid data");
        }
    }

    public void compliantExample1(boolean condition) {
        if (condition == false) {
            System.out.println("Condition is false");
        } else {
            System.out.println("Condition is true");
        }
    }

    public void compliantExample2(boolean isValid) {
        if (isValid == false) {
            System.out.println("Invalid data");
        } else {
            System.out.println("Valid data");
        }
    }

    public void compliantExample3(boolean flag) {
        if (!flag) {
            //do something
        }
    }
}
