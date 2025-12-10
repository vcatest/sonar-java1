public class ThisExposedFromConstructorCheck {

    // Noncompliant - Exposing 'this' from a constructor
    public class NonCompliant1 {
        private final int value;

        public NonCompliant1(int value) {
            this.value = value;
            exposeThis(); // Noncompliant
        }

        private void exposeThis() {
            System.out.println(this);
        }
    }

    // Noncompliant - Exposing 'this' from a constructor via another method call
    public class NonCompliant2 {
        private final String message;

        public NonCompliant2(String message) {
            this.message = message;
            doSomethingWithThis(this); // Noncompliant
        }

        private void doSomethingWithThis(NonCompliant2 obj) {
            System.out.println(obj);
        }
    }

    // Compliant - 'this' is not exposed from the constructor directly or indirectly
    public class Compliant1 {
        private final int count;

        public Compliant1(int count) {
            this.count = count;
            System.out.println("Count initialized: " + count);
        }

        public int getCount() {
            return count;
        }
    }

    // Compliant - 'this' is used internally within the constructor but not exposed
    public class Compliant2 {
        private final String name;

        public Compliant2(String name) {
            this.name = name;
            internalUseOfThis();
        }

        private void internalUseOfThis() {
            System.out.println("Name is: " + this.name); // This is fine, 'this' is not exposed
        }
    }
}
