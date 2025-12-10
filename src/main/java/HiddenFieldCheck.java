public class HiddenFieldCheck {

    private String hiddenField1; // Noncompliant
    private String hiddenField2; // Noncompliant

    public String getHiddenField1() {
        return hiddenField1;
    }

    public void setHiddenField1(String hiddenField1) {
        this.hiddenField1 = hiddenField1;
    }

    public String getHiddenField2() {
        return hiddenField2;
    }

    public void setHiddenField2(String hiddenField2) {
        this.hiddenField2 = hiddenField2;
    }

    public static void main(String[] args) {
        HiddenFieldCheck test = new HiddenFieldCheck();
        test.setHiddenField1("test");
        test.setHiddenField2("test2");
        System.out.println(test.getHiddenField1());
        System.out.println(test.getHiddenField2());
    }

    public String publicField;
    public int publicInt;

    public String getPublicField() {
        return publicField;
    }

    public void setPublicField(String publicField) {
        this.publicField = publicField;
    }

    public int getPublicInt() {
        return publicInt;
    }

    public void setPublicInt(int publicInt) {
        this.publicInt = publicInt;
    }
}
