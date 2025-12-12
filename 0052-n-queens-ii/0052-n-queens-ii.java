class Solution {
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        return backtrack(board, 0);
    }

    public int backtrack(char[][] board, int row) {
        if (row == board.length) {
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board[row].length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                count += backtrack(board, row + 1);
                board[row][col] = '.';
            }
        }
        return count;
    }

    public boolean isSafe(char[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        int leftDiag = Math.min(row, col);
        for (int i = 1; i <= leftDiag; i++) {
            if (board[row - i][col - i] == 'Q') {
                return false;
            }
        }
        int rightDiag = Math.min(row, board.length - 1 - col);
        for (int i = 1; i <= rightDiag; i++) {
            if (board[row - i][col + i] == 'Q') {
                return false;
            }
        }
        return true;
    }
}