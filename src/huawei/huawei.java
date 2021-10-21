package huawei;

import java.util.*;

public class huawei {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int m = Integer.parseInt(sc.nextLine());
//        String[] ms = sc.nextLine().split(" ");
//        int[] mi = new int[ms.length];
//        int n = Integer.parseInt(sc.nextLine());
//        String[] ns = sc.nextLine().split(" ");
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < m; i++) {
//            mi[i] = Integer.parseInt(ms[i]);
//            map.put(mi[i], i);
//        }
//        Arrays.sort(mi);
//        Map<Integer, Integer> score = new HashMap<>();
//        for (int i = 0; i < mi.length; i++)
//            score.put(map.get(mi[i]), mi.length - i);
//
//        int bit = 0;
//
//        for (int i = 0; i < n; i++) {
//            int ni = Integer.parseInt(ns[i]);
//            if (ni >= n) {
//                bit = -1;
//                break;
//            }
//            bit += score.get(ni);
//        }
//
//        System.out.println(bit);
//    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        String[] l = sc.nextLine().split(" ");
//
//        int sum = 0;
//        if (n == 1) System.out.println(-1);
//        else {
//            for (int i = 0; i < n; i++) {
//                sum += Integer.parseInt(l[i]);
//                if (sum % 2 == 1) System.out.println(-1);
//                else {
//
//                }
//            }
//        }
//
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line1 = sc.nextLine().split(" ");
        String[] line2 = sc.nextLine().split(" ");
        int x = Integer.parseInt(line1[0]);
        int n = Integer.parseInt(line1[1]);

        ArrayList<Integer> list = new ArrayList<>();
        for (String s : line2) {
            int money = Integer.parseInt(s);
            list.add(money);
        }
        Map<ArrayList<Integer>, Integer> result = new HashMap<>();
        ArrayList<Integer> element = new ArrayList<>();
        dfs(list, result, element);
        int min = 10000;
        for (ArrayList<Integer> a : result.keySet()) {
            System.out.println(a.toString());
            int i = result.get(a) - x;
            if (i > 0)
                min = Math.min(min, i);
        }
//        System.out.println(min + x);
    }

    public static void dfs(ArrayList<Integer> sub, Map<ArrayList<Integer>, Integer> result, ArrayList<Integer> element) {
        if (sub.isEmpty())
            return;
        for (int i = 0; i < sub.size(); i++) {
            ArrayList<Integer> ele = new ArrayList<>(element);
            ele.add(sub.get(i));
            ArrayList<Integer> s = new ArrayList<>();
            for (int j = i + 1; j < sub.size(); j++)
                s.add(sub.get(j));
            int sum = 0;
            for (int m : ele) sum += m;
            result.put(ele, sum);
            dfs(s, result, ele);
        }
    }
}
