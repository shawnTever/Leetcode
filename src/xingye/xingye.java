package xingye;
import java.util.Arrays;
import java.util.Scanner;


public class xingye {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] s = str.split(" ");
        Arrays.sort(s);
        String result = "";
        for (int i = 0; i < s.length; i++) {
            if (i != s.length - 1)
                result += s[i] + " ";
            else
                result += s[i];
        }
        System.out.println(result);
    }
}
