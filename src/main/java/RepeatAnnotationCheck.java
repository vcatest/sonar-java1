public class RepeatAnnotationCheck {

    // Noncompliant
    @Deprecated
    @Deprecated
    public void method1() {
        System.out.println("Method 1");
    }

    // Noncompliant
    @SuppressWarnings("unchecked")
    @SuppressWarnings("unchecked")
    public void method2() {
        System.out.println("Method 2");
    }

    // Compliant
    @Deprecated
    public void method3() {
        System.out.println("Method 3");
    }

    // Compliant
    @SuppressWarnings("unchecked")
    public void method4() {
        System.out.println("Method 4");
    }

    @Override
    public String toString() {
        return "RepeatAnnotationCheck";
    }
}
