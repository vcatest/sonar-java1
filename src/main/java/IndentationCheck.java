public class IndentationCheck {

    public void nonCompliantExample1() {
     int x = 10;
      System.out.println(x); // Noncompliant
    }

    public void nonCompliantExample2() {
        if (true)
        {
            System.out.println("Hello"); // Noncompliant
        }
    }

    public void compliantExample1() {
        int y = 20;
        System.out.println(y);
    }

    public void compliantExample2() {
        if (false) {
            System.out.println("World");
        }
    }

    public void compliantExample3() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
