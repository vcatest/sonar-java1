package com.example;

import java.math.BigDecimal;

public class BigDecimalDoubleConstructorCheck {

    public void nonCompliantExample1() {
        BigDecimal bd = new BigDecimal(1.23); // Noncompliant
        System.out.println(bd);
    }

    public void nonCompliantExample2() {
        double value = 3.14;
        BigDecimal bd = new BigDecimal(value); // Noncompliant
        System.out.println(bd);
    }

    public void compliantExample1() {
        BigDecimal bd = new BigDecimal("1.23");
        System.out.println(bd);
    }

    public void compliantExample2() {
        String value = "3.14";
        BigDecimal bd = new BigDecimal(value);
        System.out.println(bd);
    }

    public void compliantExample3() {
        BigDecimal bd = BigDecimal.valueOf(1.23);
        System.out.println(bd);
    }
}
