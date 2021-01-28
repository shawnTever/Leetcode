public class offer13_movingCount {
    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        return DFS(visited, m, n, k, 0, 0);
    }

    private int DFS(boolean[][] visited, int m, int n, int k, int i, int j) {
        if (i >= m || j >=n || sum(i) + sum(j) > k || visited[i][j]) return 0;
        visited[i][j] = true;

        return DFS(visited, m, n, k, i + 1, j) +
                DFS(visited, m, n, k, i, j + 1) + 1;
    }

    private int sum(int m) {
        int sum = 0;
        while (m > 0) {
            sum += m % 10;
            m = m / 10;
        }
        return sum;
    }
}
