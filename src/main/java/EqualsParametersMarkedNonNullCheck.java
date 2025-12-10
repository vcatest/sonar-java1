public class EqualsParametersMarkedNonNullCheck {

    // Noncompliant - Missing @NonNull annotation on parameter 'other'
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        return true;
    }

    // Noncompliant - Missing @NonNull annotation on parameter 'o'
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null) return false;
        return true;
    }

    // Compliant - @NonNull annotation present on parameter 'other'
    import org.jetbrains.annotations.NotNull;
    public boolean equals(@NotNull Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        return true;
    }

    // Compliant - @NonNull annotation present on parameter 'o'
    import org.jetbrains.annotations.NotNull;
    @Override
    public boolean equals(@NotNull java.lang.Object o) {
        if (this == o) return true;
        if (o == null) return false;
        return true;
    }
}
