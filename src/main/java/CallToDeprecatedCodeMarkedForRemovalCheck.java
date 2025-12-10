package com.example;

public class CallToDeprecatedCodeMarkedForRemovalCheck {

    public void nonCompliantExample1() {
        DeprecatedForRemovalClass.oldMethod(); // Noncompliant
    }

    public void nonCompliantExample2() {
        new DeprecatedForRemovalClass().anotherOldMethod(); // Noncompliant
    }

    public void compliantExample1() {
        NewClass.modernMethod();
    }

    public void compliantExample2() {
        ReplacementClass.replacementMethod();
    }

    public static void main(String[] args) {
        CallToDeprecatedCodeMarkedForRemovalCheck test = new CallToDeprecatedCodeMarkedForRemovalCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2();
        test.compliantExample1();
        test.compliantExample2();
    }
}

class DeprecatedForRemovalClass {
    @Deprecated(since = "1.0", forRemoval = true)
    public static void oldMethod() {
        System.out.println("Old method");
    }

    @Deprecated(since = "1.0", forRemoval = true)
    public void anotherOldMethod() {
        System.out.println("Another old method");
    }
}

class NewClass {
    public static void modernMethod() {
        System.out.println("Modern method");
    }
}

class ReplacementClass {
    public static void replacementMethod() {
        System.out.println("Replacement method");
    }
}
