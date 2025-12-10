package com.example;

import java.lang.annotation.*;

public class ReflectionOnNonRuntimeAnnotationCheck {

    @Retention(RetentionPolicy.SOURCE)
    public @interface MySourceOnlyAnnotation {
        String value();
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface MyRuntimeAnnotation {
        String value();
    }

    public void nonCompliantExample1() {
        Class<?> clazz = this.getClass();
        MySourceOnlyAnnotation annotation = clazz.getAnnotation(MySourceOnlyAnnotation.class); // Noncompliant
        if (annotation != null) {
            System.out.println(annotation.value());
        }
    }

    public void nonCompliantExample2() {
        try {
            Class<?> clazz = Class.forName("com.example.ReflectionOnNonRuntimeAnnotationCheck");
            MySourceOnlyAnnotation annotation = (MySourceOnlyAnnotation) clazz.getAnnotation(MySourceOnlyAnnotation.class); // Noncompliant
            if (annotation != null) {
                System.out.println(annotation.value());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void compliantExample1() {
        Class<?> clazz = this.getClass();
        MyRuntimeAnnotation annotation = clazz.getAnnotation(MyRuntimeAnnotation.class);
        if (annotation != null) {
            System.out.println(annotation.value());
        }
    }

    public void compliantExample2() {
        try {
            Class<?> clazz = Class.forName("com.example.ReflectionOnNonRuntimeAnnotationCheck");
            MyRuntimeAnnotation annotation = (MyRuntimeAnnotation) clazz.getAnnotation(MyRuntimeAnnotation.class);
            if (annotation != null) {
                System.out.println(annotation.value());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReflectionOnNonRuntimeAnnotationCheck test = new ReflectionOnNonRuntimeAnnotationCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2();
        test.compliantExample1();
        test.compliantExample2();
    }
}
