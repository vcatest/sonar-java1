public class WeakSSLContextCheck {

    // Noncompliant
    public static void nonCompliantExample1() throws Exception {
        SSLContext context = SSLContext.getInstance("SSL"); // Using SSL without specifying TLS
        // Noncompliant
        context.init(null, null, null);
    }

    // Noncompliant
    public static void nonCompliantExample2() throws Exception {
        SSLContext context = SSLContext.getInstance("TLSv1"); // Using TLSv1 which is considered weak
        // Noncompliant
        context.init(null, null, null);
    }

    // Compliant
    public static void compliantExample1() throws Exception {
        SSLContext context = SSLContext.getInstance("TLSv1.2");
        context.init(null, null, null);
    }

    // Compliant
    public static void compliantExample2() throws Exception {
        SSLContext context = SSLContext.getInstance("TLSv1.3");
        context.init(null, null, null);
    }

    public static void main(String[] args) throws Exception {
        nonCompliantExample1();
        nonCompliantExample2();
        compliantExample1();
        compliantExample2();
    }
}
