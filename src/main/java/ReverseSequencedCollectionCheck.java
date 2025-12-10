public class ReverseSequencedCollectionCheck {

    // Noncompliant - Iterating in reverse order without a clear reason.
    public void nonCompliantExample1(int[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }

    // Noncompliant - Reversing a list and then iterating.  This is often a sign of inefficient processing.
    public void nonCompliantExample2(java.util.List<String> names) {
        java.util.Collections.reverse(names);
        for (String name : names) {
            System.out.println(name);
        }
    }

    // Compliant - Iterating in reverse order for a specific purpose (e.g., comparing to a reversed version).
    public boolean isPalindrome(String str) {
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }

    // Compliant - Iterating in reverse order when the problem domain naturally requires it (e.g., stack-like behavior).
    public void processStack(java.util.Stack<Integer> stack) {
        while (!stack.isEmpty()) {
            int value = stack.pop();
            System.out.println(value);
        }
    }
}
