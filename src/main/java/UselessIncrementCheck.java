public class UselessIncrementCheck {

    public void nonCompliantExample1() {
        int i = 0;
        i++; // Noncompliant
        i++; // Noncompliant
        System.out.println(i);
    }

    public void nonCompliantExample2() {
        int x = 5;
        x++; // Noncompliant
        int y = x + 1;
        System.out.println(y);
    }

    public void compliantExample1() {
        int j = 0;
        j = j + 2;
        System.out.println(j);
    }

    public void compliantExample2() {
        int k = 10;
        k += 5;
        System.out.println(k);
    }

    public void compliantExample3() {
        int z = 0;
        z++;
        System.out.println(z);
        //Use the incremented value
        int result = z * 2;
        System.out.println(result);
    }
}
