public class PublicStaticFieldShouldBeFinalCheck {

    // Noncompliant
    public static int nonFinalPublicStaticInt;

    // Noncompliant
    public static String nonFinalPublicStaticString;

    // Compliant
    public static final int finalPublicStaticInt = 10;

    // Compliant
    public static final String finalPublicStaticString = "Hello";

    public static void main(String[] args) {
        nonFinalPublicStaticInt = 5;
        nonFinalPublicStaticString = "World";
        System.out.println(nonFinalPublicStaticInt);
        System.out.println(nonFinalPublicStaticString);
        System.out.println(finalPublicStaticInt);
        System.out.println(finalPublicStaticString);
    }
}
