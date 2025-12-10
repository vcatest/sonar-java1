public class RandomFloatToIntCheck {

    public void nonCompliantExample1() {
        float randomFloat = (float) Math.random();
        int myInt = (int) randomFloat; // Noncompliant
        System.out.println(myInt);
    }

    public void nonCompliantExample2() {
        double randomNumber = Math.random();
        int truncatedValue = (int) randomNumber; // Noncompliant
        System.out.println(truncatedValue);
    }

    public void compliantExample1() {
        float randomFloat = (float) Math.random();
        int myInt = Math.round(randomFloat);
        System.out.println(myInt);
    }

    public void compliantExample2() {
        double randomNumber = Math.random();
        int roundedValue = (int) Math.round(randomNumber);
        System.out.println(roundedValue);
    }

    public static void main(String[] args) {
        RandomFloatToIntCheck test = new RandomFloatToIntCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2();
        test.compliantExample1();
        test.compliantExample2();
    }
}
