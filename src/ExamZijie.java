import java.util.ArrayList;

public class ExamZijie {

    public static int count = 0;
    private static void recursive(int i, int j, int m, int n, ArrayList<String> arrayList) {
        if (!arrayList.contains(Integer.toString(i * 10 + j))) {
            if (i == m - 1 && j == n - 1) count++;
            else {
                if (i < m - 1) recursive(i + 1, j, m, n, arrayList);
                if (j < n - 1) recursive(i , j + 1, m, n, arrayList);
            }
        }
    }

    public static void main(String[] args) {
//        int m = 4;
//        int n = 4;
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("11");
//        arrayList.add("21");
//        int i = 0;
//        int j = 0;
//        recursive(i, j, m, n, arrayList);
//        System.out.println(count);

        String a = "11";
        String b = "1";
        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b);
        int suma = 0;
        int positiona = 0;


        while (aInt != 0){
            int i = aInt % 10;
            aInt = aInt / 10;
            suma += i * Math.pow(2, positiona);
            positiona ++;
        }

        int sumb = 0;
        int positionb = 0;

        while (bInt != 0){
            int i = bInt % 10;
            bInt = bInt / 10;
            sumb += i * Math.pow(2, positionb);
            positionb ++;

        }
        int sum = sumb + suma;
        StringBuilder s = new StringBuilder();
        while (sum != 0) {
            s.append(sum % 2);
            sum = sum / 2;
        }
        System.out.println(s.reverse().toString());
    }
}
