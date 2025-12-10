public class ConstructorCallingOverridableCheck {

    // Noncompliant - Calling super() in a constructor that might be overridden.
    public class Base {
        public Base() {
            System.out.println("Base constructor");
        }
    }

    public class Derived extends Base {
        public Derived() {
            super(); // Noncompliant
            System.out.println("Derived constructor");
        }
    }

    // Noncompliant - Calling this() in a constructor that might be overridden.
    public class AnotherBase {
        public AnotherBase() {
            System.out.println("AnotherBase constructor");
        }
        public AnotherBase(int x) {
            this(); // Noncompliant
            System.out.println("AnotherBase constructor with int");
        }
    }

    public class AnotherDerived extends AnotherBase {
        public AnotherDerived() {
            System.out.println("AnotherDerived constructor");
        }
    }

    // Compliant - Calling super() in a final class constructor.
    public final class FinalBase {
        public FinalBase() {
            System.out.println("FinalBase constructor");
        }
    }

    public class FinalDerived extends FinalBase {
        public FinalDerived() {
            super();
            System.out.println("FinalDerived constructor");
        }
    }

    // Compliant - Calling this() in a final class constructor.
    public final class FinalAnotherBase {
        public FinalAnotherBase() {
            System.out.println("FinalAnotherBase constructor");
        }
        public FinalAnotherBase(int x) {
            this();
            System.out.println("FinalAnotherBase constructor with int");
        }
    }

    public class FinalAnotherDerived extends FinalAnotherBase {
        public FinalAnotherDerived() {
            System.out.println("FinalAnotherDerived constructor");
        }
    }
}
