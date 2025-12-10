public class UselessExtendsCheck {

    // Noncompliant
    public class A extends Object {
        public void foo() {}
    }

    // Noncompliant
    public class B extends java.lang.Object {
        public void bar() {}
    }

    public class C {
        public void baz() {}
    }

    // Compliant
    public class D extends Exception {
        public D(String message) {
            super(message);
        }
    }

    // Compliant
    public class E extends java.util.ArrayList<String> {
        public E() {
            super();
        }
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D("Test");
        E e = new E();
    }
}
