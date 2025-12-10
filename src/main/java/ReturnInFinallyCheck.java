public class ReturnInFinallyCheck {

    // Noncompliant Example 1
    public int testNoncompliant1() {
        try {
            return 1;
        } finally {
            return 2; // Noncompliant
        }
    }

    // Noncompliant Example 2
    public String testNoncompliant2() {
        try {
            return "Hello";
        } finally {
            return "World"; // Noncompliant
        }
    }

    // Compliant Example 1
    public int testCompliant1() {
        int result = 0;
        try {
            result = 1;
        } finally {
            // No return statement here
        }
        return result;
    }

    // Compliant Example 2
    public String testCompliant2() {
        String result = "";
        try {
            result = "Hello";
        } finally {
            // No return statement here
        }
        return result;
    }

    // Compliant Example 3 - finally block does not contain a return
    public int testCompliant3() {
        try {
            System.out.println("Try block");
        } finally {
            System.out.println("Finally block");
        }
        return 0;
    }

    // Noncompliant Example 3 - return in finally after try block also returns
    public int testNoncompliant3() {
        try {
            return 5;
        } finally {
            System.out.println("Finally block");
            return 10; // Noncompliant
        }
    }
}
