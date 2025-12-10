public class CatchNPECheck {

    public void nonCompliantExample1() {
        String str = null;
        try {
            System.out.println(str.length()); // Noncompliant
        } catch (NullPointerException e) {
            // Handle the exception
        }
    }

    public void nonCompliantExample2() {
        String str = null;
        try {
            char c = str.charAt(0); // Noncompliant
        } catch (NullPointerException e) {
            // Handle the exception
        }
    }

    public void compliantExample1() {
        String str = null;
        if (str != null) {
            System.out.println(str.length());
        } else {
            // Handle null case
        }
    }

    public void compliantExample2() {
        String str = null;
        try {
            if (str != null) {
                System.out.println(str.length());
            }
        } catch (NullPointerException e) {
            //Should not reach here
        }
    }

    public void compliantExample3() {
        String str = "test";
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            //Should not reach here
        }
    }
}
