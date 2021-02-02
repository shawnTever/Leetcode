import java.util.ArrayList;
import java.util.List;

public class _54_offer26_spiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return result;
        int row =  matrix.length;
        int col = matrix[0].length;
        boolean[][] visited = new boolean[row + 1][col + 1];
        int total = row * col;
        int i = 0, j = 0;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int direction = 0;

        for (int k = 0; k < total; k++) {
            visited[i][j] = true;
            result.add(matrix[i][j]);
            int nextRow = i + directions[direction][0];
            int nextCol = j + directions[direction][1];
            if (nextRow >= row || nextRow < 0  ||
                    nextCol >= col || nextCol < 0 ||
                    visited[i + directions[direction][0]][j + directions[direction][1]]) {
                direction = (direction + 1) % 4;
            }
            i = i + directions[direction][0];
            j = j + directions[direction][1];
        }

        return result;
    }

    public static void main(String[] args) {
        _54_offer26_spiralOrder spiralOrder = new _54_offer26_spiralOrder();
        int[][] matrix = new int[][]{{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        System.out.println(spiralOrder.spiralOrder(matrix));
    }
}
