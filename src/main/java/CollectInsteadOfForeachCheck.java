import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;

public class CollectInsteadOfForeachCheck {

    // Noncompliant - Using foreach to collect into a list
    public void nonCompliantExample1() {
        List<String> list = new ArrayList<>();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        for (Integer number : numbers) { // Noncompliant
            list.add(String.valueOf(number));
        }
        System.out.println(list);
    }

    // Noncompliant - Another example of foreach used for collection
    public void nonCompliantExample2() {
        Set<String> resultSet = new HashSet<>();
        String[] strings = {"a", "b", "c"};
        for (String str : strings) { // Noncompliant
            resultSet.add(str.toUpperCase());
        }
        System.out.println(resultSet);
    }

    // Compliant - Using stream().collect() to gather elements
    public void compliantExample1() {
        List<String> list = Arrays.asList(1, 2, 3, 4, 5)
                .stream()
                .map(String::valueOf)
                .collect(Collectors.toList());
        System.out.println(list);
    }

    // Compliant - Using stream().collect() with a different collector
    public void compliantExample2() {
        Set<String> resultSet = Arrays.asList("a", "b", "c")
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
        System.out.println(resultSet);
    }
}
