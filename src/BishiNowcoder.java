import java.util.Scanner;

public class BishiNowcoder {

//    public static int solution(int a, int b) {
//        return a + b;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
////        sc.nextInt();
//        while (sc.hasNextInt()) {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            if (a == 0 && b == 0) break;
//            System.out.println(solution(a, b));
//        }
//        while (sc.hasNext()) {
//            int sum = 0;
//            String s = sc.nextLine();
//            if (!s.equals("")) {
//                String[] str = s.split(" ");
//                if (str[0].equals("0")) break;
//                for (int i = 1; i < str.length; i++) {
//                    sum += Integer.parseInt(str[i]);
//                }
//                System.out.println(sum);
//            }
//        }

        while (sc.hasNext()) {
            String s = sc.nextLine();
            String[] str = s.split(" ");
            System.out.println(Long.parseLong(str[0]) + Long.parseLong(str[1]));
        }

    }

}
