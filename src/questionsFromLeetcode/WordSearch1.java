package questionsFromLeetcode;

public class WordSearch1 {
    public static boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, i, j, word, 0)) return true;
            }
        }
        return false;
    }

    private static boolean dfs(char[][] board, int i, int j, String word, int k) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(k)) return false;
        if (k == word.length() - 1) return true;
        char tmp = board[i][j];
        board[i][j] = '#';
        boolean res = dfs(board, i + 1, j, word, k + 1) || dfs(board, i - 1, j, word, k + 1) ||
                dfs(board, i, j + 1, word, k + 1) || dfs(board, i, j - 1, word, k + 1);
        board[i][j] = tmp;
        return res;
    }

    public static void main(String[] args) {
        char[][] arr = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        String word = "ABCCED";
        System.out.println(exist(arr,word));
    }
}
