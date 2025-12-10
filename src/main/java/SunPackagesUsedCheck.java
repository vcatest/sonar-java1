package com.example;

public class SunPackagesUsedCheck {

    public void nonCompliantExample1() {
        // Noncompliant
        java.util.Date date = new java.util.Date();
        System.out.println(date);
    }

    public void nonCompliantExample2() {
        // Noncompliant
        java.lang.System.out.println("Hello");
    }

    public void compliantExample1() {
        java.time.LocalDate today = java.time.LocalDate.now();
        System.out.println(today);
    }

    public void compliantExample2() {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        list.add("Test");
        System.out.println(list);
    }

    public void compliantExample3() {
        java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
        map.put("one", 1);
        System.out.println(map);
    }
}
