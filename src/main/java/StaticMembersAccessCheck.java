public class StaticMembersAccessCheck {

    public static final String CONSTANT_VALUE = "Some Constant";

    public void nonCompliantExample1() {
        String message = StaticMembersAccessCheck.CONSTANT_VALUE; // Noncompliant
        System.out.println(message);
    }

    public void nonCompliantExample2(StaticMembersAccessCheck instance) {
        String message = instance.CONSTANT_VALUE; // Noncompliant
        System.out.println(message);
    }

    public void compliantExample1() {
        String message = StaticMembersAccessCheck.CONSTANT_VALUE;
        System.out.println(message);
    }

    public void compliantExample2() {
        String message = StaticMembersAccessCheck.CONSTANT_VALUE;
        System.out.println(message);
    }

    public static void main(String[] args) {
        StaticMembersAccessCheck instance = new StaticMembersAccessCheck();
        instance.nonCompliantExample1();
        instance.nonCompliantExample2(instance);
        instance.compliantExample1();
        instance.compliantExample2();
    }
}
