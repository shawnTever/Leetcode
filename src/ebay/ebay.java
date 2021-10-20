package ebay;

import java.util.*;

public class ebay {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNextLine()) {
//            String s = in.nextLine();
//            if (!s.isEmpty()) {
//                ArrayList<Character> l = new ArrayList<>();
//                for (Character c : s.toCharArray()) {
//                    l.add(c);
//                }
//                int diff = 0;
//                diff = countDiff ( l,  0,  l.size() - 1,  diff);
//                if (diff <= 1)
//                    System.out.println("Yes");
//                else System.out.println("No");
//            } else break;
//        }
//    }
//
//    public static int countDiff (ArrayList<Character> l, int left, int right, int diff) {
//        if (!l.get(left).equals(l.get(right))) {
//            diff++;
//        }
//        if (left + 1 < right - 1) {
//            diff = countDiff(l, left + 1, right - 1, diff);
//        }
//        return diff;
//    }

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String s1 = in.nextLine();
//        String s2 = in.nextLine();
//        String s3 = in.nextLine();
//        if (s1.isEmpty() || s2.isEmpty() || s3.isEmpty())
//            System.out.println(0);
//        else {
//            String[] str1 = s1.split(" ");
//            String[] str2 = s2.split(" ");
//            String[] str3 = s3.split(" ");
//            int m = Integer.parseInt(str1[0]);
//            int n = Integer.parseInt(str1[1]);
//            int k = Integer.parseInt(str1[2]);
//            int count = 0;
//            Map<Integer, Integer> map = new HashMap<>();
//            for (int i = 0; i < m; i++) {
//                for (int j = 0; j < n; j++) {
//                    if (Integer.parseInt(str2[i]) + Integer.parseInt(str3[j]) == k)
//                        count++;
//                }
//            }
//            System.out.println(count);
//        }
//    }
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s1 = in.nextLine();
    String s2 = in.nextLine();
    String s3 = in.nextLine();
    if (s1.isEmpty() || s2.isEmpty() || s3.isEmpty())
        System.out.println(0);
    else {
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");
        String[] str3 = s3.split(" ");
        int m = Integer.parseInt(str1[0]);
        int n = Integer.parseInt(str1[1]);
        int k = Integer.parseInt(str1[2]);
        int count = 0;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (Integer.parseInt(str2[i]) + Integer.parseInt(str3[j]) == k)
                    count++;
            }
        }
        System.out.println(count);
    }
}


}
