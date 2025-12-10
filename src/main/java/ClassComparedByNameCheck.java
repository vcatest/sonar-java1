import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class ClassComparedByNameCheck {

    // Noncompliant
    public void nonCompliantExample1() {
        if ("java.lang.String".equals(this.getClass().getName())) {
            System.out.println("String class");
        }
    }

    // Noncompliant
    public void nonCompliantExample2() {
        if (this.getClass().getName().equals("java.util.ArrayList")) {
            System.out.println("ArrayList class");
        }
    }

    // Compliant
    public void compliantExample1() {
        if (this.getClass() == String.class) {
            System.out.println("String class");
        }
    }

    // Compliant
    public void compliantExample2() {
        if (ArrayList.class.isAssignableFrom(this.getClass())) {
            System.out.println("ArrayList or subclass");
        }
    }

    public static void main(String[] args) {
        ClassComparedByNameCheck test = new ClassComparedByNameCheck();
        test.nonCompliantExample1();
        test.nonCompliantExample2();
        test.compliantExample1();
        test.compliantExample2();
    }
}
