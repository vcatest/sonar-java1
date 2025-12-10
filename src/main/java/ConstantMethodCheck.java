public class ConstantMethodCheck {

    // Noncompliant
    public static final int ALWAYS_ONE = 1;
    public int getOne() {
        return ALWAYS_ONE; // Noncompliant
    }

    // Noncompliant
    private static final String MY_CONSTANT_STRING = "hello";
    public String getGreeting() {
        return MY_CONSTANT_STRING; // Noncompliant
    }

    // Compliant
    public int add(int a, int b) {
        return a + b;
    }

    // Compliant
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        ConstantMethodCheck check = new ConstantMethodCheck();
        System.out.println(check.getOne());
        System.out.println(check.getGreeting());
        System.out.println(check.add(5, 3));
        System.out.println(check.concatenate("world", "!"));
    }
}
