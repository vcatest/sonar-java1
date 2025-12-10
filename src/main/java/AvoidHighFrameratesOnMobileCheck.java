public class AvoidHighFrameratesOnMobileCheck {

    // Noncompliant - Setting framerate to 60fps is too high for mobile.
    public void example1() {
        int framerate = 60;
        System.out.println("Framerate: " + framerate);
    }

    // Noncompliant - Using a value close to 60fps also violates the rule.
    public void example2() {
        float framerate = 58.5f;
        System.out.println("Framerate: " + framerate);
    }

    // Compliant - Setting framerate to 30fps is acceptable for mobile.
    public void example3() {
        int framerate = 30;
        System.out.println("Framerate: " + framerate);
    }

    // Compliant - Using a lower framerate like 24fps is also acceptable.
    public void example4() {
        int framerate = 24;
        System.out.println("Framerate: " + framerate);
    }

    public static void main(String[] args) {
        AvoidHighFrameratesOnMobileCheck test = new AvoidHighFrameratesOnMobileCheck();
        test.example1();
        test.example2();
        test.example3();
        test.example4();
    }
}
