public class PseudoRandomCheck {

    public void nonCompliantExample1() {
        int x = (int) (Math.random() * 100); // Noncompliant
        System.out.println(x);
    }

    public void nonCompliantExample2() {
        double y = Math.random(); // Noncompliant
        System.out.println(y);
    }

    public void compliantExample1() {
        java.util.Random random = new java.util.Random();
        int z = random.nextInt(100);
        System.out.println(z);
    }

    public void compliantExample2() {
        java.util.Random random = new java.util.Random(12345); // Seeded for reproducibility
        double w = random.nextDouble();
        System.out.println(w);
    }
}
