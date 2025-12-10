public class StaticImportCountCheck {

    // Noncompliant - Too many static imports
    import static java.lang.Math.*;
    import static java.util.Arrays.*;
    import static java.util.Collections.*;
    import static java.util.List.*;
    public void testNoncompliant1() {
        double result = sqrt(25);
        List<String> list = asList("a", "b", "c");
    }

    // Noncompliant - Too many static imports
    import static com.google.common.collect.Lists.*;
    import static org.apache.commons.lang3.StringUtils.*;
    import static java.lang.System.*;
    import static java.util.Objects.*;
    public void testNoncompliant2() {
        List<Integer> numbers = newArrayList(1, 2, 3);
        String message = "Hello";
        if (isNull(message)) {
            out.println("Message is null");
        }
    }

    // Compliant - Reasonable number of static imports
    import static java.lang.Math.PI;
    public void testCompliant1() {
        double circumference = 2 * PI * 5;
    }

    // Compliant - Few static imports
    import static java.util.Objects.requireNonNull;
    public void testCompliant2(String input) {
        requireNonNull(input, "Input cannot be null");
    }
}
