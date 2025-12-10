package com.example;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReplaceGuavaWithJavaCheck {

    // Noncompliant
    public List<String> nonCompliantExample1() {
        List<String> list = Lists.newArrayList("a", "b", "c");
        return list;
    }

    // Noncompliant
    public void nonCompliantExample2() {
        List<Integer> numbers = Lists.partition(Arrays.asList(1, 2, 3, 4, 5), 2);
        System.out.println(numbers);
    }

    public List<String> compliantExample1() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        return list;
    }

    public List<List<Integer>> compliantExample2() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        return numbers.stream()
                .collect(Collectors.groupingBy(x -> x % 2 == 0 ? 0 : 1))
                .values()
                .stream()
                .map(ArrayList::new)
                .collect(Collectors.toList());
    }
}
