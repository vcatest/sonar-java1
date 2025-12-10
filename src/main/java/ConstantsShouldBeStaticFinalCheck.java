public class ConstantsShouldBeStaticFinalCheck {

    // Noncompliant
    public int myConstant = 10;

    // Noncompliant
    public String anotherConstant = "Hello";

    // Compliant
    public static final int CORRECT_CONSTANT = 20;

    // Compliant
    public static final String CORRECT_ANOTHER_CONSTANT = "World";

    public void someMethod() {
        int localConstant = 30; //This is a local variable, not a class constant, so it's not checked by this rule.
        System.out.println(myConstant);
        System.out.println(anotherConstant);
        System.out.println(CORRECT_CONSTANT);
        System.out.println(CORRECT_ANOTHER_CONSTANT);
    }

    // Noncompliant
    protected double yetAnotherConstant = 3.14;

    // Compliant
    public static final boolean IS_TRUE = true;
}
