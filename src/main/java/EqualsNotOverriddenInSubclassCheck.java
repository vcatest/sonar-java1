public class EqualsNotOverriddenInSubclassCheck {

    // Noncompliant Example 1
    public class Base {
        public boolean equals(Object obj) {
            return super.equals(obj);
        }
    }

    public class Sub extends Base {
        // Noncompliant - equals method should be overridden if Base overrides it.
        @Override
        public boolean equals(Object obj) {
            return true;
        }
    }

    // Noncompliant Example 2
    public class Parent {
        public boolean equals(Object obj) {
            return false;
        }
    }

    public class Child extends Parent {
        // Noncompliant - equals method should be overridden if Parent overrides it.
        @Override
        public boolean equals(Object obj) {
            return obj == this;
        }
    }

    // Compliant Example 1
    public class Animal {
        public boolean equals(Object obj) {
            return obj == this;
        }
    }

    public class Dog extends Animal {
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Dog other = (Dog) obj;
            return true;
        }
    }

    // Compliant Example 2
    public class Vehicle {
    }

    public class Car extends Vehicle {
    }
}
