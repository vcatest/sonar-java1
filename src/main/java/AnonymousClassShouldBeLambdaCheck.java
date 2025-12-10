package com.sonarqube.rules;

public class AnonymousClassShouldBeLambdaCheck {

    public void nonCompliantExample1() {
        Runnable runnable = new Runnable() { // Noncompliant
            @Override
            public void run() {
                System.out.println("Running from anonymous class 1");
            }
        };
        runnable.run();
    }

    public void nonCompliantExample2() {
        Thread thread = new Thread(new Runnable() { // Noncompliant
            @Override
            public void run() {
                System.out.println("Running from anonymous class 2");
            }
        });
        thread.start();
    }

    public void compliantExample1() {
        Runnable runnable = () -> {
            System.out.println("Running from lambda 1");
        };
        runnable.run();
    }

    public void compliantExample2() {
        Thread thread = new Thread(() -> {
            System.out.println("Running from lambda 2");
        });
        thread.start();
    }

    public static void main(String[] args) {
        AnonymousClassShouldBeLambdaCheck test = new AnonymousClassShouldBeLambdaCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2();
        test.compliantExample1();
        test.compliantExample2();
    }
}
