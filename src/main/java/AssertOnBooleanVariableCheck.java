public class AssertOnBooleanVariableCheck {

    public void nonCompliantExample1(boolean flag) {
        if (flag) {
            // Noncompliant
            System.out.println("Flag is true");
        }
    }

    public void nonCompliantExample2(boolean isValid) {
        if (isValid) {
            // Noncompliant
            String message = "Valid input";
            System.out.println(message);
        }
    }

    public void compliantExample1(boolean isEnabled) {
        if (isEnabled) {
            assertTrue("isEnabled should be true", isEnabled);
            System.out.println("Feature is enabled");
        }
    }

    public void compliantExample2(boolean hasPermission) {
        if (hasPermission) {
            assertTrue("User should have permission", hasPermission);
            // Perform action requiring permission
            System.out.println("User has permission");
        }
    }

    private void assertTrue(String message, boolean condition) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }
}
