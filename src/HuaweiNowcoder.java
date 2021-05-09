import java.util.Scanner;

public class HuaweiNowcoder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String s = sc.nextLine();
//        String[] strings = s.split(" ");
//        System.out.println(strings[strings.length - 1].length());
//
//        String s = sc.nextLine().toLowerCase();
//        String c = sc.nextLine().toLowerCase();
//        int count = 0;
//        for (char ch : s.toCharArray()) {
//            if (ch == c.charAt(0))
//                count++;
//        }
//        System.out.println(count);

        while (sc.hasNextLine()) {
            String s = sc.nextLine().substring(2);
            System.out.println(Integer.parseInt(s, 16));
        }

    }

}
