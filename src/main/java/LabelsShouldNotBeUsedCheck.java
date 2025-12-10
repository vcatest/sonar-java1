public class LabelsShouldNotBeUsedCheck {

    public void nonCompliantExample1() {
        int x = 10;
        if (x > 5) {
            System.out.println("This is a label:"); // Noncompliant
        }
    }

    public void nonCompliantExample2() {
        loop1:
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break loop1; // Noncompliant
            }
            System.out.println(i);
        }
    }

    public void compliantExample1() {
        int x = 10;
        if (x > 5) {
            System.out.println("Value is greater than 5");
        }
    }

    public void compliantExample2() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
