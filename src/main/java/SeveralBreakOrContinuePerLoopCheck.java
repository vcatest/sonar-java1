public class SeveralBreakOrContinuePerLoopCheck {

    // Noncompliant
    public void nonCompliantExample1() {
        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                break; // Noncompliant
            }
            if (i == 5) {
                continue; // Noncompliant
            }
            System.out.println(i);
        }
    }

    // Noncompliant
    public void nonCompliantExample2() {
        int j = 0;
        while (j < 5) {
            if (j == 1) {
                break; // Noncompliant
            }
            if (j == 3) {
                continue; // Noncompliant
            }
            j++;
        }
    }

    // Compliant
    public void compliantExample1() {
        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                break;
            }
            System.out.println(i);
        }
    }

    // Compliant
    public void compliantExample2() {
        int j = 0;
        while (j < 5) {
            if (j == 3) {
                continue;
            }
            j++;
        }
    }
}
