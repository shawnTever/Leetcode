package xingye;

import java.util.*;

public class xingye2 {
    public static int cntPalindromicSubstrings (String s) {
        if (s == null || s.length() == 0)
            return 0;
        char[] arr = s.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        Set<ArrayList<Character>> results = new HashSet<>();
        ArrayList<Character> subResult = new ArrayList<>();
        for (Character c : arr)
            list.add(c);
        dfs(list, results, 0, subResult);
        for (ArrayList<Character> l : results) {
            System.out.println(l.toString());
            System.out.println(isRetrieve(l));
        }
        return 1;

    }

    private static void dfs (ArrayList<Character> sub, Set<ArrayList<Character>> results,
                             int index, ArrayList<Character> subResult) {
        if (sub.size() == 0)
            results.add(subResult);
        else {
            for (int i = 0; i < sub.size(); i++) {
                ArrayList<Character> r = new ArrayList<>(subResult);
                r.add(sub.get(i));
                ArrayList<Character> s = new ArrayList<>(sub);
                s.remove(i);
                results.add(r);
                dfs(s, results, index + 1, r);
            }
        }
    }

    public static boolean isRetrieve(ArrayList<Character> l) {
        return recursive(l, 0, l.size() - 1);
    }

    private static boolean recursive(ArrayList<Character> l, int left, int right) {
        if (l.get(left).equals(l.get(right))) {
            if (left + 1 < right - 1)
                recursive(l, left + 1, right - 1);
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        String s = "abba";
//        int i = cntPalindromicSubstrings (s);
//        System.out.println(i);

        ArrayList<Character> l = new ArrayList<>();
        for (Character c : s.toCharArray())
            l.add(c);
        System.out.println(isRetrieve(l));
    }

}
