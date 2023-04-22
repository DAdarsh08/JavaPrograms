package BackTracking;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        boolean ans = solve(board);
        if (ans) {
            isdisplay(board);
        }


    }

    public static void isdisplay(int[][] board) {
        for (int[] r : board) {
            for (int num : r) {
                System.out.print(num +" ");

            }
            System.out.println();
        }
    }

    public static boolean solve(int[][] board) {
        int n = board.length;
        int r = -1;
        int c = -1;
        boolean notempty = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    r = i;
                    c = j;
                    notempty = false;
                    break;

                }

            }
            if (notempty == false) {
                break;
            }
        }
        if (notempty) {
            return true;
        }
        for (int num = 1; num <= 9; num++) {

            if (isSafe(board, r, c, num)) {
                board[r][c]=num;
                if (solve(board)) {

                    return true;
                } else {
                    board[r][c] = 0;
                }
            }
        }
        return false;


    }

    public static boolean isSafe(int[][] board, int r, int c, int num) {
        for (int i = 0; i < board.length; i++) {
            if (board[r][i] == num) {
                return false;
            }
        }
        for (int i = 0; i < board.length; i++) {
            if (board[i][c] == num) {
                return false;
            }
        }
        int sqrt = (int) Math.sqrt(board.length);
        int startrow = r - r % sqrt;
        int startcol = c - c % sqrt;
        for (int i = startrow; i < startrow + sqrt; i++) {
            for (int j = startcol; j < startcol + sqrt; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }
     /* This is the OUTPUT of following codeSample;
            3 1 6 5 7 8 4 9 2
            5 2 9 1 3 4 7 6 8
            4 8 7 6 2 9 5 3 1
            2 6 3 4 1 5 9 8 7
            9 7 4 8 6 3 1 2 5
            8 5 1 7 9 2 6 4 3
            1 3 8 9 4 7 2 5 6
            6 9 2 3 5 1 8 7 4
            7 4 5 2 8 6 3 1 9

           */
}

