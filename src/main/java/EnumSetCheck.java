import java.util.EnumSet;

public class EnumSetCheck {

    // Noncompliant - Using EnumSet with a single element using of() method.
    public void nonCompliantExample1() {
        EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY);
    }

    // Noncompliant - Using EnumSet with a single element using of() method.
    public void nonCompliantExample2() {
        EnumSet<Color> primary = EnumSet.of(Color.RED);
    }

    // Compliant - Using EnumSet with multiple elements using of() method.
    public void compliantExample1() {
        EnumSet<Day> weekdays = EnumSet.of(Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY);
    }

    // Compliant - Using EnumSet with range() method.
    public void compliantExample2() {
        EnumSet<Planet> planets = EnumSet.range(Planet.MERCURY, Planet.SATURN);
    }

    // Compliant - Using EnumSet with complementOf() and of()
    public void compliantExample3() {
        EnumSet<Day> notWeekend = EnumSet.complementOf(EnumSet.of(Day.SATURDAY, Day.SUNDAY));
    }

    // Compliant - Using EnumSet with allOf()
    public void compliantExample4() {
        EnumSet<Day> allDays = EnumSet.allOf(Day.class);
    }

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    enum Color {
        RED, GREEN, BLUE
    }

    enum Planet {
        MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE
    }
}
