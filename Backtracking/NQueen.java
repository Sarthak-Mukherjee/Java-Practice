/* N-Queens Problem

Question:
Place N queens on an N×N chessboard so that no two queens threaten each other.
Return all possible board configurations.

Example:
Input: N = 4
Output:

.Q..
...Q
Q...
..Q.

..Q.
Q...
...Q
.Q..

Approach:
Try placing queens row by row and backtrack when placement is invalid.
*/

import java.util.*;

public class NQueen {

    public static List<List<String>> solveNQueen(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] row : board)
            Arrays.fill(row, '.');
        backtrack(result, board, 0, n);
        return result;
    }

    public static void backtrack(List<List<String>> result, char[][] board, int row, int n) {
        if (row == n) { // all queens are placed (Base Case)
            List<String> solution = new ArrayList<>();
            for (char[] r : board)
                solution.add(new String(r));
            result.add(solution);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 'Q'; // place queen
                backtrack(result, board, row + 1, n); // recurse to place next queen
                board[row][col] = '.'; // backtrack
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col, int n) {
        // Check column
        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q')
                return false;

        // Check left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q')
                return false;

        // Check right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++)
            if (board[i][j] == 'Q')
                return false;

        return true;
    }

    public static void main(String[] args) {
        System.out.println(solveNQueen(4));
    }
}
