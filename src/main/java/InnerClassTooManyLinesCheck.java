public class InnerClassTooManyLinesCheck {

    // Noncompliant Example 1 - Inner class exceeding line limit
    public class LongInnerClass {
        private int a;
        private String b;

        public LongInnerClass(int a, String b) {
            this.a = a;
            this.b = b;
        }

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public String getB() {
            return b;
        }

        public void setB(String b) {
            this.b = b;
        }

        public void method1() {
            System.out.println("Method 1");
        }

        public void method2() {
            System.out.println("Method 2");
        }

        public void method3() {
            System.out.println("Method 3");
        }

        public void method4() {
            System.out.println("Method 4");
        }

        public void method5() {
            System.out.println("Method 5");
        }

        public void method6() {
            System.out.println("Method 6");
        }

        public void method7() {
            System.out.println("Method 7");
        }

        public void method8() {
            System.out.println("Method 8");
        }

        public void method9() {
            System.out.println("Method 9");
        }

        public void method10() {
            System.out.println("Method 10");
        }

        public void method11() {
            System.out.println("Method 11");
        }
        // Noncompliant
    }

    // Noncompliant Example 2 - Another long inner class
    public class AnotherLongInnerClass {
        private double x;
        private boolean y;

        public AnotherLongInnerClass(double x, boolean y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public boolean isY() {
            return y;
        }

        public void setY(boolean y) {
            this.y = y;
        }

        public void doSomething() {
            System.out.println("Doing something...");
        }

        public void processData(int[] data) {
            for (int value : data) {
                System.out.println("Processing: " + value);
            }
        }

        public String formatString(String input) {
            return input.toUpperCase();
        }

        public void calculateSum(int a, int b) {
            int sum = a + b;
            System.out.println("Sum: " + sum);
        }

        public void printMessage(String message) {
            System.out.println("Message: " + message);
        }

        public void validateInput(String input) {
            if (input == null || input.isEmpty()) {
                System.out.println("Invalid input!");
            }
        }

        public void performOperation(int value) {
            System.out.println("Performing operation on: " + value);
        }
        // Noncompliant
    }

    // Compliant Example 1 - Short inner class
    public class ShortInnerClass {
        private int value;

        public ShortInnerClass(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    // Compliant Example 2 - Another short inner class
    public class AnotherShortInnerClass {
        private String name;

        public AnotherShortInnerClass(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
