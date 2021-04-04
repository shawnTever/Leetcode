import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class ExamTengxun {

//    public ListNode solve (ListNode S) {
//        // write code here
//        ListNode root = S;
//        ListNode max = S;
//        while (root.next != null) {
//            root = root.next;
//            if (root.val > max.val)
//                max = root;
//
//        }
//        root.next = S;
//        return max;
//    }

//    public static int solve (List<String> S) {
//        // write code here
//        int n = 0;
//        int max = 0;
//        for (String s : S) {
//            if (s.equals("for")) {
//                n++;
//                max = Math.max(max, n);
//            }
//            else if (s.equals("end")){
//                n--;
//                max = Math.max(max, n);
//            }
//        }
//        return max;
//    }


//    public static int solve (int n, int w, int[] low, int[] high) {
//        int sumHigh = 0, sumLow = 0;
//        for (int i : low) sumLow += i;
//        for (int i : high) sumHigh += i;
//        if (sumHigh <= w) {
//            Arrays.sort(high);
//            return high[n / 2 + 1];
//        }
//        else {
//
//        }
//        return high[n / 2 + 1];
//    }


    public static int solve (int n, int m, String[] prices) {
        int sum = 0;
        for (String price : prices) {
            int p = Integer.parseInt(price);
            sum += p;
        }
        int min = sum;
        for (int num = 1; num <= n; num++) {
            if (num == 1) {
                for (String price : prices) {
                    int p = Integer.parseInt(price);
                    if (p % m == 0) {
                        int left = sum - p;
                        min = Math.min(min, left);
                    }
                }
            }

        }
        return min;
    }



    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = Integer.parseInt(in.nextLine());
//        List<String> list = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            String s = in.nextLine();
//            list.add(s);
//        }
//        System.out.println(solve(list));

//        Scanner in = new Scanner(System.in);
//        String[]  strings = in.nextLine().split(" ");
//        int n = Integer.parseInt(strings[0]);
//        int w = Integer.parseInt(strings[1]);
//        int[] low = new int[n];
//        int[] high = new int[n];
//        for (int i = 0; i < n; i++) {
//            String[]  strings1 = in.nextLine().split(" ");
//            low[i] = Integer.parseInt(strings1[0]);
//            high[i] = Integer.parseInt(strings1[1]);
//        }
//        System.out.println(solve(n, w, low, high));


        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        for (int i = 0; i < T; i++) {
            String[]  strings = in.nextLine().split(" ");
            int n = Integer.parseInt(strings[0]);
            int m = Integer.parseInt(strings[1]);
            String[]  price = in.nextLine().split(" ");
            System.out.println(solve (n, m, price));
        }

    }
}
