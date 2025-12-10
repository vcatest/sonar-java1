public class UppercaseSuffixesCheck {

    public void nonCompliantExample1() {
        String myVariableIsABadName = "test"; // Noncompliant
    }

    public void nonCompliantExample2() {
        int someOtherBadVariableNAME = 10; // Noncompliant
    }

    public void compliantExample1() {
        String myVariableIsGood = "test";
    }

    public void compliantExample2() {
        int someOtherGoodVariable = 10;
    }

    public void compliantExample3() {
        String aVeryLongButAcceptableVariableName = "example";
    }

    public void compliantExample4() {
        int anotherAcceptableVariable = 20;
    }
}
