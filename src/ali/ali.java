package ali;

import java.util.*;

public class ali {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String[] line1 = in.nextLine().split(" ");
//        String[] line2 = in.nextLine().split(" ");
//        int n = Integer.parseInt(line1[0]);
//        int c = Integer.parseInt(line1[1]);
//        int sum = 0;
//        StringBuilder s = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            int a = Integer.parseInt(line2[i]);
//            sum += a;
//            float ave = (float) sum / (i + 1);
//            if (ave > c) {
//                sum = sum - a;
//                a = (i + 1) * c - sum;
//                sum = sum + a;
//            }
//            if(i == 0)
//                s.append(a);
//            else s.append(" ").append(a);
//        }
//        System.out.println(s);
//    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] line1 = in.nextLine().split(" ");
        String[] line2 = in.nextLine().split(" ");
        int n = Integer.parseInt(line1[0]);
        List<String> l = Arrays.asList(line2);
        Map<Integer, Integer> map = new HashMap<>();
        while (l.size() != 0) {
            for (int i = 0; i < n; i += 2) {
                if (i + 1 < n) {
                    int a = Integer.parseInt(line2[i]);
                    int b = Integer.parseInt(line2[i + 1]);
                    if (a > b) map.put(a, b);
                    else map.put(b, a);
                }
            }
            int index = 0;
            int max = 0;
            Map<Integer, Integer> map1 = new HashMap<>();
            for (int i : map.keySet()) {
                map1.put(i, index);
                max = Math.max(max, i);
                index += 2;
            }

            index = map1.get(max);
            l.remove(index);


        }
    }



}
