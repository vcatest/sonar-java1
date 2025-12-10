public class InappropriateRegexpCheck {

    public void nonCompliantExample1() {
        String input = "test";
        if (input.matches(".*[<>].*")) { // Noncompliant
            System.out.println("Input contains < or >");
        }
    }

    public void nonCompliantExample2() {
        String data = "sensitive data";
        if (data.matches(".*password.*|.*secret.*")) { // Noncompliant
            System.out.println("Potential sensitive data detected");
        }
    }

    public void compliantExample1() {
        String input = "test";
        if (input.contains("<") || input.contains(">")) {
            System.out.println("Input contains < or >");
        }
    }

    public void compliantExample2() {
        String data = "sensitive data";
        if (data.toLowerCase().contains("password") || data.toLowerCase().contains("secret")) {
            System.out.println("Potential sensitive data detected");
        }
    }

    public static void main(String[] args) {
        InappropriateRegexpCheck test = new InappropriateRegexpCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2();
        test.compliantExample1();
        test.compliantExample2();
    }
}
