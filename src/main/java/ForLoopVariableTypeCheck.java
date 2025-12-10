public class ForLoopVariableTypeCheck {

    public void nonCompliantExample1() {
        for (int i = 0; i < 10; i++) {
            String message = "Iteration: " + i; // Noncompliant
            System.out.println(message);
        }
    }

    public void nonCompliantExample2() {
        for (int j = 0; j < 5; j++) {
            double result = j * 2.5; // Noncompliant
            System.out.println("Result: " + result);
        }
    }

    public void compliantExample1() {
        for (int k = 0; k < 3; k++) {
            int square = k * k;
            System.out.println("Square: " + square);
        }
    }

    public void compliantExample2() {
        for (long l = 0; l < 100; l++) {
            long cube = l * l * l;
            System.out.println("Cube: " + cube);
        }
    }
}
