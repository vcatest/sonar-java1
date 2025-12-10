public class MissingOverridesInRecordWithArrayComponentCheck {

    // Noncompliant - Missing overrides in a record with an array component
    record MyRecord(int[] data) {
    }

    public void testNoncompliant1() {
        MyRecord record = new MyRecord(new int[]{1, 2, 3});
    }

    // Noncompliant - Missing overrides in a record with an array component
    record AnotherRecord(String[] names, int id) {
    }

    public void testNoncompliant2() {
        AnotherRecord record = new AnotherRecord(new String[]{"Alice", "Bob"}, 123);
    }

    // Compliant - Record with no array component
    record SimpleRecord(int value, String name) {
    }

    public void testCompliant1() {
        SimpleRecord record = new SimpleRecord(10, "Test");
    }

    // Compliant - Record with an array component and explicit overrides
    record RecordWithOverrides(int[] data) {
        public RecordWithOverrides {
            //Explicit constructor to handle array initialization
        }
    }

    public void testCompliant2() {
        RecordWithOverrides record = new RecordWithOverrides(new int[]{4, 5, 6});
    }
}
