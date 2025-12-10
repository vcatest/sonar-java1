// Noncompliant - Too many static imports
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.util.Objects.*;
import static com.google.common.collect.Lists.newArrayList;
import static java.lang.System.out;

import java.util.List;

public class StaticImportCountCheck {
    public void testNoncompliant1() {
        double result = sqrt(25);
        List<String> list = asList("a", "b", "c");
    }

    // Noncompliant - Too many static imports (example)
    public void testNoncompliant2() {
        List<Integer> numbers = newArrayList(1, 2, 3);
        String message = "Hello";
        if (isNull(message)) {
            out.println("Message is null");
        }
    }

    // Compliant - Reasonable number of static imports
    public void testCompliant1() {
        double circumference = 2 * PI * 5;
    }

    // Compliant - Few static imports
    public void testCompliant2(String input) {
        requireNonNull(input, "Input cannot be null");
    }
}
