package BackTracking;

import java.util.ArrayList;

public class Mazelevel1 {
    public static void main(String[] args) {
       // System.out.println(count(3,3));
      //  count2("",3,3);
        boolean [][]board={{true,true,true},
                          {true,false,true},
                          {true,true,true}
        };
      //  count3("",3,3);
        count4("",board,0,0);
        System.out.println( pathRetDiagonal("",3,3));
    }
    public static int count(int row, int col)
    {
        if(row==1||col==1)
        {
            return 1;
        }
        int left=count(row-1,col);
        int right=count(row,col-1);

        return left+right;
    }
    public static void count2( String p,int row, int col)
    {
        if(row==1&&col==1)
        {
            System.out.println(p);
            return ;
        }
        if(row>1) {
            count2(p + "D", row - 1, col);
        }
        if(col>1) {

            count2(p + "R", row, col - 1);
        }


    }
    public static void count3( String p,int row, int col)
    {
        if(row==1&&col==1)
        {
            System.out.println(p);
            return ;
        }
        if(row>1) {
            count3(p + "v", row - 1, col);
        }
        if(row >1&&col>1)
        {
            count3(p+"d",row-1,col-1);
        }
        if(col>1) {

            count3(p + "h", row, col - 1);
        }


    }
    public static void count4( String p,boolean[][]arr,int row, int col)
    {
        if(row==arr.length-1&&col==arr[0].length-1)
        {
            System.out.println(p);
            return ;
        }
        if(arr[row][col]==false)
        {
            return;
        }
        if(row<arr.length-1) {
            count4(p + "v",arr, row + 1, col);
        }
        if(row < arr.length-1&&col<arr[0].length-1)
        {
            count4(p+"d",arr,row+1,col+1);
        }
        if(col< arr[0].length-1) {

            count4(p + "h",arr, row, col + 1);
        }


    }
   public static ArrayList<String> pathRetDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r > 1 && c > 1) {
            list.addAll(pathRetDiagonal(p + 'D', r-1, c-1));
        }

        if (r > 1) {
            list.addAll(pathRetDiagonal(p + 'V', r-1, c));
        }

        if (c > 1) {
            list.addAll(pathRetDiagonal(p + 'H', r, c-1));
        }

        return list;
    }

}
