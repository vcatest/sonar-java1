public class MismatchPackageDirectoryCheck {

    // Noncompliant
    package com.example.oldpackage;
    public class OldClass {
        public void doSomething() {
            System.out.println("Old Class");
        }
    }

    // Noncompliant
    package com.example.differentpackage;
    public class AnotherOldClass {
        public void doSomethingElse() {
            System.out.println("Another Old Class");
        }
    }

    // Compliant
    package com.example.newpackage;
    public class NewClass {
        public void doSomething() {
            System.out.println("New Class");
        }
    }

    // Compliant
    package com.example.newpackage;
    public class AnotherNewClass {
        public void doSomethingElse() {
            System.out.println("Another New Class");
        }
    }
}
