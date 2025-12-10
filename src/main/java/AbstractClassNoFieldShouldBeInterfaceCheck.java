package com.example;

public class AbstractClassNoFieldShouldBeInterfaceCheck {

    // Noncompliant
    public abstract class AbstractClassWithInterfaceField {
        public Runnable myRunnable;
    }

    // Noncompliant
    public abstract class AnotherAbstractClassWithInterfaceField {
        private Comparable<String> myComparable;
    }

    public abstract class AbstractClassWithPrimitiveField {
        public int myInt;
    }

    public abstract class AbstractClassWithObjectField {
        public String myString;
    }

    public abstract class AbstractClassWithArrayField {
        public int[] myArray;
    }

    public abstract class AbstractClassWithValidField {
        private int myPrimitive;
    }

    public abstract class AnotherAbstractClassWithValidField {
        protected String myString;
    }
}
