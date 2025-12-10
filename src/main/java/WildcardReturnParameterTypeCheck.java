public class WildcardReturnParameterTypeCheck {

    // Noncompliant - Using wildcard type for return value
    public List<?> getItemsNoncompliant() {
        return new ArrayList<>();
    }

    // Noncompliant - Using wildcard type for return value
    public Map<?, ?> getDataNoncompliant() {
        return new HashMap<>();
    }

    // Compliant - Using specific type for return value
    public List<String> getNamesCompliant() {
        return new ArrayList<>();
    }

    // Compliant - Using specific type for return value
    public Map<Integer, String> getIdNameMapCompliant() {
        return new HashMap<>();
    }

    // Compliant - Using specific type for return value
    public Integer[] getNumbersCompliant() {
        return new Integer[]{1, 2, 3};
    }

    // Noncompliant - Using wildcard type for return value
    public Iterable<?> getIterablesNoncompliant() {
        return new ArrayList<>();
    }
}
