public class IncrementDecrementInSubExpressionCheck {

    public void nonCompliantExample1() {
        int x = 0;
        int y = (x++ + 5); // Noncompliant
        System.out.println(y);
    }

    public void nonCompliantExample2() {
        int a = 10;
        int b = (a-- * 2); // Noncompliant
        System.out.println(b);
    }

    public void nonCompliantExample3() {
        int i = 0;
        int j = (i++) - 1; // Noncompliant
        System.out.println(j);
    }

    public void compliantExample1() {
        int x = 0;
        x++;
        int y = x + 5;
        System.out.println(y);
    }

    public void compliantExample2() {
        int a = 10;
        a--;
        int b = a * 2;
        System.out.println(b);
    }

    public void compliantExample3() {
        int i = 0;
        i++;
        int j = i - 1;
        System.out.println(j);
    }

    public void compliantExample4() {
        int k = 5;
        int l = k + 1;
        k++;
        System.out.println(l);
    }
}
