package xiecheng;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class xiecheng {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        char pre = '0';
//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if (pre == ch) {
//                if (Character.isLowerCase(ch)) {
//                    char c = Character.toUpperCase(ch);
//                    s = s.substring(0, i) + c + s.substring(i + 1);
//                    pre = c;
//                    count++;
//                }
//                else if (Character.isUpperCase(ch)) {
//                    char c = Character.toLowerCase(ch);
//                    s = s.substring(0, i) + c + s.substring(i + 1);
//                    pre = c;
//                    count++;
//                }
//            }
//            else pre = ch;
//        }
//        System.out.println(count);
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        char pre = '9';
//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if (pre == ch) {
//                if (Character.isLowerCase(ch)) {
//                    pre = Character.toUpperCase(ch);
//                    count++;
//                } else if (Character.isUpperCase(ch)) {
//                    pre = Character.toLowerCase(ch);;
//                    count++;
//                }
//            } else pre = ch;
//        }
//        System.out.println(count);
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] s = sc.nextLine().split(" ");
//        int n = Integer.parseInt(s[0]);
//        int m = Integer.parseInt(s[1]);
//
//        String str1 = sc.nextLine();
//        String str2 = sc.nextLine();
//        StringBuilder string = new StringBuilder();
//
//        while (n > 1000) {
//            String[] begins = str1.substring(0, 1000).split(" ");
//            String[] ends = str2.substring(0, 1000).split(" ");
//            n -= 1000;
//        }
//
//        String[] begins = str1.split(" ");
//        String[] ends = sc.nextLine().split(" ");
//
//        for (int i = 0; i < m; i++) {
//            int begin = Integer.parseInt(begins[i]);
//            int end = Integer.parseInt(ends[i]);
//            for (int j = begin; j < end; j++) {
//                String str = string.toString();
//                if (!str.contains(String.valueOf(j)))
//                    string.append(j);
//            }
//
//        }
//
//
//        System.out.println(n - string.length() - 1);
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        String[] begins = sc.nextLine().split(" ");
        String[] ends = sc.nextLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < m; i++) {
            int begin = Integer.parseInt(begins[i]);
            int end = Integer.parseInt(ends[i]);
            for (int j = begin; j < end; j++)
                set.add(j);
        }


        System.out.println(n - set.size() - 1);
    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] s = sc.nextLine().split(" ");
//        int n = Integer.parseInt(s[0]);
//        int m = Integer.parseInt(s[1]);
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < m; i++)
//            set.add(i);
//
//        String str1 = sc.nextLine();
//        String str2 = sc.nextLine();
//
//        while (str1.length() > 1000) {
//            String[] begins = str1.substring(0, 1000).split(" ");
//            String[] ends = str2.substring(0, 1000).split(" ");
//            for (int i = 0; i < begins.length; i++) {
//                int begin = Integer.parseInt(begins[i]);
//                int end = Integer.parseInt(ends[i]);
//                for (int j = begin; j < end; j++)
//                    set.remove(j);
//            }
//            str1 = str1.substring(1001);
//            str2 = str1.substring(1001);
//        }
//
//        String[] begins = str1.split(" ");
//        String[] ends = str2.split(" ");
//
//        for (int i = 0; i < m; i++) {
//            int begin = Integer.parseInt(begins[i]);
//            int end = Integer.parseInt(ends[i]);
//            for (int j = begin; j < end; j++)
//                set.remove(j);
//        }
//
//
//        System.out.println(set.size() - 1);
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        String[] bloods = sc.nextLine().split(" ");
//
//        int min = Integer.parseInt(bloods[0]);
//        int sum = 0;
//        for (String a : bloods) {
//            int blood = Integer.parseInt(a);
//            min = Math.min(min, blood);
//            sum += blood;
//        }
//
//        System.out.println(sum - min * (n - 1));
//    }

}
