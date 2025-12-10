package com.example;

public class CommentsMustStartWithCorrectNumberOfSlashesCheck {

    public void testComments() {
        // Noncompliant - Single slash comment
        System.out.println("This is a single slash comment");

        /*
         * Noncompliant - Incorrect start for multiline comment
         */
        System.out.println("This is an incorrectly formatted multiline comment");

        // Compliant - Double slash comment
        System.out.println("This is a double slash comment");

        /* Compliant - Correctly formatted multiline comment */
        System.out.println("This is a correctly formatted multiline comment");

        //Compliant - Double slash comment before a method
        myMethod();

        /* Compliant - Correctly formatted multiline comment before a method */
        anotherMethod();
    }

    private void myMethod() {
        System.out.println("My method");
    }

    private void anotherMethod() {
        System.out.println("Another method");
    }
}
