public class AtLeastOneConstructorCheck {

    // Noncompliant - Class with no constructors
    public class NonCompliant1 {
        private String name;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    // Noncompliant - Class with only a default constructor, but it's private
    public class NonCompliant2 {
        private int age;

        private NonCompliant2() {
        }

        public int getAge() {
            return age;
        }
    }

    // Compliant - Class with a default constructor
    public class Compliant1 {
        private String city;

        public Compliant1() {
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCity() {
            return city;
        }
    }

    // Compliant - Class with a parameterized constructor
    public class Compliant2 {
        private double salary;

        public Compliant2(double salary) {
            this.salary = salary;
        }

        public double getSalary() {
            return salary;
        }
    }
}
