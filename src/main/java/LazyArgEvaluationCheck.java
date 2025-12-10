public class LazyArgEvaluationCheck {

    // Noncompliant - Argument is only evaluated when used, potentially causing issues if the method throws an exception.
    public void noncompliantExample1(boolean condition, Runnable task) {
        if (condition) {
            task.run(); // Noncompliant
        }
    }

    // Noncompliant - Similar to example 1, the task is only run if the condition is true, leading to potential lazy evaluation issues.
    public void noncompliantExample2(int value, Runnable task) {
        if (value > 0) {
            task.run(); // Noncompliant
        }
    }

    // Compliant - The task is always evaluated before the if condition, ensuring consistent behavior.
    public void compliantExample1(boolean condition, Runnable task) {
        task.run();
        if (condition) {
            // Do something
        }
    }

    // Compliant - The task is evaluated before the if condition.
    public void compliantExample2(int value, Runnable task) {
        task.run();
        if (value > 0) {
            // Do something
        }
    }

    // Compliant - Task is executed regardless of the condition.
    public void compliantExample3(Runnable task, boolean condition) {
        task.run();
        if (condition) {
            System.out.println("Condition met");
        } else {
            System.out.println("Condition not met");
        }
    }

    // Noncompliant - The task is only executed if the condition is met.
    public void noncompliantExample3(Runnable task, boolean condition) {
        if (condition) {
            task.run(); // Noncompliant
        }
    }
}
