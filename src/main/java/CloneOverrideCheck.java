public class CloneOverrideCheck {

    // Noncompliant - Overriding finalize without calling super.finalize()
    public class Base {
        public void finalize() throws Throwable {
            System.out.println("Base finalize");
        }
    }

    public class Derived extends Base {
        @Override
        public void finalize() throws Throwable {
            // Noncompliant
            System.out.println("Derived finalize");
        }
    }

    // Noncompliant - Overriding clone without calling super.clone()
    public class Original {
        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    public class Copy extends Original {
        @Override
        protected Object clone() throws CloneNotSupportedException {
            // Noncompliant
            return new Copy();
        }
    }

    // Compliant - Correctly overriding finalize and calling super.finalize()
    public class CompliantBase {
        public void finalize() throws Throwable {
            System.out.println("CompliantBase finalize");
        }
    }

    public class CompliantDerived extends CompliantBase {
        @Override
        public void finalize() throws Throwable {
            super.finalize();
            System.out.println("CompliantDerived finalize");
        }
    }

    // Compliant - Correctly overriding clone and calling super.clone()
    public class CompliantOriginal {
        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    public class CompliantCopy extends CompliantOriginal {
        @Override
        protected Object clone() throws CloneNotSupportedException {
            Object cloned = super.clone();
            return cloned;
        }
    }
}
