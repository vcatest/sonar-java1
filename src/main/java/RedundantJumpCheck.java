public class RedundantJumpCheck {

    // Noncompliant - Redundant jump to the end of the method
    public void example1() {
        int x = 10;
        if (x > 5) {
            // Some code
        } else {
            // Some other code
        }
        return; // Noncompliant
    }

    // Noncompliant - Redundant jump to the end of the method within a loop
    public void example2() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                // Even number
            } else {
                // Odd number
            }
            return; // Noncompliant
        }
    }

    // Compliant - No redundant jump
    public void example3() {
        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        } else {
            System.out.println("x is not greater than 5");
        }
    }

    // Compliant - No redundant jump within a loop
    public void example4() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number: " + i);
            } else {
                System.out.println("Odd number: " + i);
            }
        }
    }
}
