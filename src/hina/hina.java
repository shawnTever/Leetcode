package hina;

import java.util.ArrayList;
import java.util.Scanner;

public class hina {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        ArrayList<String> res = new ArrayList<>();
        recursive(string, res, 0, "");
        for (String st : res)
            System.out.println(st);
    }

    private static void recursive(String substring, ArrayList<String> res, int index, String s) {
        if (substring.isEmpty()) {
            res.add(s);
        } else {
            for (int i = 0; i < substring.length(); i++) {
                char c = substring.charAt(i);
                if (i > 0)
                    s = s.substring(0, s.length() - 1) + c;
                else
                    s = s + c;
                String s1 = substring.substring(0, i);
                String s2 = substring.substring(i + 1);
                String str = s1 + s2;
                recursive(str, res, index + 1, s);
            }
        }
    }
}
