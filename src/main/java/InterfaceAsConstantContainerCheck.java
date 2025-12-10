public class InterfaceAsConstantContainerCheck {

    // Noncompliant
    public interface NoncompliantInterface {
        String MY_CONSTANT = "some value";
        int ANOTHER_CONSTANT = 123;
    }

    // Noncompliant
    interface AnotherNoncompliantInterface {
        final double PI = 3.14159;
        static final String DEFAULT_NAME = "default";
    }

    // Compliant
    public interface CompliantInterface {
        String getValue();
    }

    // Compliant
    interface AnotherCompliantInterface {
        void processData(int data);
    }

    public static void main(String[] args) {
        // This main method is just for compilation purposes.
        // The rule is checked statically by SonarQube.
        NoncompliantInterface nc = new NoncompliantInterface() {};
        System.out.println(nc.MY_CONSTANT);
        AnotherNoncompliantInterface anc = new AnotherNoncompliantInterface() {};
        System.out.println(anc.PI);

        CompliantInterface ci = () -> "some value";
        System.out.println(ci.getValue());

        AnotherCompliantInterface aci = data -> System.out.println(data);
        aci.processData(10);
    }
}
