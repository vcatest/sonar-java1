public class EmptyClassCheck {

    // Noncompliant
    public class EmptyClass1 {
    }

    // Noncompliant
    public class EmptyClass2 {

    }

    public class ClassWithFields {
        private String name;
        private int age;

        public ClassWithFields(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public class ClassWithMethods {
        public void doSomething() {
            System.out.println("Doing something");
        }
    }

    public class ClassWithFieldsAndMethods {
        private String message;

        public ClassWithFieldsAndMethods(String message) {
            this.message = message;
        }

        public void printMessage() {
            System.out.println(message);
        }
    }
}
