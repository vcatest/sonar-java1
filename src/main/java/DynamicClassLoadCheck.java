public class DynamicClassLoadCheck {

    // Noncompliant - Using Class.forName() to load a class dynamically.
    public void nonCompliantExample1() {
        try {
            Class<?> clazz = Class.forName("java.lang.String");
            Object instance = clazz.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    // Noncompliant - Using ClassLoader.loadClass() to load a class dynamically.
    public void nonCompliantExample2() {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        try {
            Class<?> clazz = classLoader.loadClass("java.util.ArrayList");
            Object instance = clazz.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    // Compliant - Directly referencing a class.
    public void compliantExample1() {
        String str = "Hello"; // Compliant
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>(); // Compliant
    }

    // Compliant - Using reflection to access class members, but not dynamically loading the class itself.
    public void compliantExample2() {
        try {
            Class<?> clazz = String.class;
            java.lang.reflect.Method method = clazz.getMethod("length");
            Object result = method.invoke("SonarQube");
            System.out.println(result);
        } catch (NoSuchMethodException | IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
