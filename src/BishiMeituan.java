import java.util.ArrayList;
import java.util.Scanner;

public class BishiMeituan {
//    public static int solution(String s, String s1) {
//        char[] ch = s.toCharArray();
//        char[] ch1 = s1.toCharArray();
//        int count = 0;
//        int position = 0;
//        while (position != s1.length() - 1) {
//            for (char c : ch) {
//                if (c == ch1[position]) {
//                    if (position == s1.length() - 1) break;
//                    position++;
//                }
//                else count++;
//            }
//        }
//        return count;
//    }


    public static int solution(int n, int m, int[][] a) {
        int today, yes, tom = 0;
        if (m == 1) return 1;
        if (m == 2) return 2;
        if (m == 3) return a[2][1];
        m = m - 3;
        tom = a[2][1];
        today = 2;
        yes = 1;
        while (m != 0) {
            yes = today;
            today = tom;
            tom = a[today - 1][yes - 1];
            m--;
        }
        ArrayList<Node> arraylist = new ArrayList<> ();
        return tom;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int m = Integer.parseInt(s.substring(0,1));
        int n = Integer.parseInt(s.substring(1,2));
        String[] st = new String[m];
        for (int i = 0; i < m; i++) {
            st[i] = sc.nextLine();
        }
        int[][] a = new int[m][m];
        int row = 0;
        int col = 0;
        for (String str : st) {
            char[] ch = str.toCharArray();
            col = 0;
            for (char c : ch) {
                a[row][col] = Integer.parseInt(c + "");
                col++;
            }
            row++;
        }
        System.out.println(solution(m, n, a));

    }
}
