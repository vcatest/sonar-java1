public class NestedBlocksCheck {

    public void nonCompliantExample1() {
        if (true) {
            System.out.println("Outer block");
            if (false) {
                System.out.println("Inner block"); // Noncompliant
            }
            System.out.println("Outer block continues");
        }
    }

    public void nonCompliantExample2() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Outer loop");
            for (int j = 0; j < 5; j++) {
                System.out.println("Inner loop"); // Noncompliant
            }
            System.out.println("Outer loop continues");
        }
    }

    public void compliantExample1() {
        if (true) {
            System.out.println("Block 1");
        }
        if (false) {
            System.out.println("Block 2");
        }
    }

    public void compliantExample2() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop iteration 1");
        }
        for (int j = 0; j < 10; j++) {
            System.out.println("Loop iteration 2");
        }
    }
}
