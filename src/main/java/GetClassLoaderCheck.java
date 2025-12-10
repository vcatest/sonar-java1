public class GetClassLoaderCheck {

    // Noncompliant
    public static void nonCompliantExample1() {
        Thread.currentThread().getContextClassLoader();
    }

    // Noncompliant
    public static void nonCompliantExample2() {
        ClassLoader classLoader = GetClassLoaderCheck.class.getClassLoader();
        System.out.println(classLoader);
    }

    // Compliant
    public static void compliantExample1() {
        try {
            Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            // Handle exception
        }
    }

    // Compliant
    public static void compliantExample2() {
        String className = "java.lang.Integer";
        try {
            Class<?> clazz = Class.forName(className);
            System.out.println(clazz.getName());
        } catch (ClassNotFoundException e) {
            // Handle exception
        }
    }

    public static void main(String[] args) {
        nonCompliantExample1();
        nonCompliantExample2();
        compliantExample1();
        compliantExample2();
    }
}
