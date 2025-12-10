public class RedundantNullabilityAnnotationsCheck {

    // Noncompliant
    public @Nullable String getNullableString() {
        return null;
    }

    // Noncompliant
    public @javax.annotation.Nullable String getAnotherNullableString() {
        return "test";
    }

    // Compliant
    public String getString() {
        return "test";
    }

    // Compliant
    public String maybeGetString() {
        return null;
    }

    public @Nullable Integer getNullableInteger() {
        return null;
    }

    public @javax.annotation.Nullable Integer getAnotherNullableInteger() {
        return 1;
    }

    public Integer getInteger() {
        return 1;
    }

    public Integer maybeGetInteger() {
        return null;
    }
}
