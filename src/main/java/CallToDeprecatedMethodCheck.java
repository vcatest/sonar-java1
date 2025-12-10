public class CallToDeprecatedMethodCheck {

    @Deprecated
    public void oldMethod() {
        System.out.println("This is an old method.");
    }

    public void newMethod() {
        System.out.println("This is a new method.");
    }

    public void testNoncompliant1() {
        oldMethod(); // Noncompliant
    }

    public void testNoncompliant2() {
        CallToDeprecatedMethodCheck obj = new CallToDeprecatedMethodCheck();
        obj.oldMethod(); // Noncompliant
    }

    public void testCompliant1() {
        newMethod();
    }

    public void testCompliant2() {
        System.out.println("Using a different method.");
    }

    @Deprecated
    public int calculate(int a, int b) {
        return a + b;
    }

    public int modernCalculate(int a, int b) {
        return a * b;
    }

    public void testNoncompliant3() {
        int result = calculate(5, 3); // Noncompliant
        System.out.println(result);
    }

    public void testCompliant3() {
        int result = modernCalculate(5, 3);
        System.out.println(result);
    }
}
