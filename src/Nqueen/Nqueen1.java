package Nqueen;
// Backtracking
public class Nqueen1 {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        int r = 0;
        System.out.println(queens(board, r));

    }

    public static int queens(boolean[][] board, int r) {
        if (r == board.length) {
            isdisplay(board);
            System.out.println();
            return 1;

        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, r, col)) {
                board[r][col] = true;
                count += queens(board, r + 1);
                board[r][col] = false;
            }
        }
        return count;
    }

    public static void isdisplay(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print(" Q");
                } else {
                    System.out.print(" X");
                }

            }
            System.out.println();
        }

    }

    private static boolean isSafe(boolean[][] board, int r, int col) {
        // for vetical
        for (int i = 0; i < r; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        // for left diagonal
        int left = Math.min(r, col);

        for (int i = 1; i <= left; i++) {
            if (board[r - i][col - i]) {
                return false;
            }
        }
        //for right diagonal
        int right = Math.min(r, board.length - col - 1);
        for (int i = 1; i <= right; i++) {
            if (board[r - i][col + i]) {
                return false;
            }
        }
        return true;

    }
  /*
  This is the output for n=4(4*4) chess board.
    X Q X X
    X X X Q
    Q X X X
    X X Q X

    X X Q X
    Q X X X
    X X X Q
    X Q X X

   2

*/
}
