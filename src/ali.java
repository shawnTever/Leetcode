import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ali {
    private static void swap(char[] chars, int i, int position) {
        char c = chars[position];
        chars[position] = chars[i];
        chars[i] = c;
    }

    private static void recursive(ArrayList<String> arrayList, char[] chars, int position) {
        if (position == chars.length) {
            arrayList.add(Arrays.toString(chars));
            return;

        }
        for (int i = position; i < chars.length; i++) {
            swap(chars, i, position);
            recursive(arrayList, chars, position + 1);
            swap(chars, i , position);
        }

    }
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(-2,1,-3,4,-1,2,1,-5,4));
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(-2,1,3,4,-1,5,1,-5,4));
//        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(2,1,3,4,-1,2,1,-5,4));
        int maxsum = 0;
        int sum = 0;

//        for (int i = 0; i < arrayList.size(); i++) {
//            int sum = 0;
//            for (int j = i; j < arrayList.size(); j++) {
//                sum += arrayList.get(j);
//                if (sum > maxsum) {
//                    maxsum = sum;
//                }
//            }
//        }

        for (int i = 0; i < arrayList.size(); i++ ) {
            sum = Math.max(sum + arrayList.get(i), arrayList.get(i));
            if (sum > maxsum) {
                maxsum = sum;
            }
        }

        System.out.println(maxsum);

        String s = "abcd";
        char[] chars = s.toCharArray();
        ArrayList<String> list = new ArrayList<>();
        recursive(list, chars, 0);
        for (String s1 : list)
            System.out.println(s1);
    }
}
