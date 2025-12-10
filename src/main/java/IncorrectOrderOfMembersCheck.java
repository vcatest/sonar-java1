public class IncorrectOrderOfMembersCheck {

    // Noncompliant - Instance variable declared after constructor
    public int someValue;
    public IncorrectOrderOfMembersCheck() {
        this.someValue = 10;
    }

    // Noncompliant - Private method declared before public method
    private void privateMethod() {
        System.out.println("Private method");
    }
    public void publicMethod() {
        System.out.println("Public method");
    }

    // Compliant - Fields first, then constructor, then methods
    public String name;
    public IncorrectOrderOfMembersCheck(String name) {
        this.name = name;
    }
    public void doSomething() {
        System.out.println("Doing something");
    }

    // Compliant - Correct order: field, constructor, method
    private int age;
    public IncorrectOrderOfMembersCheck(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
