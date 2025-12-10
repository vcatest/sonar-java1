public class EmptyBlockCheck {

    public void nonCompliantExample1() {
        if (true) {
            // Noncompliant
        }
    }

    public void nonCompliantExample2() {
        try {
            // Noncompliant
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }

    public void compliantExample1() {
        if (true) {
            System.out.println("This block is not empty");
        }
    }

    public void compliantExample2() {
        try {
            System.out.println("Trying something...");
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }

    public void compliantExample3() {
        if (true) {
            int x = 1;
            System.out.println(x);
        }
    }
}
