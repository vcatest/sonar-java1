public class ObjectFinalizeOverriddenCheck {

    // Noncompliant - Overriding finalize without calling super.finalize()
    public class NonCompliantClass1 {
        @Override
        protected void finalize() throws Throwable {
            // No call to super.finalize()
            System.out.println("Finalizing NonCompliantClass1");
        }
    }

    // Noncompliant - Overriding finalize without calling super.finalize()
    public class NonCompliantClass2 {
        @Override
        protected void finalize() throws Throwable {
            // Noncompliant - Missing super.finalize() call
            System.out.println("Finalizing NonCompliantClass2");
            throw new Exception("Something went wrong");
        }
    }

    // Compliant - Overriding finalize and calling super.finalize()
    public class CompliantClass1 {
        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.println("Finalizing CompliantClass1");
        }
    }

    // Compliant - Not overriding finalize at all
    public class CompliantClass2 {
        // No finalize method defined
    }

    public static void main(String[] args) {
        // This main method is just for compilation purposes.
        // The test is based on static analysis of the classes.
    }
}
