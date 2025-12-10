public class ClassBuilderWithMethodCheck {

    // Noncompliant - Builder class with a method that doesn't follow builder pattern conventions
    public static class NonCompliantBuilder1 {
        private String name;
        private int age;

        public NonCompliantBuilder1(String name) {
            this.name = name;
        }

        public NonCompliantBuilder1 setAge(int age) {
            this.age = age;
            return this;
        }

        public void build() { // Noncompliant - Should return the object, not void
            System.out.println("Building with name: " + name + ", age: " + age);
        }
    }

    // Noncompliant - Builder class with a method that modifies the object directly instead of returning a new instance
    public static class NonCompliantBuilder2 {
        private String city;

        public NonCompliantBuilder2(String city) {
            this.city = city;
        }

        public void setCity(String city) { // Noncompliant - Should return the builder instance
            this.city = city;
        }

        public String getCity() {
            return city;
        }
    }

    // Compliant - Standard builder pattern implementation
    public static class CompliantBuilder1 {
        private String firstName;
        private String lastName;

        public CompliantBuilder1(String firstName) {
            this.firstName = firstName;
        }

        public CompliantBuilder1 setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Person build() {
            return new Person(firstName, lastName);
        }

        public static class Person {
            private final String firstName;
            private final String lastName;

            public Person(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }

            public String getFirstName() {
                return firstName;
            }

            public String getLastName() {
                return lastName;
            }
        }
    }

    // Compliant - Builder pattern with fluent interface
    public static class CompliantBuilder2 {
        private int id;
        private String description;

        public CompliantBuilder2(int id) {
            this.id = id;
        }

        public CompliantBuilder2 withDescription(String description) {
            this.description = description;
            return this;
        }

        public Item build() {
            return new Item(id, description);
        }

        public static class Item {
            private final int id;
            private final String description;

            public Item(int id, String description) {
                this.id = id;
                this.description = description;
            }

            public int getId() {
                return id;
            }

            public String getDescription() {
                return description;
            }
        }
    }
}
