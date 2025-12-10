public class VarCanBeUsedCheck {

    public void nonCompliantExample1() {
        int x = 10;
        // Noncompliant
        x = 20;
    }

    public void nonCompliantExample2() {
        String message = "Hello";
        // Noncompliant
        message = "World";
    }

    public void compliantExample1() {
        int y = 5;
        y = y + 5;
    }

    public void compliantExample2() {
        String name = "John";
        name = name.toUpperCase();
    }

    public void compliantExample3() {
        int z = 0;
        z++;
    }

    public void compliantExample4() {
        double value = 3.14;
        value *= 2;
    }
}
