public class DoubleBraceInitializationCheck {

    public void nonCompliantExample1() {
        String str = new String("Hello") {
            @Override
            public String toString() {
                return "Custom String";
            }
        }; // Noncompliant
        System.out.println(str);
    }

    public void nonCompliantExample2() {
        Integer num = new Integer(10) {
            @Override
            public int intValue() {
                return 20;
            }
        }; // Noncompliant
        System.out.println(num);
    }

    public void compliantExample1() {
        String str = "Hello";
        System.out.println(str);
    }

    public void compliantExample2() {
        Integer num = 10;
        System.out.println(num);
    }

    public static void main(String[] args) {
        DoubleBraceInitializationCheck check = new DoubleBraceInitializationCheck();
        check.nonCompliantExample1();
        check.nonCompliantExample2();
        check.compliantExample1();
        check.compliantExample2();
    }
}
