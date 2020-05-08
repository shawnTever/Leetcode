public class _221_MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        int row = matrix.length;
        int colum = matrix[0].length;
        int dpMax = 0;
        int[][] dp = new int[row + 1][colum + 1]; // Dynamic Programming
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                if (i > 0 && j > 0 && matrix[i][j] == '1') {
                    dp[i][j] = Integer.parseInt(Character.toString(matrix[i][j]));
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1],dp[i - 1][j]),dp[i][j - 1]) + 1;
                    dpMax = Math.max(dpMax, dp[i][j]);
                }
                else {
                    dp[i][j] = Integer.parseInt(Character.toString(matrix[i][j]));
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print(dp[i][j]);
            }
            System.out.println();
        }
        return dpMax * dpMax;
    }

    public static void main(String[] args) {
        _221_MaximalSquare maximalSquare = new _221_MaximalSquare();
        char[][] matrix = new char[][]{ {'0', '1', '1', '1', '0'},
                                        {'1', '1', '1', '1', '1'},
                                        {'0', '1', '1', '1', '1'},
                                        {'0', '1', '1', '0', '1'},
                                        {'0', '0', '1', '1', '1'}};
        System.out.println(maximalSquare.maximalSquare(matrix));
    }
}
