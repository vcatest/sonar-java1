public class InterfaceOrSuperclassShadowingCheck {

    // Noncompliant - Shadowing interface method
    interface MyInterface {
        int getValue();
    }

    class MyClass implements MyInterface {
        public int getValue() { // Noncompliant
            return 0;
        }
    }

    // Noncompliant - Shadowing superclass method
    class SuperClass {
        public String getName() {
            return "Super";
        }
    }

    class SubClass extends SuperClass {
        public String getName() { // Noncompliant
            return "Sub";
        }
    }

    // Compliant - No shadowing
    interface AnotherInterface {
        int calculateValue();
    }

    class AnotherClass implements AnotherInterface {
        public int calculateValue() {
            return 1;
        }

        public int someOtherMethod() {
            return 2;
        }
    }

    // Compliant - Using a different name
    class BaseClass {
        public String baseName() {
            return "Base";
        }
    }

    class DerivedClass extends BaseClass {
        public String derivedName() {
            return "Derived";
        }
    }
}
