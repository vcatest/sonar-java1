public class ObjectFinalizeOverriddenCallsSuperFinalizeCheck {

    // Noncompliant Example 1
    public class ClassA {
        protected void finalize() throws Throwable {
            System.out.println("ClassA finalize");
        }
    }

    public class ClassB extends ClassA {
        @Override
        protected void finalize() throws Throwable {
            super.finalize(); // Noncompliant
            System.out.println("ClassB finalize");
        }
    }

    // Noncompliant Example 2
    public class ClassC {
        protected void finalize() throws Throwable {
            System.out.println("ClassC finalize");
        }
    }

    public class ClassD extends ClassC {
        @Override
        protected void finalize() throws Throwable {
            try {
                super.finalize(); // Noncompliant
            } catch (Throwable e) {
                e.printStackTrace();
            }
            System.out.println("ClassD finalize");
        }
    }

    // Compliant Example 1
    public class ClassE {
        protected void finalize() throws Throwable {
            System.out.println("ClassE finalize");
        }
    }

    public class ClassF extends ClassE {
        @Override
        protected void finalize() throws Throwable {
            System.out.println("ClassF finalize");
        }
    }

    // Compliant Example 2
    public class ClassG {
        protected void finalize() throws Throwable {
            System.out.println("ClassG finalize");
        }
    }

    public class ClassH extends ClassG {
        @Override
        protected void finalize() throws Throwable {
            // Do something else
            System.out.println("ClassH finalize");
        }
    }
}
