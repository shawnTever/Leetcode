package jianxin;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class jianxin {
//    public int getIndex (int k, int m, int[] deliciousness) {
//        // write code here
//        for (int i = deliciousness.length - 1; i >= 0; i--) {
//            if (deliciousness[i] > m) k--;
//            if (k == 0) return i;
//        }
//        return -1;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line1 = sc.nextLine().split(" ");
        String[] line2 = sc.nextLine().split(" ");
        int m = Integer.parseInt(line1[0]);
        int n = Integer.parseInt(line1[1]);
        Queue<Integer> q = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(line2[i]);
            if (q.size() < m && !q.contains(a)) {
                q.add(a);
                count++;
            } else if (q.size() >= m && !q.contains(a)) {
                q.poll();
                q.add(a);
                count++;
            }
        }
        System.out.println(count);

    }

}
