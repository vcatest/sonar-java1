public class ParameterReassignedToCheck {

    public void example1(int value) {
        value = 10; // Noncompliant
        if (value > 5) {
            System.out.println("Value is greater than 5");
        }
    }

    public void example2(String text) {
        text = "new text"; // Noncompliant
        System.out.println(text.length());
    }

    public void example3(int value) {
        int newValue = 10;
        if (value > 5) {
            newValue = 20;
        }
        System.out.println(newValue);
    }

    public void example4(String text) {
        String newText = "initial text";
        newText = "updated text";
        System.out.println(newText.length());
    }

    public void example5(int value) {
        int temp = value;
        temp = 10;
        if (temp > 5) {
            System.out.println("Value is greater than 5");
        }
    }

    public void example6(String text) {
        String temp = text;
        temp = "new text";
        System.out.println(temp.length());
    }
}
