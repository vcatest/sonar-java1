public class TypeParametersShadowingCheck {

    // Noncompliant - Type parameter T shadows a field of the same name.
    private String T;
    public <T> void method1(T t) {
        T = t.toString();
    }

    // Noncompliant - Type parameter U shadows a local variable of the same name.
    public <U> void method2(U u) {
        String localU = "hello";
        String result = u.toString();
        System.out.println(result);
    }

    // Compliant - No shadowing occurs.
    public <T> void method3(T t) {
        String someString = t.toString();
    }

    // Compliant - Type parameter is used without shadowing.
    public <U> U method4(U u) {
        return u;
    }

    public static void main(String[] args) {
        TypeParametersShadowingCheck test = new TypeParametersShadowingCheck();
        test.method1("test");
        test.method2();
        test.method3("compliant");
        test.method4(10);
    }
}
