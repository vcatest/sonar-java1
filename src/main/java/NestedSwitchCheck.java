public class NestedSwitchCheck {

    // Noncompliant example 1
    public void example1(int a, int b) {
        switch (a) {
            case 1:
                switch (b) { // Noncompliant
                    case 1:
                        System.out.println("Case 1.1");
                        break;
                    case 2:
                        System.out.println("Case 1.2");
                        break;
                }
                break;
            case 2:
                System.out.println("Case 2");
                break;
        }
    }

    // Noncompliant example 2
    public void example2(String s) {
        switch (s) {
            case "one":
                switch (s.length()) { // Noncompliant
                    case 3:
                        System.out.println("Length is 3");
                        break;
                    case 5:
                        System.out.println("Length is 5");
                        break;
                }
                break;
            case "two":
                System.out.println("String is two");
                break;
        }
    }

    // Compliant example 1
    public void example3(int a, int b) {
        if (a == 1) {
            if (b == 1) {
                System.out.println("Case 1.1");
            } else if (b == 2) {
                System.out.println("Case 1.2");
            }
        } else if (a == 2) {
            System.out.println("Case 2");
        }
    }

    // Compliant example 2
    public void example4(String s) {
        if (s.equals("one")) {
            if (s.length() == 3) {
                System.out.println("Length is 3");
            } else if (s.length() == 5) {
                System.out.println("Length is 5");
            }
        } else if (s.equals("two")) {
            System.out.println("String is two");
        }
    }
}
