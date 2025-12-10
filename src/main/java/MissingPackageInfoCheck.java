public class MissingPackageInfoCheck {

    // Noncompliant
    public class NonCompliantClass1 {
        public void someMethod() {
            System.out.println("This class is missing a package-info.java");
        }
    }

    // Noncompliant
    public class NonCompliantClass2 {
        private int value;

        public int getValue() {
            return value;
        }
    }

    // Compliant
    package com.example;

    public class CompliantClass1 {
        public void someMethod() {
            System.out.println("This class has a package-info.java");
        }
    }

    // Compliant
    package com.test;

    public class CompliantClass2 {
        private String name;

        public String getName() {
            return name;
        }
    }
}
