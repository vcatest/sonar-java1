public class BoxedBooleanExpressionsCheck {

    public void nonCompliantExample1() {
        Boolean a = true;
        if (a == true) { // Noncompliant
            System.out.println("True");
        }
    }

    public void nonCompliantExample2() {
        Boolean b = false;
        while (b == false) { // Noncompliant
            System.out.println("False");
            b = true;
        }
    }

    public void compliantExample1() {
        boolean a = true;
        if (a) {
            System.out.println("True");
        }
    }

    public void compliantExample2() {
        boolean b = false;
        while (!b) {
            System.out.println("False");
            b = true;
        }
    }

    public void compliantExample3() {
        Boolean c = Boolean.TRUE;
        if (c) {
            System.out.println("True");
        }
    }

    public void nonCompliantExample3() {
        Boolean d = Boolean.FALSE;
        if (d == false) { // Noncompliant
            System.out.println("False");
        }
    }
}
