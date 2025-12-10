public class ReuseRandomCheck {

    // Noncompliant - Using new Random() repeatedly within a short scope.
    public void nonCompliantExample1() {
        for (int i = 0; i < 10; i++) {
            java.util.Random random = new java.util.Random(); // Noncompliant
            int randomNumber = random.nextInt(100);
            System.out.println(randomNumber);
        }
    }

    // Noncompliant - Creating a new Random instance inside a loop.
    public void nonCompliantExample2() {
        java.util.Random random; // Noncompliant
        for (int i = 0; i < 5; i++) {
            random = new java.util.Random(); // Noncompliant
            System.out.println(random.nextDouble());
        }
    }

    // Compliant - Creating a single Random instance and reusing it.
    public void compliantExample1() {
        java.util.Random random = new java.util.Random();
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100);
            System.out.println(randomNumber);
        }
    }

    // Compliant - Using a static Random instance.
    public void compliantExample2() {
        java.util.Random random = new java.util.Random();
        for (int i = 0; i < 5; i++) {
            System.out.println(random.nextDouble());
        }
    }

    public static void main(String[] args) {
        ReuseRandomCheck test = new ReuseRandomCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2();
        test.compliantExample1();
        test.compliantExample2();
    }
}
