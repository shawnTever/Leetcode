package shein;

import java.util.*;

public class shein {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String[] line1 = in.nextLine().split(" ");
//        String[] line2 = in.nextLine().split(" ");
//        LinkedList<String> linkedList = new LinkedList(Arrays.asList(line2));
//        linkedList.remove(Integer.parseInt(line1[1]) - 1);
//        StringBuilder str = new StringBuilder();
//        for (int i = 0; i < linkedList.size(); i++) {
//            if (i == 0)
//                str.append(linkedList.get(i));
//            else
//                str.append(" ").append(linkedList.get(i));
//
//        }
//        System.out.println(str);
//    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] line1 = in.nextLine().split(" ");
        String[] line2 = in.nextLine().split(" ");
        List<String> linkedList = Arrays.asList(line2);
        int n = Integer.parseInt(line1[0]);
        int m = Integer.parseInt(line1[1]);
        if (n == 0 && m == 0)
            System.out.println("");
        else if (m >= 0 && n >= 0 && m <= n) {
            linkedList.remove(m - 1);
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < linkedList.size(); i++) {
                if (i == 0)
                    str.append(linkedList.get(i));
                else
                    str.append(" ").append(linkedList.get(i));

            }
            System.out.println(str);
        }
        else
            System.out.println(-1);
    }

}
