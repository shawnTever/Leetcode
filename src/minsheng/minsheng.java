package minsheng;

import java.util.Scanner;

public class minsheng {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        int count = 0;
//        if (s.equals("Q")) {
//            System.out.println("Quit");
//        } else if (s.equals("1")) {
//            while (sc.hasNextLine()) {
//                String str = sc.nextLine();
//                if (!str.equals("")) count++;
//            }
//            System.out.println(count);
//        } else {
//            System.out.println("Wrong input, Please re-choose\n" +
//                    "Menu Function Test\n" +
//                    "1: Count Lines\n" +
//                    "Q: Quit");
//        }
//    }
    public static boolean isPalindrome(String s) {
        StringBuilder strb = new StringBuilder(s);
        String newS = strb.reverse().toString();
        return newS.equals(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 2; j <= s.length(); j++) {
                if (isPalindrome(s.substring(i, j))) {
                    count++;
                    max = Math.max(max, j - i);
                }
            }
        }
        System.out.println(count + "," + max);

    }

}
