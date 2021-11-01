package duxiaoman;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class duxiaoman {
//    public static void main(String[] args) {
//        Scanner sc  = new Scanner(System.in);
//        String l1 = sc.nextLine();
//        String l2 = sc.nextLine();
//        int l1len = l1.length();
//        int l2len = l2.length();
//
//        if (l2len == 0 || l1len > l2len) System.out.println(0 + " " + l2len);
//        else {
//            Map<Character, Integer> map1 = new HashMap<>();
//            Map<Character, Integer> map2 = new HashMap<>();
//
//            int min = l2len;
//            for (int i = 0; i < l2.length(); i++) {
//                if (i < l1.length()) {
//                    char c1 = l1.charAt(i);
//                    char c2 = l2.charAt(i);
//                    if (map1.containsKey(c1)) map1.put(c1, map1.get(c1) + 1);
//                    else map1.put(c1, 1);
//                    if (map2.containsKey(c2)) map2.put(c2, map2.get(c2) + 1);
//                    else map2.put(c2, 1);
//                } else {
//                    char c2 = l2.charAt(i);
//                    if (map2.containsKey(c2)) map2.put(c2, map2.get(c2) + 1);
//                    else map2.put(c2, 1);
//                }
//            }
//
//            for (char c : map1.keySet()) {
//                min = Math.min(min, map2.get(c) / map1.get(c));
//            }
//
//            int len = l2.length() - min * l1.length();
//            System.out.println(min + " " + len);
//
//        }
//
//
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] l1 = sc.nextLine().split(" ");
        int n = Integer.parseInt(l1[0]);
        int m = Integer.parseInt(l1[1]);
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
//        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();

        for (int i = 0; i < n + m; i++) {
            ArrayList<Integer> time = new ArrayList<>();
            String l2 = sc.nextLine();
            int start = Integer.parseInt(l2.substring(0, 2) + l2.substring(3, 5));
            int end = Integer.parseInt(l2.substring(6, 8) + l2.substring(9, 11));
            time.add(start);
            time.add(end);
            list1.add(time);
        }
//        for (int i = 0; i < m; i++) {
//            ArrayList<Integer> time = new ArrayList<>();
//            String l2 = sc.nextLine();
//            int start = Integer.parseInt(l2.substring(0, 2) + l2.substring(3, 5));
//            int end = Integer.parseInt(l2.substring(6, 8) + l2.substring(9, 11));
//            time.add(start);
//            time.add(end);
//            list2.add(time);
//        }

        System.out.println(Math.max(n, m));

    }

    private void re(ArrayList<ArrayList<Integer>> sub, ArrayList<Integer> element, ArrayList<ArrayList<Integer>> result) {
        for (int i = 0; i < sub.size(); i++) {
            ArrayList<ArrayList<Integer>> s = sub;

            s.remove(s.get(i));
            ArrayList<Integer> ele = element;
            ele.add(s.get(i).get(0));
            ele.add(s.get(i).get(1));

        }
    }

}
