public class TooManyMethodsCheck {

    // Noncompliant - More than the allowed number of methods in a class.
    public void method1() {}
    public void method2() {}
    public void method3() {}
    public void method4() {}
    public void method5() {}
    public void method6() {}
    public void method7() {}
    public void method8() {}
    public void method9() {}
    public void method10() {}
    public void method11() {}
    public void method12() {}
    public void method13() {}
    public void method14() {}
    public void method15() {}
    public void method16() {}
    public void method17() {}
    public void method18() {}
    public void method19() {}
    public void method20() {}

    // Noncompliant - Another example of exceeding the method limit.
    public void anotherMethod1() {}
    public void anotherMethod2() {}
    public void anotherMethod3() {}
    public void anotherMethod4() {}
    public void anotherMethod5() {}
    public void anotherMethod6() {}
    public void anotherMethod7() {}
    public void anotherMethod8() {}
    public void anotherMethod9() {}
    public void anotherMethod10() {}
    public void anotherMethod11() {}
    public void anotherMethod12() {}
    public void anotherMethod13() {}
    public void anotherMethod14() {}
    public void anotherMethod15() {}
    public void anotherMethod16() {}
    public void anotherMethod17() {}
    public void anotherMethod18() {}
    public void anotherMethod19() {}
    public void anotherMethod20() {}

    // Compliant - Within the allowed method limit.
    public void compliantMethod1() {}
    public void compliantMethod2() {}
    public void compliantMethod3() {}
    public void compliantMethod4() {}
    public void compliantMethod5() {}

    // Compliant - A class with a reasonable number of methods.
    public void doSomething() {}
    public String getName() { return "Example"; }
    public void processData(int value) {}
}
