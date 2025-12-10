public class VariableDeclarationScopeCheck {

    public void nonCompliantExample1() {
        int x = 10;
        if (true) {
            x = 20; // Noncompliant - Variable 'x' declared outside the if block is modified inside.
        }
        System.out.println(x);
    }

    public void nonCompliantExample2() {
        int y = 5;
        for (int i = 0; i < 5; i++) {
            y = y + i; // Noncompliant - Variable 'y' declared outside the for loop is modified inside.
        }
        System.out.println(y);
    }

    public void compliantExample1() {
        int a = 10;
        if (true) {
            int b = 20; // Variable 'b' is declared within the if block.
            System.out.println(b);
        }
        System.out.println(a);
    }

    public void compliantExample2() {
        int c = 5;
        for (int i = 0; i < 5; i++) {
            int d = c + i; // Variable 'd' is declared within the for loop.
            System.out.println(d);
        }
        System.out.println(c);
    }
}
