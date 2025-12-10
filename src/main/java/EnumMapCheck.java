public class EnumMapCheck {

    // Noncompliant - Using EnumMap with a non-enum key type
    public void nonCompliantExample1() {
        java.util.Map<String, Integer> map = new java.util.EnumMap<>(java.util.EnumSet.allOf(java.util.EnumSet.class)); // Noncompliant
        map.put("one", 1);
    }

    // Noncompliant - Using EnumMap with a non-enum key type
    public void nonCompliantExample2() {
        java.util.Map<Integer, String> map = new java.util.EnumMap<>(java.util.EnumSet.allOf(java.util.EnumSet.class)); // Noncompliant
        map.put(1, "one");
    }

    // Compliant - Using EnumMap with an enum key type
    public void compliantExample1() {
        enum MyEnum { A, B, C }
        java.util.Map<MyEnum, Integer> map = new java.util.EnumMap<>(MyEnum.class);
        map.put(MyEnum.A, 1);
    }

    // Compliant - Using EnumMap with an enum key type
    public void compliantExample2() {
        enum MyEnum { A, B, C }
        java.util.Map<MyEnum, String> map = new java.util.EnumMap<>(MyEnum.class);
        map.put(MyEnum.B, "two");
    }
}
