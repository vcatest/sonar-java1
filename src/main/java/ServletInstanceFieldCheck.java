public class ServletInstanceFieldCheck {

    // Noncompliant - Instance field of type HttpServlet
    javax.servlet.http.HttpServlet myServlet;

    // Noncompliant - Instance field of type HttpServletRequest
    javax.servlet.http.HttpServletRequest request;

    public void nonCompliantMethod() {
        myServlet.service(null, null);
        request.getParameter("test");
    }

    // Compliant - Local variable of type HttpServlet
    public void compliantMethod1() {
        javax.servlet.http.HttpServlet servlet = null;
        servlet.service(null, null);
    }

    // Compliant - Method parameter of type HttpServletRequest
    public void compliantMethod2(javax.servlet.http.HttpServletRequest req) {
        req.getParameter("test");
    }

    // Compliant - Static field of type HttpServlet
    static javax.servlet.http.HttpServlet staticServlet;

    // Compliant - Final instance field of type HttpServlet
    private final javax.servlet.http.HttpServlet finalServlet;

    public ServletInstanceFieldCheck(javax.servlet.http.HttpServlet servlet) {
        this.finalServlet = servlet;
    }
}
