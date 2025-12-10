public class TooManyParametersCheck {

    // Noncompliant - Method with too many parameters
    public void methodWithManyParameters(int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        // Some logic here
    }

    // Noncompliant - Another method with too many parameters
    public String processData(String input1, String input2, String input3, String input4, String input5, String input6) { // Noncompliant
        return input1 + input2 + input3 + input4 + input5 + input6;
    }

    // Compliant - Method with a reasonable number of parameters
    public void simpleMethod(int x, int y) {
        int sum = x + y;
        System.out.println("Sum: " + sum);
    }

    // Compliant - Method using an object to pass multiple values
    public void processDetails(Person person) {
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
