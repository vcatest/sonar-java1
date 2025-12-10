package com.example;

import java.io.Serializable;

public class ValueBasedObjectsShouldNotBeSerializedCheck {

    // Noncompliant - Value object implementing Serializable
    public static class NonCompliantValueObject1 implements Serializable {
        private final int x;
        private final String y;

        public NonCompliantValueObject1(int x, String y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public String getY() {
            return y;
        }
    }

    // Noncompliant - Value object implementing Serializable
    public static class NonCompliantValueObject2 implements Serializable {
        private final double value;

        public NonCompliantValueObject2(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }
    }

    // Compliant - Value object NOT implementing Serializable
    public static class CompliantValueObject1 {
        private final int a;
        private final String b;

        public CompliantValueObject1(int a, String b) {
            this.a = a;
            this.b = b;
        }

        public int getA() {
            return a;
        }

        public String getB() {
            return b;
        }
    }

    // Compliant - Value object NOT implementing Serializable
    public static class CompliantValueObject2 {
        private final boolean flag;

        public CompliantValueObject2(boolean flag) {
            this.flag = flag;
        }

        public boolean isFlag() {
            return flag;
        }
    }

    public static void main(String[] args) {
        // Example usage - not relevant for the rule check
    }
}
