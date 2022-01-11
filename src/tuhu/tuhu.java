package tuhu;

import java.util.*;

public class tuhu {
//    public static int closestValue (int[] array, int target) {
//        // write code here
//        int len = array.length;
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < len - 1; i++) {
//            for (int j = i + 1; j < len; j++) {
//                int sum = array[i] + array[j];
//                if (sum == target) return target;
//                if (sum < target) min = Math.min(min, target - sum);
//            }
//        }
//        if (min == Integer.MAX_VALUE) return -1;
//        return target - min;
//
//    }
//
//    public static void main(String[] args) {
//        int[] array = new int[]{-1,-3,-5,-9,-7};
//        int target = 6;
//        System.out.println(closestValue(array, target));
//    }
    public static boolean canFree (int[] price, int[] backup, int start) {
        // write code here
        Map<Integer, Integer> map = new HashMap<>();
        int len = price.length;
        for (int i = 0; i < len; i++) {
            map.put(price[i], backup[i]);
        }
        int count = 0;
        int back = -1;
        if (map.containsKey(start)) {
            back = map.get(start);
        } else {
            return false;
        }
//        while (count != len - 1) {
//            int backPrice = price[back];
//            if (backPrice == start) return true;
//            back = map.get(backPrice);
//            count ++;
//        }
        return false;
    }


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        String[] strs = s.substring(1, s.length() - 1).split(",");
//        Set<Integer> set = new HashSet<>();
//
//        for (String str : strs) {
//            int i = Integer.parseInt(str);
//            if (set.contains(i)) set.remove(i);
//            else set.add(i);
//        }
//        for (int i : set)
//            System.out.println(i);
        int[] price = new int[]{123,234,345,456,0,33,23,45,67,88};
        int[] backup = new int[]{1,0,2,5,7,9,4,3,6,8};
        int start = 0;
        System.out.println(canFree(price, backup, start));

    }
}
