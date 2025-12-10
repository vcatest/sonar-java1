package com.example;

public class TestsInSeparateFolderCheck {

    public class ProductionClass {
        public int add(int a, int b) {
            return a + b;
        }
    }

    // Noncompliant
    public class ProductionClassTest {
        public void testAdd() {
            ProductionClass productionClass = new ProductionClass();
            int result = productionClass.add(2, 3);
            assert(result == 5);
        }
    }

    public class AnotherProductionClass {
        public String greet(String name) {
            return "Hello, " + name + "!";
        }
    }

    // Noncompliant
    public class AnotherProductionClassTest {
        public void testGreet() {
            AnotherProductionClass anotherProductionClass = new AnotherProductionClass();
            String greeting = anotherProductionClass.greet("World");
            assert(greeting.equals("Hello, World!"));
        }
    }

    // Compliant - Tests are in a separate folder (e.g., src/test/java)
    // This code would reside in a separate test folder, not alongside the production code.
    public static class TestClassInSeparateFolder {
        public void someTest() {
            // This is a placeholder for a test method.
        }
    }

    // Compliant - Tests are in a separate folder (e.g., src/test/java)
    // This code would reside in a separate test folder, not alongside the production code.
    public static class AnotherTestClassInSeparateFolder {
        public void anotherTest() {
            // This is a placeholder for another test method.
        }
    }
}
