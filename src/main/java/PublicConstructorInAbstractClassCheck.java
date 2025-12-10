public class PublicConstructorInAbstractClassCheck {

    // Noncompliant
    public abstract class AbstractClassWithPublicConstructor {
        public AbstractClassWithPublicConstructor() {
        }

        public abstract void abstractMethod();
    }

    // Noncompliant
    public abstract class AnotherAbstractClassWithPublicConstructor {
        public AnotherAbstractClassWithPublicConstructor(int x) {
        }

        public abstract void anotherAbstractMethod();
    }

    // Compliant
    protected abstract class AbstractClassWithProtectedConstructor {
        protected AbstractClassWithProtectedConstructor() {
        }

        public abstract void abstractMethod();
    }

    // Compliant
    private abstract class AbstractClassWithPrivateConstructor {
        private AbstractClassWithPrivateConstructor() {
        }

        public abstract void abstractMethod();

        static AbstractClassWithPrivateConstructor createInstance() {
            return new ConcreteImplementation();
        }

        static class ConcreteImplementation extends AbstractClassWithPrivateConstructor {
            //Implementation details
        }
    }
}
