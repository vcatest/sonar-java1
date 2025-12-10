public class DiamondOperatorCheck {

    public static void main(String[] args) {

        // Noncompliant
        List<String> list1 = new ArrayList<>();
        // Noncompliant
        Map<String, Integer> map1 = new HashMap<>();

        // Compliant
        List<String> list2 = new ArrayList<String>();
        // Compliant
        Map<String, Integer> map2 = new HashMap<String, Integer>();

        // Noncompliant
        Set<Integer> set1 = new HashSet<>();
        // Noncompliant
        Queue<String> queue1 = new LinkedList<>();

        // Compliant
        Set<Integer> set2 = new HashSet<Integer>();
        // Compliant
        Queue<String> queue2 = new LinkedList<String>();
    }
}

import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
