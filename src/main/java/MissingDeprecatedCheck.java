public class MissingDeprecatedCheck {

    // Noncompliant
    @Deprecated
    public void oldMethod() {
        System.out.println("This method is deprecated, but no check is performed.");
    }

    // Noncompliant
    @Deprecated
    public static void anotherOldMethod() {
        System.out.println("Another deprecated method without usage check.");
    }

    public void newMethod() {
        System.out.println("This is a new method.");
    }

    // Compliant
    @Deprecated
    public void oldMethodWithCheck() {
        System.out.println("This method is deprecated and a check is performed.");
        if (true) { //Example check.  Could be any condition.
            System.out.println("Deprecated method used, consider refactoring.");
        }
    }

    // Compliant
    @Deprecated
    public static void anotherOldMethodWithCheck() {
        System.out.println("Another deprecated method with usage check.");
        if (System.currentTimeMillis() > 0) { //Example check. Could be any condition.
            System.out.println("Deprecated method used, consider refactoring.");
        }
    }

    public static void main(String[] args) {
        MissingDeprecatedCheck test = new MissingDeprecatedCheck();
        test.oldMethod();
        anotherOldMethod();
        test.newMethod();
        test.oldMethodWithCheck();
        anotherOldMethodWithCheck();
    }
}
