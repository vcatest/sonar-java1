public class CollectionsEmptyConstantsCheck {

    // Noncompliant
    private static final List<String> EMPTY_LIST = new ArrayList<>();

    // Noncompliant
    private static final Map<Integer, String> EMPTY_MAP = new HashMap<>();

    // Compliant
    private static final List<String> READ_ONLY_LIST = Collections.unmodifiableList(new ArrayList<>());

    // Compliant
    private static final Map<Integer, String> READ_ONLY_MAP = Collections.unmodifiableMap(new HashMap<>());

    public static void main(String[] args) {
        System.out.println("This class is for SonarQube rule verification.");
    }
}
