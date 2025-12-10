public class RightCurlyBraceSameLineAsNextBlockCheck {

    public void nonCompliantExample1() {
        if (true)
        { // Noncompliant
            System.out.println("This is non-compliant.");
        }
    }

    public void nonCompliantExample2() {
        try {
            System.out.println("Trying...");
        }
        catch (Exception e) { // Noncompliant
            e.printStackTrace();
        }
    }

    public void compliantExample1() {
        if (true) {
            System.out.println("This is compliant.");
        }
    }

    public void compliantExample2() {
        try {
            System.out.println("Trying...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void compliantExample3() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public void nonCompliantExample3() {
        while (true)
        { // Noncompliant
            System.out.println("Looping...");
        }
    }
}
