public class ArrayDesignatorAfterTypeCheck {

    public void nonCompliantExample1() {
        String[] myArray = new String[10]; // Noncompliant
        int length = myArray.length;
    }

    public void nonCompliantExample2() {
        Integer[] numbers = new Integer[5]; // Noncompliant
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
    }

    public void compliantExample1() {
        int length = new int[5].length;
        int[] myArray = new int[length];
    }

    public void compliantExample2() {
        double[] values = new double[3];
        for (int i = 0; i < values.length; i++) {
            values[i] = i * 1.0;
        }
    }

    public void compliantExample3() {
        String[] names = new String[2];
        int size = names.length;
    }
}
