public class _79_offer12_exist {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
//        for (int row = 0; row < board.length; row++) {
//            for (int col = 0; col < board[0].length; col++) {
//                visited[row][col] = false;
//            }
//        }
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col] == word.charAt(0)) {
                    boolean result = recursive(board, visited, word, row, col, 1);
                    if (result) return true;
                }
            }
        }
        return false;
    }

    public boolean recursive(char[][] board, boolean[][] visited, String word, int row, int col, int num) {
        boolean result = false;
        if (num == word.length()) return true;
        else {
            visited[row][col] = true;
            int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
            for (int[] direction : directions) {
//                if (row + direction[0] >= 0 && col + direction[1] >= 0
//                        && row + direction[0] < board.length && col + direction[1] < board[0].length) {
//                    boolean a = board[row + direction[0]][col + direction[1]] == word.charAt(num);
//                    boolean b = !visited[row + direction[0]][col + direction[1]];
//                    System.out.println(a);
//                    System.out.println(b);
//                }


                if (row + direction[0] >= 0 && col + direction[1] >= 0
                        && row + direction[0] < board.length && col + direction[1] < board[0].length
                        && board[row + direction[0]][col + direction[1]] == word.charAt(num)
                        && !visited[row + direction[0]][col + direction[1]])
                    if (recursive(board, visited, word, row + direction[0],
                            col + direction[1], num + 1)) {
                        result = true;
                        break;
                    }
            }
        }
        visited[row][col] = false;

        return result;
    }

    public static void main(String[] args) {

//        char[][] board =
//                {
//                        {'A', 'B', 'C', 'E'},
//                        {'S', 'F', 'C', 'S'},
//                        {'A', 'D', 'E', 'E'}
//                };
//
//        String word = "SEE";
        char[][] board =
                {
                        {'C', 'A', 'A'},
                        {'A', 'A', 'A'},
                        {'B', 'C', 'D'}
                };

        String word = "AAB";

//        char[][] board =
//                {
//                        {'a','b'},
//                        {'c','d'},
//                };
//
//        String word = "cdba";

        _79_offer12_exist exist = new _79_offer12_exist();
        System.out.println(exist.exist(board, word));

    }
}
