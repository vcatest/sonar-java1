public class ForLoopUsedAsWhileLoopCheck {

    // Noncompliant
    public void nonCompliantExample1() {
        for (int i = 0; i < 10; i++) { // Noncompliant
            System.out.println(i);
        }
    }

    // Noncompliant
    public void nonCompliantExample2() {
        int j = 0;
        for (; j < 5; j++) { // Noncompliant
            System.out.println(j * 2);
        }
    }

    // Compliant
    public void compliantExample1() {
        int k = 0;
        while (k < 5) {
            System.out.println(k + 1);
            k++;
        }
    }

    // Compliant
    public void compliantExample3() {
        for (int l = 0; l < 5; l++) {
            if (l == 2) {
                break;
            }
            System.out.println(l);
        }
    }

    public static void main(String[] args) {
        ForLoopUsedAsWhileLoopCheck test = new ForLoopUsedAsWhileLoopCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2();
        test.compliantExample1();
        test.compliantExample3();
    }
}
