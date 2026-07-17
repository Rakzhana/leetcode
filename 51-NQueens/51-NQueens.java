// Last updated: 17/07/2026, 15:15:26
class Solution {
    List<List<String>> res = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        
        // Start recursion with 0 tracking masks for cols, diag1, and diag2
        generate(board, 0, 0, 0, 0, n);
        return res;
    }

    public void generate(char[][] board, int row, int cols, int diag1, int diag2, int n) {
        if (row == n) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(new String(board[i]));
            }
            res.add(list);
            return;
        }

        for (int col = 0; col < n; col++) {
            // Create a bit positioning mask for the current column
            int bit = 1 << col;

            // O(1) Safety Check: Verify if the column or diagonals are attacked
            if ((cols & bit) == 0 && (diag1 & (1 << (row - col + n))) == 0 && (diag2 & (1 << (row + col))) == 0) {
                
                board[row][col] = 'Q';
                
                // Backtrack with updated bitmasks (flip the bits to 1 using bitwise OR)
                generate(board, row + 1, cols | bit, diag1 | (1 << (row - col + n)), diag2 | (1 << (row + col)), n);
                
                board[row][col] = '.'; 
            }
        }
    }
}