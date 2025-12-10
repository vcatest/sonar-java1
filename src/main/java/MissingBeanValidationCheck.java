public class MissingBeanValidationCheck {

    // Noncompliant - Missing @Valid annotation on method parameter
    public void processUser(User user) {
        System.out.println("Processing user: " + user.getName());
    }

    // Noncompliant - Missing @Valid annotation on method parameter
    public void updateUser(Long id, User user) {
        System.out.println("Updating user with id: " + id);
    }

    // Compliant - @Valid annotation present on method parameter
    public void createUser(@Valid User user) {
        System.out.println("Creating user: " + user.getName());
    }

    // Compliant - @Valid annotation present on method parameter
    public void saveUser(@Valid User user, String additionalInfo) {
        System.out.println("Saving user: " + user.getName());
    }

    static class User {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
