public class OverrideAnnotationCheck {

    // Noncompliant
    public void someMethod() {
        // This method overrides a method from a superclass, but doesn't use @Override
    }

    // Noncompliant
    public String toString() {
        // Overriding toString without @Override
        return "OverrideAnnotationCheck";
    }

    // Compliant
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    // Compliant
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        OverrideAnnotationCheck check = new OverrideAnnotationCheck();
        System.out.println(check.toString());
    }
}
