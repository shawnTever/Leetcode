import java.util.ArrayList;

public class BishiZijie {

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
        int m = 3;
        int n = 3;
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("11");
        int i = 0;
        int j = 0;
        recursive(i, j, m, n, arrayList);
        System.out.println(count);
    }
}
