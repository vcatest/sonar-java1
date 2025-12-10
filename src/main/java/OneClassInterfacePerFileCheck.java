public class OneClassInterfacePerFileCheck {

    // Noncompliant - Multiple interfaces in one file
    interface FirstInterface {
        void method1();
    }

    interface SecondInterface {
        void method2();
    }

    // Compliant - Single interface in a file
    interface SingleInterface {
        void method3();
    }

    // Noncompliant - Class and interface in the same file
    class MyClass {
        public void doSomething() {
            System.out.println("Doing something");
        }
    }
    
    interface MyInterface { // Noncompliant
        void doInterfaceThing();
    }

    // Compliant - Single class in a file
    class AnotherClass {
        public void anotherMethod() {
            System.out.println("Another method");
        }
    }

    // Compliant - Single interface in a file
    interface YetAnotherInterface {
        void yetAnotherMethod();
    }
}
