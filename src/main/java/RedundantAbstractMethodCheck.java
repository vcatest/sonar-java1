public class RedundantAbstractMethodCheck {

    // Noncompliant
    abstract class BaseClass {
        public abstract void method1();
        public void method2() {
            System.out.println("BaseClass method2");
        }
    }

    class DerivedClass extends BaseClass {
        @Override
        public void method1() {
            System.out.println("DerivedClass method1");
        }
    }

    // Noncompliant
    abstract class AbstractClass {
        public abstract void doSomething();
    }

    class ConcreteClass extends AbstractClass {
        @Override
        public void doSomething() {
            System.out.println("Doing something");
        }
    }

    // Compliant
    abstract class BaseAbstract {
        public abstract void abstractMethod();
        public void concreteMethod() {
            System.out.println("BaseAbstract concreteMethod");
        }
    }

    class ImplementingClass extends BaseAbstract {
        @Override
        public void abstractMethod() {
            System.out.println("ImplementingClass abstractMethod");
        }
    }

    // Compliant
    interface MyInterface {
        void myMethod();
    }

    class MyClass implements MyInterface {
        @Override
        public void myMethod() {
            System.out.println("MyClass myMethod");
        }
    }
}
