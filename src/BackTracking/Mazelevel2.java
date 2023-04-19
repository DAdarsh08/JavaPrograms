package BackTracking;

import java.util.Arrays;

//Backtracking;
public class Mazelevel2 {
    public static void main(String[] args) {
        boolean[][] board = {{true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[board.length][board[0].length];
        allprint("", board, 0, 0, 1, path);
        //allPathPrint("",board,0,0,path,1);

    }

    public static void allprint(String p, boolean[][] arr, int r, int c, int step, int[][] path) {
        if (r == arr.length-1 && c == arr[0].length-1) {
             arr[r][c] = false;
             path[r][c] = step;
            for (int[] a : path) {
                System.out.println(Arrays.toString(a));
            }

            System.out.println(p);
            System.out.println();
            return;

        }
        if (arr[r][c] == false) {
            return;
        }
        //if my condition is not false;
        arr[r][c] = false;
        path[r][c] = step;
        if (r < arr.length - 1) {
            allprint(p + "D", arr, r + 1, c, step + 1, path);
        }

        if (c < arr[0].length - 1) {

            allprint(p + "R", arr, r, c + 1, step + 1, path);
        }
        if (c > 0) {
            allprint(p + "L", arr, r, c - 1, step + 1, path);
        }
        if (r > 0) {
            allprint(p + "U", arr, r - 1, c, step + 1, path);
        }
        arr[r][c] = true;
        path[r][c] = 0;


    }

}





