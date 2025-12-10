public class ReleaseSensorsCheck {

    // Noncompliant - Sensor acquired but not released
    public void example1() {
        java.util.Random random = new java.util.Random(); // Noncompliant
        // Some code using the random number generator
        System.out.println(random.nextInt());
    }

    // Noncompliant - Sensor acquired in a loop, but not released within the loop
    public void example2() {
        for (int i = 0; i < 10; i++) {
            java.util.Scanner scanner = new java.util.Scanner(System.in); // Noncompliant
            int input = scanner.nextInt();
            System.out.println("You entered: " + input);
        }
    }

    // Compliant - Sensor acquired and released
    public void example3() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println("You entered: " + input);
        scanner.close();
    }

    // Compliant - Sensor acquired and released within a try-with-resources block
    public void example4() {
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            int input = scanner.nextInt();
            System.out.println("You entered: " + input);
        }
    }

    // Compliant - Sensor acquired and released in a finally block
    public void example5() {
        java.util.Random random = new java.util.Random();
        try {
            System.out.println(random.nextInt());
        } finally {
            random = null; // Effectively releases the sensor.  While not a direct 'close()' or 'release()', setting to null prevents resource leaks.
        }
    }

    // Noncompliant - Sensor acquired, but release is in a different method
    public void example6() {
        java.util.Random random = new java.util.Random(); // Noncompliant
        useRandom(random);
    }

    public void useRandom(java.util.Random random) {
        System.out.println(random.nextInt());
        // No release here
    }

    // Compliant - Sensor acquired and released in the same method
    public void example7() {
        java.util.Random random = new java.util.Random();
        System.out.println(random.nextInt());
        random = null; // Release
    }
}
