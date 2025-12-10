public class MethodOnlyCallsSuperCheck {

    // Noncompliant - Method only calls super's method without adding any logic.
    public void method1() {
        super.someMethod(); // Noncompliant
    }

    // Noncompliant - Method only calls super's method with the same arguments.
    public void method2(int x) {
        super.someMethod(x); // Noncompliant
    }

    // Compliant - Method calls super's method and adds additional logic.
    public void method3() {
        super.someMethod();
        System.out.println("Additional logic");
    }

    // Compliant - Method calls super's method and modifies the result.
    public int method4(int x) {
        int result = super.someMethod(x);
        return result + 1;
    }

    // Compliant - Method calls super and then does something else.
    public void method5() {
        super.anotherMethod();
        int i = 0;
        i++;
    }

    // Noncompliant - Empty method that only calls super.
    public void method6() {
        super.yetAnotherMethod(); // Noncompliant
    }

    // Compliant - Method with local variable and super call.
    public void method7() {
        int a = 10;
        super.someMethod();
        a = a + 5;
    }
}
