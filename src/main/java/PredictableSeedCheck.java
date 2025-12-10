public class PredictableSeedCheck {

    // Noncompliant - Using current time milliseconds as seed. This is predictable.
    public static void nonCompliantExample1() {
        long seed = System.currentTimeMillis();
        java.util.Random random = new java.util.Random(seed);
        int randomNumber = random.nextInt();
        System.out.println("Random number: " + randomNumber);
    }

    // Noncompliant - Using a constant value as seed. This is predictable.
    public static void nonCompliantExample2() {
        long seed = 12345;
        java.util.Random random = new java.util.Random(seed);
        int randomNumber = random.nextInt();
        System.out.println("Random number: " + randomNumber);
    }

    // Compliant - Using java.security.SecureRandom for a cryptographically secure seed.
    public static void compliantExample1() throws java.security.NoSuchAlgorithmException {
        java.security.SecureRandom secureRandom = java.security.SecureRandom.getInstanceStrong();
        int randomNumber = secureRandom.nextInt();
        System.out.println("Random number: " + randomNumber);
    }

    // Compliant - Using a more unpredictable source for the seed.
    public static void compliantExample2() {
        long seed = Double.doubleToLongBits(Math.random());
        java.util.Random random = new java.util.Random(seed);
        int randomNumber = random.nextInt();
        System.out.println("Random number: " + randomNumber);
    }

    public static void main(String[] args) throws java.security.NoSuchAlgorithmException {
        nonCompliantExample1();
        nonCompliantExample2();
        compliantExample1();
        compliantExample2();
    }
}
