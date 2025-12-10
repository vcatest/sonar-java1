public class ForLoopIncrementSignCheck {

    public void nonCompliantExample1() {
        for (int i = 0; i >= 0; i--) { // Noncompliant
            System.out.println(i);
        }
    }

    public void nonCompliantExample2() {
        int j = 0;
        for (; j > -1; j--) { // Noncompliant
            System.out.println(j);
        }
    }

    public void compliantExample1() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public void compliantExample2() {
        int k = 0;
        for (; k <= 5; k++) {
            System.out.println(k);
        }
    }
}
