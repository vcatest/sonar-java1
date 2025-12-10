public class TypeUpperBoundNotFinalCheck {

    // Noncompliant
    public <T extends java.util.List> void method1(T list) {
        // This method uses a raw type as an upper bound.
        list.add("test");
    }

    // Noncompliant
    public <T extends java.util.Collection> void method2(T collection) {
        // Using Collection as an upper bound is not final.
        collection.iterator();
    }

    // Compliant
    public <T extends java.util.ArrayList> void method3(T list) {
        list.add("test");
    }

    // Compliant
    public <T extends String> void method4(T text) {
        System.out.println(text.length());
    }

    // Compliant
    public <T extends Integer> void method5(T number) {
        System.out.println(number.intValue());
    }

    // Noncompliant
    public <T extends java.util.Map> void method6(T map) {
        map.put("key", "value");
    }

    // Compliant
    public <T extends java.util.HashMap> void method7(T map) {
        map.put("key", "value");
    }
}
