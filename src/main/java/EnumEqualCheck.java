public class EnumEqualCheck {

    // Noncompliant
    public void nonCompliantExample1(MyEnum input) {
        if (input == MyEnum.VALUE1) {
            System.out.println("Value 1");
        } else {
            System.out.println("Not Value 1");
        }
    }

    // Noncompliant
    public void nonCompliantExample2(MyEnum input) {
        if (MyEnum.VALUE2 == input) {
            System.out.println("Value 2");
        } else {
            System.out.println("Not Value 2");
        }
    }

    // Compliant
    public void compliantExample1(MyEnum input) {
        if (MyEnum.VALUE1.equals(input)) {
            System.out.println("Value 1");
        } else {
            System.out.println("Not Value 1");
        }
    }

    // Compliant
    public void compliantExample2(MyEnum input) {
        if (input.equals(MyEnum.VALUE2)) {
            System.out.println("Value 2");
        } else {
            System.out.println("Not Value 2");
        }
    }

    enum MyEnum {
        VALUE1,
        VALUE2,
        VALUE3
    }

    public static void main(String[] args) {
        EnumEqualCheck test = new EnumEqualCheck();
        test.nonCompliantExample1(MyEnum.VALUE1);
        test.nonCompliantExample2(MyEnum.VALUE2);
        test.compliantExample1(MyEnum.VALUE1);
        test.compliantExample2(MyEnum.VALUE2);
    }
}
