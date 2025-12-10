public class MismatchPackageDirectoryCheck {

    // Noncompliant - mismatched package
    public class OldClass {
        public void doSomething() {
            System.out.println("Old Class");
        }
    }

    // Noncompliant - another mismatched package
    public class AnotherOldClass {
        public void doSomethingElse() {
            System.out.println("Another Old Class");
        }
    }

    // Compliant - correct package
    public class NewClass {
        public void doSomething() {
            System.out.println("New Class");
        }
    }

    // Compliant - correct package
    public class AnotherNewClass {
        public void doSomethingElse() {
            System.out.println("Another New Class");
        }
    }
}
