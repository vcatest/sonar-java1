public class GettersSettersOnRightFieldCheck {

    private String name;
    private int age;

    // Noncompliant - Getter used on the right-hand side of an assignment
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void method1() {
        String temp = getName(); // Noncompliant
        System.out.println(temp);
    }

    // Noncompliant - Setter used on the right-hand side of an assignment
    public void method2() {
        setAge(getAge() + 1); // Noncompliant
    }

    // Compliant - Getter used in a conditional statement
    public void method3() {
        if (getName() != null) {
            System.out.println("Name is not null");
        }
    }

    // Compliant - Setter used as a parameter to another method
    public void method4() {
        setName("John Doe");
        System.out.println("Name set successfully");
    }

    public static void main(String[] args) {
        GettersSettersOnRightFieldCheck obj = new GettersSettersOnRightFieldCheck();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
    }
}
