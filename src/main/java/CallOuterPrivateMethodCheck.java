public class CallOuterPrivateMethodCheck {

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.testNoncompliant1();
        outer.testNoncompliant2();
        outer.testCompliant1();
        outer.testCompliant2();
    }
}

class OuterClass {

    private void privateMethod() {
        System.out.println("Private method called");
    }

    public void testNoncompliant1() {
        this.privateMethod(); // Noncompliant
    }

    public void testNoncompliant2() {
        OuterClass anotherOuter = new OuterClass();
        anotherOuter.privateMethod(); // Noncompliant
    }

    public void testCompliant1() {
        System.out.println("Compliant method 1");
    }

    public void testCompliant2() {
        InnerClass inner = new InnerClass();
        inner.accessPrivateMethod();
    }

    class InnerClass {
        public void accessPrivateMethod() {
            OuterClass.this.privateMethod();
        }
    }
}
