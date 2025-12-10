public class UseIsEmptyToTestEmptinessOfStringBuilderCheck {

    public void nonCompliantExample1() {
        StringBuilder sb = new StringBuilder();
        if (sb.length() == 0) { // Noncompliant
            System.out.println("StringBuilder is empty");
        }
    }

    public void nonCompliantExample2() {
        StringBuilder sb = new StringBuilder("test");
        if (sb.toString().isEmpty()) { // Noncompliant - toString() is unnecessary and inefficient
            System.out.println("StringBuilder is empty");
        }
    }

    public void compliantExample1() {
        StringBuilder sb = new StringBuilder();
        if (sb.isEmpty()) {
            System.out.println("StringBuilder is empty");
        }
    }

    public void compliantExample2() {
        StringBuilder sb = new StringBuilder("test");
        if (!sb.isEmpty()) {
            System.out.println("StringBuilder is not empty");
        } else {
            System.out.println("StringBuilder is empty");
        }
    }
}
