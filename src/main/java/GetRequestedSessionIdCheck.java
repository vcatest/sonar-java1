public class GetRequestedSessionIdCheck {

    // Noncompliant
    public String getSessionIdNoncompliant1(javax.servlet.http.HttpServletRequest request) {
        return request.getRequestedSessionId();
    }

    // Noncompliant
    public void processRequestNoncompliant2(javax.servlet.http.HttpServletRequest request) {
        String sessionId = request.getRequestedSessionId();
        System.out.println("Session ID: " + sessionId);
    }

    // Compliant
    public String getSessionIdCompliant1(javax.servlet.http.HttpServletRequest request) {
        return request.getSession().getId();
    }

    // Compliant
    public void processRequestCompliant2(javax.servlet.http.HttpServletRequest request) {
        javax.servlet.http.HttpSession session = request.getSession();
        String sessionId = session.getId();
        System.out.println("Session ID: " + sessionId);
    }

    // Compliant - using a try-catch block to handle potential exceptions
    public String getSessionIdCompliant3(javax.servlet.http.HttpServletRequest request) {
        try {
            javax.servlet.http.HttpSession session = request.getSession(false);
            if (session != null) {
                return session.getId();
            } else {
                return null; // Or handle the case where there's no session
            }
        } catch (IllegalStateException e) {
            // Handle the exception appropriately (e.g., log it)
            return null;
        }
    }

    // Noncompliant - direct call within a method
    public void someMethodNoncompliant4(javax.servlet.http.HttpServletRequest request) {
        String id = request.getRequestedSessionId(); // Noncompliant
        System.out.println(id);
    }
}
