public class ProtectedMemberInFinalClassCheck {

    // Noncompliant
    final class FinalClassWithProtected {
        protected int protectedMember;

        public void someMethod() {
            protectedMember = 10;
        }
    }

    // Noncompliant
    final class AnotherFinalClass {
        protected String protectedString;

        public AnotherFinalClass(String initialValue) {
            this.protectedString = initialValue;
        }
    }

    // Compliant
    final class FinalClassWithPrivate {
        private int privateMember;

        public void someMethod() {
            privateMember = 20;
        }
    }

    // Compliant
    final class FinalClassWithPublic {
        public String publicString;

        public FinalClassWithPublic(String initialValue) {
            this.publicString = initialValue;
        }
    }

    public static void main(String[] args) {
        FinalClassWithProtected obj1 = new FinalClassWithProtected();
        AnotherFinalClass obj2 = new AnotherFinalClass("test");
        FinalClassWithPrivate obj3 = new FinalClassWithPrivate();
        FinalClassWithPublic obj4 = new FinalClassWithPublic("publicTest");
    }
}
