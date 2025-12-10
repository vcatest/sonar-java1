public class StringBufferAndBuilderWithCharCheck {

    public void nonCompliantExample1() {
        StringBuffer sb = new StringBuffer();
        sb.append('a'); // Noncompliant
        sb.append('b'); // Noncompliant
        sb.append('c'); // Noncompliant
        System.out.println(sb.toString());
    }

    public void nonCompliantExample2() {
        StringBuilder sb = new StringBuilder();
        sb.append('x'); // Noncompliant
        sb.append('y'); // Noncompliant
        sb.append('z'); // Noncompliant
        System.out.println(sb.toString());
    }

    public void compliantExample1() {
        StringBuffer sb = new StringBuffer();
        sb.append("a");
        sb.append("b");
        sb.append("c");
        System.out.println(sb.toString());
    }

    public void compliantExample2() {
        StringBuilder sb = new StringBuilder();
        sb.append("x");
        sb.append("y");
        sb.append("z");
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        StringBufferAndBuilderWithCharCheck test = new StringBufferAndBuilderWithCharCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2();
        test.compliantExample1();
        test.compliantExample2();
    }
}
