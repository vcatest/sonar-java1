public class LoopExecutingAtMostOnceCheck {

    // Noncompliant - Loop executes at most once, but is still present.
    public void noncompliantExample1() {
        boolean condition = false;
        for (int i = 0; i < 1; i++) { // Noncompliant
            if (condition) {
                System.out.println("This will never print");
            }
        }
    }

    // Noncompliant - Loop executes at most once, but is still present.
    public void noncompliantExample2(boolean flag) {
        for (int i = 0; i < (flag ? 0 : 1); i++) { // Noncompliant
            System.out.println("This might not print");
        }
    }

    // Compliant - Loop is not present.
    public void compliantExample1() {
        System.out.println("No loop here");
    }

    // Compliant - Loop executes more than once.
    public void compliantExample2(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("This will print multiple times");
        }
    }

    // Compliant - Loop condition is not a constant.
    public void compliantExample3(int value) {
        for (int i = 0; i < value; i++) {
            System.out.println("Looping based on a variable");
        }
    }
}
