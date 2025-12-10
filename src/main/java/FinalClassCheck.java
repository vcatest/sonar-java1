public class FinalClassCheck {

    // Noncompliant
    public class NonFinalClass1 {
        public void method1() {
            System.out.println("Method 1");
        }
    }

    // Noncompliant
    public class NonFinalClass2 extends NonFinalClass1 {
        public void method2() {
            System.out.println("Method 2");
        }
    }

    // Compliant
    public final class FinalClass1 {
        public void method1() {
            System.out.println("Method 1");
        }
    }

    // Compliant
    public final class FinalClass2 {
        public void method1() {
            System.out.println("Method 1");
        }
    }

    public static void main(String[] args) {
        NonFinalClass1 obj1 = new NonFinalClass1();
        obj1.method1();

        NonFinalClass2 obj2 = new NonFinalClass2();
        obj2.method2();

        FinalClass1 obj3 = new FinalClass1();
        obj3.method1();

        FinalClass2 obj4 = new FinalClass2();
        obj4.method1();
    }
}
