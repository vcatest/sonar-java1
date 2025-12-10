public class UseOfSequentialForSequentialGathererCheck {

    // Noncompliant - Using sequential for loop where a parallel stream would be more appropriate
    public void nonCompliantExample1() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> squaredNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) { // Noncompliant
            squaredNumbers.add(numbers.get(i) * numbers.get(i));
        }
    }

    // Noncompliant - Another example of sequential for loop when parallel stream is better
    public void nonCompliantExample2() {
        List<String> strings = Arrays.asList("a", "b", "c", "d", "e");
        List<String> upperCaseStrings = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) { // Noncompliant
            upperCaseStrings.add(strings.get(i).toUpperCase());
        }
    }

    // Compliant - Using parallel stream for squaring numbers
    public void compliantExample1() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> squaredNumbers = numbers.parallelStream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    // Compliant - Using parallel stream for converting strings to uppercase
    public void compliantExample2() {
        List<String> strings = Arrays.asList("a", "b", "c", "d", "e");
        List<String> upperCaseStrings = strings.parallelStream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
