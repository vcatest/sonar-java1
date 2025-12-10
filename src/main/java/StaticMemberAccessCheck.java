public class StaticMemberAccessCheck {

    public static final String CONSTANT_VALUE = "Some Constant";

    public void nonCompliantExample1() {
        String message = StaticMemberAccessCheck.CONSTANT_VALUE; // Noncompliant
        System.out.println(message);
    }

    public void nonCompliantExample2(StaticMemberAccessCheck instance) {
        String message = instance.CONSTANT_VALUE; // Noncompliant
        System.out.println(message);
    }

    public void compliantExample1() {
        String message = CONSTANT_VALUE;
        System.out.println(message);
    }

    public void compliantExample2() {
        String message = StaticMemberAccessCheck.CONSTANT_VALUE;
        System.out.println("Using constant directly: " + message);
    }

    public static void main(String[] args) {
        StaticMemberAccessCheck instance = new StaticMemberAccessCheck();
        instance.nonCompliantExample1();
        instance.nonCompliantExample2(instance);
        instance.compliantExample1();
        instance.compliantExample2();
    }
}
