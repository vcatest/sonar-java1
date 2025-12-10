public class SimpleClassNameCheck {

    // Noncompliant - Class name starts with a lowercase letter
    public class myClass {
        public void someMethod() {
            System.out.println("This is a noncompliant class.");
        }
    }

    // Noncompliant - Class name is a single letter
    public class a {
        public void anotherMethod() {
            System.out.println("This is also a noncompliant class.");
        }
    }

    // Compliant - Class name starts with an uppercase letter
    public class ValidClass {
        public void yetAnotherMethod() {
            System.out.println("This is a compliant class.");
        }
    }

    // Compliant - Class name is descriptive and starts with an uppercase letter
    public class UserProfileManager {
        public void doSomething() {
            System.out.println("This is another compliant class.");
        }
    }
}
