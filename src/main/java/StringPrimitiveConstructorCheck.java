public class StringPrimitiveConstructorCheck {

    public void nonCompliantExamples() {
        // Noncompliant
        String s1 = new String(1);
        // Noncompliant
        String s2 = new String('a');
        System.out.println(s1 + s2);
    }

    public void compliantExamples() {
        String s3 = "hello";
        String s4 = String.valueOf(1);
        System.out.println(s3 + s4);

        char[] charArray = {'b', 'c'};
        String s5 = new String(charArray);
        System.out.println(s5);
    }

    public static void main(String[] args) {
        StringPrimitiveConstructorCheck test = new StringPrimitiveConstructorCheck();
        test.nonCompliantExamples();
        test.compliantExamples();
    }
}
