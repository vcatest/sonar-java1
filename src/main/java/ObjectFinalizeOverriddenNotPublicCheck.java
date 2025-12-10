public class ObjectFinalizeOverriddenNotPublicCheck {

    // Noncompliant - finalize() is overridden and is not public
    class Base {
        protected void finalize() throws Throwable {
            super.finalize();
        }
    }

    // Noncompliant - finalize() is overridden and is not public
    class Base2 {
        private void finalize() throws Throwable {
            super.finalize();
        }
    }

    // Compliant - finalize() is not overridden
    class Compliant1 {
        // No finalize method
    }

    // Compliant - finalize() is overridden and is public
    class Compliant2 {
        public void finalize() throws Throwable {
            super.finalize();
        }
    }

    // Compliant - finalize() is overridden and is protected
    class Compliant3 {
        protected void finalize() throws Throwable {
            super.finalize();
        }
    }
}
