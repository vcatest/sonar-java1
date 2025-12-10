public class CallSuperMethodFromInnerClassCheck {

    // Noncompliant - Calling super() from an inner class directly.
    public class InnerClass1 {
        public InnerClass1() {
            super(); // Noncompliant
        }
    }

    // Noncompliant - Calling a specific superclass method from an inner class.
    public class InnerClass2 {
        public void method() {
            super.someMethod(); // Noncompliant
        }
    }

    public class SuperClass {
        public void someMethod() {
            System.out.println("SuperClass method");
        }
    }

    public class SubClass extends SuperClass {
        public class InnerClass3 {
            public void method() {
                // Compliant - Accessing superclass members through the outer class instance.
                SubClass.this.someMethod();
            }
        }
    }

    public class AnotherSuperClass {
        public void anotherMethod() {
            System.out.println("AnotherSuperClass method");
        }
    }

    public class AnotherSubClass extends AnotherSuperClass {
        public class InnerClass4 {
            public void method() {
                // Compliant - No direct call to super from inner class.
                System.out.println("InnerClass4 method");
            }
        }
    }

    public static void main(String[] args) {
        CallSuperMethodFromInnerClassCheck test = new CallSuperMethodFromInnerClassCheck();
        test.new InnerClass1();
        test.new InnerClass2().method();
        test.new SubClass().new InnerClass3().method();
        test.new AnotherSubClass().new InnerClass4().method();
    }
}
