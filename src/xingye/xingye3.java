package xingye;

import java.util.*;

public class xingye3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.print(a + "=");
        for (int i = 2; i <= Math.sqrt(a); i++) {
            boolean nonPrime = false;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    nonPrime = true;
                    break;
                }
            }
            if (!nonPrime) {
                while (a % i == 0) {
                    a = a / i;
                    arrayList.add(i);
                }
            }
        }
        if (a != 1) arrayList.add(a);
        for (int i = 0; i < arrayList.size(); i++) {
            int num = arrayList.get(i);
            if (i == 0) System.out.print(num);
            else System.out.print("*" + num);
        }

    }

}
