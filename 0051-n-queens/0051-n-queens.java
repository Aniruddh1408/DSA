class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        backtrack(board, 0, ans, new ArrayList<>());
        return ans;
    }
    public void backtrack(char[][] board, int row, List<List<String>> res, List<String> cur) {
        if(row == board.length) {
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int col = 0; col < board[row].length; col++) {
            if(isSafe(board, row, col)) {
                board[row][col] = 'Q';
                cur.add(new String(board[row]));
                backtrack(board, row + 1, res, cur);
                cur.remove(cur.size() - 1);
                board[row][col] = '.';
            }
        }
    }
    public boolean isSafe(char[][] board, int row, int col) {
        for(int i = 0; i < board.length; i++) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }
        int leftDiag = Math.min(row, col);
        for(int i = 0; i <= leftDiag; i++) {
            if(board[row - i][col - i] == 'Q') {
                return false;
            }
        }
        int rightDiag = Math.min(row, board.length - col - 1);
        for(int i = 0; i <= rightDiag; i++) {
            if(board[row - i][col + i] == 'Q') {
                return false;
            }
        }
        return true;
    }
}