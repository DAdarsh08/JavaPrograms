package RECURSION;

import java.util.ArrayList;
import java.util.Arrays;

public class prob1 {
    public static void main(String[] args) {
       /* Input : A = {1, 2, 3, 4, 5}
        Output : [48]
         [20, 28]
         [8, 12, 16]
         [3, 5, 7, 9]
         [1, 2, 3, 4, 5]*/
        int []arr={1,2,3,4,5};



        fun1(arr);
    }



    public static void fun1(int []arr)
    {


        if(arr.length<1)
        {

            return;
        }

        int []a=new int[arr.length-1];
        for(int i=0;i<a.length;i++)
        {
            a[i]=arr[i]+arr[i+1];

        }
        fun1(a);
        System.out.println(Arrays.toString(arr));






    }
}
