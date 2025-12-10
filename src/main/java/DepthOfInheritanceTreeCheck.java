public class DepthOfInheritanceTreeCheck {

    // Noncompliant - Deep inheritance tree
    public class A {}
    public class B extends A {}
    public class C extends B {}
    public class D extends C {}
    public class E extends D {} // Noncompliant
    public class F extends E {} // Noncompliant

    // Noncompliant - Another deep inheritance tree
    public class X {}
    public class Y extends X {}
    public class Z extends Y {}
    public class P extends Z {}
    public class Q extends P {} // Noncompliant
    public class R extends Q {} // Noncompliant

    // Compliant - Shallow inheritance tree
    public class Alpha {}
    public class Beta extends Alpha {}

    // Compliant - No inheritance
    public class Gamma {}
}
