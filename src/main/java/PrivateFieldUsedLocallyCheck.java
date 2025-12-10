public class PrivateFieldUsedLocallyCheck {

    private String privateField1;
    private int privateField2;

    public void method1() {
        privateField1 = "test"; // Noncompliant
        System.out.println(privateField1);
    }

    public void method2() {
        privateField2 = 10; // Noncompliant
        int result = privateField2 * 2;
        System.out.println(result);
    }

    public void method3() {
        privateField1 = "another test";
        method4();
    }

    public void method4() {
        System.out.println(privateField1);
    }

    public void method5() {
        privateField2 = 5;
        method6(privateField2);
    }

    public void method6(int value) {
        System.out.println(value);
    }

    public void method7() {
        String localVariable = "test";
        privateField1 = localVariable;
        method8(privateField1);
    }

    public void method8(String value) {
        System.out.println(value);
    }

    public void method9() {
        int localVariable = 10;
        privateField2 = localVariable;
        method10(privateField2);
    }

    public void method10(int value) {
        System.out.println(value);
    }
}
