package huawei;

public class meeting2 {

    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[][] result = new int[m][n];
        for (int i = m; i > 0; i--) {
            for (int j = n; j > 0; j--) {
                if (i == m || j == n) result[i - 1][j - 1] = 1;
                else {
                    result[i - 1][j - 1] = result[i][j - 1] + result[i - 1][j];
                }
            }
        }
        System.out.println(result[0][0]);
    }
}
