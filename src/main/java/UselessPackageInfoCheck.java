package com.example;

public class UselessPackageInfoCheck {

    // Noncompliant - Package info file exists with no content.
    // This is a violation as it serves no purpose.
    // package-info.java:
    //
    public class NonCompliantExample1 {
        public void method1() {
            System.out.println("Example 1");
        }
    }

    // Noncompliant - Package info file exists with only comments.
    // This is a violation as it serves no purpose.
    // package-info.java:
    // /**
    //  * This is a comment.
    //  */
    public class NonCompliantExample2 {
        public void method2() {
            System.out.println("Example 2");
        }
    }

    // Compliant - No package-info.java file exists.
    public class CompliantExample1 {
        public void method3() {
            System.out.println("Example 3");
        }
    }

    // Compliant - Package info file exists with actual package declaration and javadoc.
    // package-info.java:
    // @Parameters(allNamed = {})
    // package com.example;
    //
    // import com.google.common.base.Preconditions;
    public class CompliantExample2 {
        public void method4() {
            System.out.println("Example 4");
        }
    }
}
