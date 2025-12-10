import java.util.ArrayList;
import java.util.List;

public class SuppressWarningsCheck {

    public void nonCompliantExample1() {
        @SuppressWarnings("unchecked") // Noncompliant
        List<String> list = new ArrayList();
        list.add(1); // This will cause a warning, but is suppressed.
    }

    public void nonCompliantExample2() {
        @SuppressWarnings("rawtypes") // Noncompliant
        ArrayList list = new ArrayList();
        list.add("test");
    }

    public void compliantExample1() {
        List<String> list = new ArrayList<>();
        list.add("test");
    }

    public void compliantExample2() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
    }

    public static void main(String[] args) {
        SuppressWarningsCheck test = new SuppressWarningsCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2();
        test.compliantExample1();
        test.compliantExample2();
    }
}
