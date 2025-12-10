public class ForLoopCounterChangedCheck {

    // Noncompliant - Counter 'i' is modified within the loop
    public void nonCompliantExample1() {
        for (int i = 0; i < 10; i++) {
            i++; // Noncompliant
            System.out.println(i);
        }
    }

    // Noncompliant - Counter 'j' is modified within the loop
    public void nonCompliantExample2() {
        for (int j = 0; j < 5; j++) {
            j = j + 1; // Noncompliant
            System.out.println(j);
        }
    }

    // Compliant - Counter 'k' is not modified within the loop
    public void compliantExample1() {
        for (int k = 0; k < 10; k++) {
            System.out.println(k);
        }
    }

    // Compliant - Counter 'l' is not modified within the loop
    public void compliantExample2() {
        for (int l = 0; l < 5; l++) {
            int temp = l * 2;
            System.out.println(temp);
        }
    }

    // Compliant - Using a different variable for incrementing
    public void compliantExample3() {
        for (int m = 0; m < 10; m++) {
            int n = m + 1;
            System.out.println(n);
        }
    }
}
