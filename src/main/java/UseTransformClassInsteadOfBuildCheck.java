public class UseTransformClassInsteadOfBuildCheck {

    // Noncompliant - Using BuildCheck directly
    public void nonCompliantExample1() {
        org.gradle.api.tasks.BuildCheckTask buildCheckTask = new org.gradle.api.tasks.BuildCheckTask();
        buildCheckTask.dependsOn("compileJava");
        buildCheckTask.execute();
    }

    // Noncompliant - Another direct use of BuildCheck
    public void nonCompliantExample2() {
        org.gradle.api.tasks.BuildCheckTask task = new org.gradle.api.tasks.BuildCheckTask();
        task.setGroup("verification");
        task.dependsOn("test"); // Noncompliant
        task.finalizedBy("report");
    }

    // Compliant - Using TransformAction instead
    public void compliantExample1() {
        org.gradle.api.tasks.TransformAction transformAction = (t) -> {
            // Perform transformation logic here
        };
        transformAction.dependsOn("compileJava");
        transformAction.execute();
    }

    // Compliant - Using TransformTask instead
    public void compliantExample2() {
        org.gradle.api.tasks.TransformTask transformTask = new org.gradle.api.tasks.TransformTask() {
            @Override
            public void execute() {
                // Transformation logic
            }
        };
        transformTask.dependsOn("test");
        transformTask.finalizedBy("report");
    }
}
