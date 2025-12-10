public class RecordInsteadOfClassCheck {

    // Noncompliant - Using a class where a record would be more appropriate
    public class Address {
        private String street;
        private String city;
        private String zipCode;

        public Address(String street, String city, String zipCode) {
            this.street = street;
            this.city = city;
            this.zipCode = zipCode;
        }

        public String getStreet() {
            return street;
        }

        public String getCity() {
            return city;
        }

        public String getZipCode() {
            return zipCode;
        }
    }

    // Noncompliant - Another example of a class used as a simple data holder
    public class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    // Compliant - Using a record for a simple data holder
    public record Coordinates(int x, int y) {}

    // Compliant - Using a record for a simple data holder with a method
    public record User(String name, int age) {
        public String getFullName() {
            return name + " (" + age + ")";
        }
    }
}
