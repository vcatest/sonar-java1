package com.sonarqube.check;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArraysAsListOfPrimitiveToStreamCheck {

    public void nonCompliantExample1(int[] numbers) {
        List<Integer> list = Arrays.asList(numbers); // Noncompliant
        list.stream().forEach(System.out::println);
    }

    public void nonCompliantExample2(double[] values) {
        List<Double> list = Arrays.asList(values); // Noncompliant
        list.stream().map(x -> x * 2).forEach(System.out::println);
    }

    public void compliantExample1(int[] numbers) {
        IntStream stream = Arrays.stream(numbers);
        stream.forEach(System.out::println);
    }

    public void compliantExample2(double[] values) {
        java.util.stream.DoubleStream stream = Arrays.stream(values);
        List<Double> list = stream.boxed().collect(Collectors.toList());
        list.stream().map(x -> x * 2).forEach(System.out::println);
    }

    public void compliantExample3(int[] numbers) {
        IntStream stream = Arrays.stream(numbers);
        stream.filter(n -> n > 5).forEach(System.out::println);
    }
}
