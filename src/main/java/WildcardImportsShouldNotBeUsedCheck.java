public class WildcardImportsShouldNotBeUsedCheck {

    // Noncompliant
    import java.util.*;

    public void nonCompliantExample1() {
        List<String> list = new ArrayList<>();
        list.add("test");
    }

    // Noncompliant
    import org.apache.commons.lang3.*;

    public void nonCompliantExample2() {
        StringUtils.isEmpty(null);
    }

    public void compliantExample1() {
        import java.util.List;
        import java.util.ArrayList;

        List<String> list = new ArrayList<>();
        list.add("test");
    }

    public void compliantExample2() {
        import org.apache.commons.lang3.StringUtils;

        StringUtils.isEmpty(null);
    }

    public void compliantExample3() {
        java.util.List<String> list = new java.util.ArrayList<>();
        list.add("test");
    }

    public void compliantExample4() {
        org.apache.commons.lang3.StringUtils.isEmpty(null);
    }
}
