public class EqualsParametersMarkedNonNullCheck {

    // Noncompliant - Missing @NonNull annotation on parameter 'o'
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null) return false;
        return true;
    }

    // Compliant - @NonNull annotation present on parameter 'other'
    public boolean equalsCompliant(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        return true;
    }

    // Compliant - @NonNull annotation present on parameter 'o'
    public boolean equalsCompliant2(java.lang.Object o) {
        if (this == o) return true;
        if (o == null) return false;
        return true;
    }
}
