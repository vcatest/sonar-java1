public class DeadStoreCheck {

    public void nonCompliantExample1() {
        int x = 5; // Noncompliant
        x = 10;
        System.out.println(x);
    }

    public void nonCompliantExample2() {
        String message = "Hello"; // Noncompliant
        message = "World";
        System.out.println(message);
    }

    public void nonCompliantExample3() {
        boolean flag = true; // Noncompliant
        flag = false;
        if (flag) {
            System.out.println("This won't print");
        }
    }

    public void compliantExample1() {
        int y = 5;
        System.out.println(y);
    }

    public void compliantExample2() {
        String name = "John";
        System.out.println(name);
    }

    public void compliantExample3() {
        int z = 5;
        z = z + 10;
        System.out.println(z);
    }

    public void compliantExample4() {
        boolean isValid = false;
        if (isValid) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
