public class UselessParenthesesCheck {

    public void nonCompliantExample1() {
        int x = (5 + 3); // Noncompliant
        System.out.println(x);
    }

    public void nonCompliantExample2() {
        if ((true)) { // Noncompliant
            System.out.println("This will always print");
        }
    }

    public void compliantExample1() {
        int y = 5 + 3;
        System.out.println(y);
    }

    public void compliantExample2() {
        if (true) {
            System.out.println("This will also always print");
        }
    }

    public void nonCompliantExample3() {
        int z = (10); // Noncompliant
        System.out.println(z);
    }

    public void compliantExample3() {
        int a = 10;
        System.out.println(a);
    }
}
