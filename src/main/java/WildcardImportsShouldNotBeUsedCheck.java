// Noncompliant - wildcard import example
import java.util.*;

public class WildcardImportsShouldNotBeUsedCheck {

    public void nonCompliantExample1() {
        List<String> list = new ArrayList<>();
        list.add("test");
    }

    // Noncompliant - another wildcard import example

    public void nonCompliantExample2() {
        // StringUtils.isEmpty(null); // Commented out - library not available
        String test = null;
        if (test == null || test.isEmpty()) {
            System.out.println("Empty");
        }
    }

    public void compliantExample1() {
        java.util.List<String> list = new java.util.ArrayList<>();
        list.add("test");
    }

    public void compliantExample2() {
        // Compliant - using fully qualified name
        org.apache.commons.lang3.StringUtils.isEmpty(null);
    }

    public void compliantExample3() {
        java.util.List<String> list = new java.util.ArrayList<>();
        list.add("test");
    }

    public void compliantExample4() {
        org.apache.commons.lang3.StringUtils.isEmpty(null);
    }
}
