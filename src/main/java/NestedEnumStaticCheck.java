public class NestedEnumStaticCheck {

    // Noncompliant - Nested enum within a class
    public class OuterClass {
        public enum InnerEnum {
            VALUE1, VALUE2
        }
    }

    // Noncompliant - Nested enum within another enum
    public enum OuterEnum {
        VALUE_A,
        VALUE_B {
            public enum InnerEnum {
                VALUE_X, VALUE_Y
            }
        };
    }

    // Compliant - Enum declared at the class level
    public enum SimpleEnum {
        VALUE1, VALUE2
    }

    // Compliant - Enum declared as a static inner class
    public static class StaticInnerClass {
        public enum InnerEnum {
            VALUE1, VALUE2
        }
    }
}
