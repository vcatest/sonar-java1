public class StringBufferAndBuilderConcatenationCheck {

    public void nonCompliantExample1() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Hello" + "World"); // Noncompliant
        System.out.println(stringBuffer.toString());
    }

    public void nonCompliantExample2() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("This is " + "a test"); // Noncompliant
        System.out.println(stringBuilder.toString());
    }

    public void compliantExample1() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Hello").append("World");
        System.out.println(stringBuffer.toString());
    }

    public void compliantExample2() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("This is ").append("a test");
        System.out.println(stringBuilder.toString());
    }

    public void mixedExample() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Part 1");
        stringBuffer.append("Part 2");
        stringBuffer.append("Part 3" + "Part 4"); // Noncompliant
        System.out.println(stringBuffer.toString());

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("First");
        stringBuilder.append("Second");
        stringBuilder.append("Third").append("Fourth");
        System.out.println(stringBuilder.toString());
    }
}
