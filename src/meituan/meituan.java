package meituan;

import java.util.*;

public class meituan {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String line1 = in.nextLine();
//        String line2 = in.nextLine();
//        String line3 = in.nextLine();
//        int n = Integer.parseInt(line1);
//        String[] a = line2.split(" ");
//        String[] b = line3.split(" ");
//        if (n < 2) System.out.println(1);
//        else {
//            StringBuilder s = new StringBuilder("1");
//            for (int i = 0; i < a.length; i++) {
//                long l = recursive(a, b, i);
//                s.append(" ").append(l);
//            }
//            System.out.println(s);
//        }
//    }
//
//    private static long recursive(String[] a, String[] b, int index) {
//        int an = Integer.parseInt(a[index]);
//        int bn = Integer.parseInt(b[index]);
//        if (bn == 1) return an;
//        else {
//            return (long) an * recursive(a, b, bn - 2);
//        }
//    }


//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String line1 = in.nextLine();
//        String line2 = in.nextLine();
//        String line3 = in.nextLine();
//        long n = Integer.parseInt(line1);
//        String[] a = line2.split(" ");
//        String[] b = line3.split(" ");
//        if (n < 2) System.out.println(1);
//        else {
//            StringBuilder s = new StringBuilder("1");
//            for (int i = 0; i < a.length; i++) {
//                long l = recursive(a, b, i);
//                s.append(" ").append(l);
//            }
//            System.out.println(s);
//        }
//    }
//
//    private static String recursive(String[] a, String[] b, long index) {
//        String an = a[index];
//        String bn = b[index];
//        if (bn.equals("1")) return an;
//        else {
////            String bLast = bn.substring(bn.length() - 1);
////            bn = bn.substring(0, bn.length() - 1);
////            Integer bi = Integer.parseInt(bLast) - 2;
////            bLast = bi.toString();
////            bn = bn + bLast;
//            index = Integer.parseInt(bn) - 2;
//            String ar = new StringBuilder(an).reverse().toString();
//            char[] anArray = an.toCharArray();
//            int flag = 0;
//            for (int i = anArray.length - 1; i >= 0; i--) {
//                if ()
//            }
//            return (long) an * recursive(a, b, index);
//        }
//    }

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        if (n == 1) System.out.println(0);
//        else {
//            ArrayList<Integer> sub = new ArrayList<>();
//            for (int i = 0; i < n; i++) {
//                sub.add(i + 1);
//            }
//            ArrayList<ArrayList<Integer>> results = new ArrayList<>();
//            ArrayList<Integer> subResult = new ArrayList<>();
//            dfs(sub, results, subResult);
//            ArrayList<String> re = new ArrayList<>();
//            int count = 0;
//            for (ArrayList<Integer> a : results) {
//                StringBuilder s = new StringBuilder();
//                boolean flag = false;
//                for (int i = 0; i < a.size(); i++) {
//                    if (a.get(i) == i + 1) {
//                        flag = false;
//                        break;
//                    }
//                    else {
//                        flag = true;
//                        s.append(a.get(i)).append(" ");
//                    }
//                }
//                if (flag) {
//                    count++;
//                    re.add(s.toString());
//                }
//            }
//            System.out.println(count);
//            Arrays.sort(re.toArray());
//            for (String str : re)
//            System.out.println(str);
//        }
//    }
//
//    private static void dfs (ArrayList<Integer> sub, ArrayList<ArrayList<Integer>> results,
//                             ArrayList<Integer> subResult) {
//        if (sub.size() == 0) results.add(subResult);
//        else {
//            for (int i = 0; i < sub.size(); i++) {
//                ArrayList<Integer> r = new ArrayList<>(subResult);
//                r.add(sub.get(i));
//                ArrayList<Integer> s = new ArrayList<>(sub);
//                s.remove(i);
//                dfs(s, results, r);
//            }
//        }
//    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line1 = in.nextLine();
        while (in.hasNextLine()) {
            String line2 = in.nextLine();
            String line3 = in.nextLine();
            char[] line2c = line2.toCharArray();
            int m = Integer.valueOf(line2c[0]);
            int n = Integer.valueOf(line2c[1]);

            if (m - n != 1)
                System.out.println("NO");
            System.out.println("NO");
        }

    }

}
