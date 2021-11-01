package shopee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class shopee {
//    public boolean isStringBalance(String inputStr) {
//        // write code here
//        Map<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < inputStr.length(); i++) {
//            char c = inputStr.charAt(i);
//            if (map.containsKey(c)) map.put(c, map.get(c) + 1);
//            else map.put(c, 1);
//        }
//        Map<Integer, Integer> count = new HashMap<>();
//        for (Character c : map.keySet()) {
//            if (count.containsKey(map.get(c))) count.put(map.get(c), count.get(map.get(c)) + 1);
//            else count.put(map.get(c), 1);
//        }
//        if (count.size() == 1) return true;
//        else if (count.size() == 2) {
//            ArrayList<Integer> arrayList = new ArrayList<>();
//            for (int i : count.keySet()) arrayList.add(i);
//            int sub = Math.abs(arrayList.get(0) - arrayList.get(1));
//            if (sub > 1) return false;
//            else return true;
//        }
//        else return false;
//    }

//    public long Solve(int n, int[] lens) {
//        // write code here
//        long count = 0;
//        if (n < 3) return 0;
//        else {
//            Arrays.sort(lens);
//            for (int i = 0; i < n - 2; i++) {
//                for (int j = i + 1; j < n - 1; j++) {
//                    for (int k = j + 1; k < n; k++) {
//                        if (lens[i] + lens[j] > lens[k]) count++;
//                        else break;
//                    }
//                }
//            }
//        }
//        return count;
//    }

    public long Solve(int n, int[] lens) {
        // write code here
        long count = 0;
        if (n < 3) return 0;
        else {
            Arrays.sort(lens);
            for (int i = 0; i < n - 2; i++) {
                for (int j = i + 1; j < n - 1; j++) {
                    int l = j + 1;
                    int r = n - 1;
                    int p = j;
                    while (l <= r) {
                        int m = (l + r) / 2;
                        if (lens[i] + lens[j] > lens[m]) {
                            l = m + 1;
                            p = m;
                        } else r = m - 1;
                    }
                    count += p - j;
                }
            }
        }
        return count;
    }


//    public String ReverseString(String originStr) {
//        // write code here
//        String[] strings = originStr.split(" ");
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < strings.length; i++) {
//            StringBuilder stringBuilder = new StringBuilder(strings[i]);
//            if (i == 0) result.append(stringBuilder.reverse());
//            else result.append(" ").append(stringBuilder.reverse());
//        }
//        return result.toString();
//    }

    public static void main(String[] args) {
        shopee shopee = new shopee();
//        String s = "shopee";
        String s = "hello world, my friends";
//        System.out.println(shopee.isStringBalance(s));
//        System.out.println(shopee.ReverseString(s));
        System.out.println(shopee.Solve(5, new int[]{2,1,3,1,2}));
    }
}
