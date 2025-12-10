public class ClassFieldCountCheck {

    // Noncompliant - Too many fields in a class
    private String field1;
    private String field2;
    private String field3;
    private String field4;
    private String field5;
    private String field6;
    private String field7;
    private String field8;
    private String field9;
    private String field10;
    private String field11;
    private String field12;
    private String field13;
    private String field14;
    private String field15;

    public void method1() {
        // Some code
    }

    // Noncompliant - Too many fields in a class
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;

    public void method2() {
        // Some code
    }

    // Compliant - Reasonable number of fields
    private String name;
    private int age;
    private boolean isActive;

    public void method3() {
        // Some code
    }

    // Compliant - Few fields, well within limits
    private double salary;
    private String department;

    public void method4() {
        // Some code
    }
}
