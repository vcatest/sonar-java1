public class MembersDifferOnlyByCapitalizationCheck {

    // Noncompliant
    private String myVariable;
    private String MyVariable;

    public void testNoncompliant() {
        myVariable = "test";
        MyVariable = "Test";
    }

    // Noncompliant
    public class InnerClass {
        private int memberOne;
        private int MemberOne;
    }

    // Compliant
    private String anotherVariable;
    private int yetAnotherVariable;

    public void testCompliant() {
        anotherVariable = "test";
        yetAnotherVariable = 10;
    }

    // Compliant
    public class AnotherInnerClass {
        private double value1;
        private boolean flag;
    }
}
