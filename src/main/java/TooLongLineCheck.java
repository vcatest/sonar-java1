public class TooLongLineCheck {

    public void nonCompliantExample1() {
        String veryLongString = "This is a very long string that exceeds the maximum allowed line length, and it is intended to trigger the SonarQube rule for too long lines. It's quite lengthy, isn't it?"; // Noncompliant
    }

    public void nonCompliantExample2() {
        int x = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12 + 13 + 14 + 15 + 16 + 17 + 18 + 19 + 20; // Noncompliant
    }

    public void compliantExample1() {
        String shortString = "This is a short string.";
    }

    public void compliantExample2() {
        int y = 1 + 2 + 3 + 4;
    }

    public void compliantExample3() {
        String longString = "This is a long string, but it's broken into multiple lines to comply with the rule.\n" +
                            "This ensures that each line is within the acceptable length.";
    }
}
