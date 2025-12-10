public class SyncGetterAndSetterCheck {

    private String name;
    private int age;

    // Noncompliant - Getter and setter are not synchronized on the same lock
    public synchronized String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; // Noncompliant
    }

    // Noncompliant - Different lock objects used for getter and setter
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public String getAgeString() {
        synchronized (lock1) {
            return String.valueOf(age);
        }
    }

    public void setAgeString(String ageString) {
        synchronized (lock2) {
            this.age = Integer.parseInt(ageString); // Noncompliant
        }
    }

    // Compliant - Getter and setter synchronized on the same lock
    private final Object lock3 = new Object();
    private String city;

    public synchronized String getCity() {
        synchronized (lock3) {
            return city;
        }
    }

    public synchronized void setCity(String city) {
        synchronized (lock3) {
            this.city = city;
        }
    }

    // Compliant - No synchronization needed if the field is final
    private final String country = "USA";

    public String getCountry() {
        return country;
    }
}
