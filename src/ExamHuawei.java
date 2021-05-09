import java.util.Arrays;
import java.util.Scanner;

class mainNode {
    int val;
    mainNode[] childs;


    mainNode(int val) {
        this.val = val;
    }
    mainNode() {
    }
}
public class ExamHuawei {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str1 = in.nextLine().split(" ");
        int n = Integer.parseInt(str1[0]);
        int m = Integer.parseInt(str1[1]);
        int[] num = new int[24];
        for (int j = 0; j < n; j++) {
            String str = in.nextLine();
            String[] s = str.split(" ");
            int a = Integer.parseInt(s[0]);
            int l = Integer.parseInt(s[1]);
            int c = Integer.parseInt(s[2]);
            if (num[a] + c <= m) {
                for (int i = a; i < l; i++) {
                    num[i] += c;
                }
            }
        }
        String result = "";
        for (int i = 0; i < num.length; i++) {
            if (i == num.length - 1) result += num[i];
            else result += num[i] + " ";
        }

        System.out.println(result);

        int score = 10;
        boolean[] judge = new boolean[m];
//        Arrays.fill(judge, false);
//        mainNode root;
        for (int j = 0; j < n; j++) {
            String[] str = in.nextLine().split(" ");
            judge[Integer.parseInt(str[0])] = true;
            judge[Integer.parseInt(str[1])] = true;

        }

        for (boolean b : judge) {
            if (!b) score -= 1;
        }
        System.out.println(score);


    }
}