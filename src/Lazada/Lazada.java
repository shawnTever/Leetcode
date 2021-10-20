package Lazada;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lazada {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNextLine()) {
//            String s = in.nextLine();
//            if (!s.isEmpty()) {
//                StringBuilder str = new StringBuilder();
//                char pre = s.charAt(0);
//                int count = 1;
//                for (int i = 1; i < s.length(); i++) {
//                    char c = s.charAt(i);
//                    if (pre == c) count++;
//                    else {
//                        if (count == 1) str.append(pre);
//                        else str.append(count).append(pre);
//                        pre = c;
//                        count = 1;
//                    }
//                }
//                if (count == 1) str.append(pre);
//                else str.append(count).append(pre);
//                System.out.println(str);
//            } else {
//                break;
//            }
//        }
//    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String s = in.nextLine();
            if (!s.isEmpty()) {
                int m = Character.getNumericValue(s.charAt(0));
                for (int i = 0; i < m; i++) {
                    String[] str = in.nextLine().split(" ");
                    int low = Integer.parseInt(str[0]);
                    int high = Integer.parseInt(str[1]);
                    int count = 0;
                    for (int j = low; j <= high; j++) {
                        if (isPrime(j)) count++;
                    }
                    System.out.println(count);
                }

            }
            else break;
        }

    }

    private static boolean isPrime(int n) {
        if (n == 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

}
