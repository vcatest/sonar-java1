public class PreferStreamAnyMatchCheck {

    // Noncompliant
    public boolean checkListContainsElement_Noncompliant(List<String> list, String element) {
        for (String s : list) {
            if (s.equals(element)) {
                return true;
            }
        }
        return false;
    }

    // Noncompliant
    public boolean checkListContainsElement_Noncompliant2(List<Integer> list, int element) {
        boolean found = false;
        for (Integer i : list) {
            if (i == element) {
                found = true;
                break;
            }
        }
        return found;
    }

    // Compliant
    public boolean checkListContainsElement_Compliant(List<String> list, String element) {
        return list.stream().anyMatch(s -> s.equals(element));
    }

    // Compliant
    public boolean checkListContainsElement_Compliant2(List<Integer> list, int element) {
        return list.stream().anyMatch(i -> i == element);
    }

    public static void main(String[] args) {
        PreferStreamAnyMatchCheck check = new PreferStreamAnyMatchCheck();
        List<String> stringList = Arrays.asList("apple", "banana", "cherry");
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("Noncompliant 1: " + check.checkListContainsElement_Noncompliant(stringList, "banana"));
        System.out.println("Noncompliant 2: " + check.checkListContainsElement_Noncompliant2(intList, 3));
        System.out.println("Compliant 1: " + check.checkListContainsElement_Compliant(stringList, "cherry"));
        System.out.println("Compliant 2: " + check.checkListContainsElement_Compliant2(intList, 1));
    }
}

import java.util.List;
import java.util.Arrays;
