package com.example;

import java.io.Serializable;

public class TransientFieldInNonSerializableCheck {

    // Noncompliant
    private transient int transientField1;

    private int regularField1;

    // Noncompliant
    private transient String transientField2;

    private String regularField2;

    public int getTransientField1() {
        return transientField1;
    }

    public void setTransientField1(int transientField1) {
        this.transientField1 = transientField1;
    }

    public String getTransientField2() {
        return transientField2;
    }

    public void setTransientField2(String transientField2) {
        this.transientField2 = transientField2;
    }

    public int getRegularField1() {
        return regularField1;
    }

    public void setRegularField1(int regularField1) {
        this.regularField1 = regularField1;
    }

    public String getRegularField2() {
        return regularField2;
    }

    public void setRegularField2(String regularField2) {
        this.regularField2 = regularField2;
    }

    public static class SerializableClass implements Serializable {
        private int field1;
        private transient int transientField3; //This is allowed because the class is Serializable
        private String field2;

        public int getField1() {
            return field1;
        }

        public void setField1(int field1) {
            this.field1 = field1;
        }

        public String getField2() {
            return field2;
        }

        public void setField2(String field2) {
            this.field2 = field2;
        }
    }

    public static class CompliantClass {
        private int field1;
        private String field2;

        public int getField1() {
            return field1;
        }

        public void setField1(int field1) {
            this.field1 = field1;
        }

        public String getField2() {
            return field2;
        }

        public void setField2(String field2) {
            this.field2 = field2;
        }
    }
}
