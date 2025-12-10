public class ClassNameInClassTransformCheck {

    // Noncompliant
    public class MyClassTransform extends MyClass {
        public void doSomething() {
            System.out.println("Doing something");
        }
    }

    // Noncompliant
    public class AnotherClassTransform extends BaseClass {
        public void processData() {
            System.out.println("Processing data");
        }
    }

    public class ValidClass extends ParentClass {
        public void execute() {
            System.out.println("Executing");
        }
    }

    public class CorrectlyNamedClass extends SuperClass {
        public void run() {
            System.out.println("Running");
        }
    }

    public class ParentClass {}
    public class SuperClass {}
    public class MyClass {}
    public class BaseClass {}
}
