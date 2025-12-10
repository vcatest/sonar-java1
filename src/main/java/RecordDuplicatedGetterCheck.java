public class RecordDuplicatedGetterCheck {

    // Noncompliant - Duplicated getter with same logic
    private String name;

    public String getName() {
        return name;
    }

    public String getFullName() {
        return name; // Noncompliant
    }

    // Noncompliant - Duplicated getter with slight modification (still considered duplication)
    private int age;

    public int getAge() {
        return age;
    }

    public int getPersonAge() {
        return age + 0; // Noncompliant - adding 0 doesn't change the logic
    }

    // Compliant - Unique getters with different logic
    private String city;

    public String getCity() {
        return city;
    }

    public String getCityUpperCase() {
        return city.toUpperCase();
    }

    // Compliant - Getter and a method that uses the getter's value
    private boolean isActive;

    public boolean isActive() {
        return isActive;
    }

    public String getStatus() {
        return isActive ? "Active" : "Inactive";
    }
}
