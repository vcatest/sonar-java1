public class CORSCheck {

    // Noncompliant - Using "*" for allowed origins is a security risk.
    public void example1() {
        // This allows requests from any origin, which is insecure.
        // In a real application, you should specify the exact origins.
        System.out.println("Example 1 - Noncompliant");
    }

    // Noncompliant - Allowing all methods and headers is also a security risk.
    public void example2() {
        // This configuration allows all HTTP methods and headers, which is insecure.
        // You should restrict these to only the necessary ones.
        System.out.println("Example 2 - Noncompliant");
    }

    // Compliant - Specifying exact allowed origins.
    public void example3() {
        // This allows requests only from https://example.com and https://anotherdomain.com.
        // This is a secure configuration.
        System.out.println("Example 3 - Compliant");
    }

    // Compliant - Restricting allowed methods and headers.
    public void example4() {
        // This allows only GET and POST methods and specific headers.
        // This is a secure configuration.
        System.out.println("Example 4 - Compliant");
    }
}
