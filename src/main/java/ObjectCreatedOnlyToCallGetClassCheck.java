public class ObjectCreatedOnlyToCallGetClassCheck {

    // Noncompliant - Object created solely to call getClass()
    public void nonCompliantExample1() {
        Object obj = new Object(); // Noncompliant
        Class<?> clazz = obj.getClass();
        System.out.println(clazz.getName());
    }

    // Noncompliant - Object created solely to call getClass() within a method
    public String nonCompliantExample2() {
        String str = new String("test"); // Noncompliant
        return str.getClass().getName();
    }

    // Compliant - Object is used for more than just getClass()
    public void compliantExample1() {
        Object obj = new Object();
        obj.hashCode(); // Object is used for something other than getClass()
        Class<?> clazz = obj.getClass();
        System.out.println(clazz.getName());
    }

    // Compliant - Object is a field and used elsewhere
    private Object myObject;

    public void compliantExample2() {
        myObject = new Object();
        myObject.hashCode(); // Object is used for something other than getClass()
        Class<?> clazz = myObject.getClass();
        System.out.println(clazz.getName());
    }
}
