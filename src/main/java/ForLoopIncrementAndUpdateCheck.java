public class ForLoopIncrementAndUpdateCheck {

    public void nonCompliantExample1() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            i++; // Noncompliant
        }
    }

    public void nonCompliantExample2() {
        int j = 0;
        for (; j < 5; ) {
            System.out.println(j);
            j++; // Noncompliant
        }
    }

    public void compliantExample1() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public void compliantExample2() {
        for (int k = 0; k < 5; k++) {
            System.out.println(k);
        }
    }

    public void compliantExample3() {
        for (int l = 0; l < 5; ++l) {
            System.out.println(l);
        }
    }
}
