public class StaticFieldUpateCheck {

    private static int staticField;

    public void nonCompliantExample1() {
        staticField++; // Noncompliant
    }

    public void nonCompliantExample2() {
        staticField = staticField + 1; // Noncompliant
    }

    public void compliantExample1() {
        int temp = staticField;
        staticField = temp + 1;
    }

    public void compliantExample2() {
        staticField = 10; //Initialization is compliant
    }

    public static void main(String[] args) {
        StaticFieldUpateCheck test = new StaticFieldUpateCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2();
        test.compliantExample1();
        test.compliantExample2();
    }
}
