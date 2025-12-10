public class AbstractClassWithoutAbstractMethodCheck {

    // Noncompliant
    abstract class AbstractClass1 {
        int x;
        public void concreteMethod() {
            System.out.println("Concrete method");
        }
    }

    // Noncompliant
    abstract class AbstractClass2 {
        String name;
        public void anotherConcreteMethod() {
            System.out.println("Another concrete method");
        }
    }

    // Compliant
    abstract class AbstractClass3 {
        public abstract void abstractMethod();
    }

    // Compliant
    abstract class AbstractClass4 {
        public abstract void method1();
        public abstract void method2();
    }

    public static void main(String[] args) {
        AbstractClass3 obj3 = new AbstractClass3() {
            @Override
            public void abstractMethod() {
                System.out.println("Implemented abstract method");
            }
        };

        AbstractClass4 obj4 = new AbstractClass4() {
            @Override
            public void method1() {
                System.out.println("Implemented method1");
            }

            @Override
            public void method2() {
                System.out.println("Implemented method2");
            }
        };
    }
}
