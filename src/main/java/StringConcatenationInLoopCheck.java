public class StringConcatenationInLoopCheck {

    public void nonCompliantExample1() {
        String result = "";
        for (int i = 0; i < 10; i++) {
            result += "Iteration " + i; // Noncompliant
        }
        System.out.println(result);
    }

    public void nonCompliantExample2() {
        StringBuilder sb = new StringBuilder();
        String prefix = "Value: ";
        for (int j = 0; j < 5; j++) {
            sb.append(prefix).append(j); // Noncompliant
        }
        System.out.println(sb.toString());
    }

    public void compliantExample1() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            result.append("Iteration ").append(i);
        }
        System.out.println(result.toString());
    }

    public void compliantExample2() {
        String[] values = new String[5];
        for (int j = 0; j < 5; j++) {
            values[j] = "Value: " + j;
        }
        for (String value : values) {
            System.out.println(value);
        }
    }
}
