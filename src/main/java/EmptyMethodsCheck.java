public class EmptyMethodsCheck {

    // Noncompliant
    public void emptyMethod1() {
    }

    // Noncompliant
    public void emptyMethod2() {
        // This method does nothing
    }

    public int add(int a, int b) {
        return a + b;
    }

    public String greet(String name) {
        return "Hello, " + name + "!";
    }

    public void processData(int[] data) {
        if (data != null && data.length > 0) {
            for (int value : data) {
                System.out.println(value);
            }
        }
    }
}
