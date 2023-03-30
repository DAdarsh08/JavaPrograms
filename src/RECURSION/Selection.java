package RECURSION;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int []arr={5,4,3,2,1};
        int c=0;
        int max=0;
        int r=arr.length;
        selection(arr, r,  c,  max);
        System.out.println(Arrays.toString(arr));

    }
    public static void selection(int []arr,int r, int c, int max)
    {
        if(r==0)
        {
            return;
        }
        if(r>c)
        {
            if(arr[c]>arr[max])
            {
                max=c;
            }
            selection(arr,r,c+1,max);
        }
        else {
            int temp=arr[r-1];
            arr[r-1]=arr[max];
            arr[max]=temp;
            selection(arr,r-1,0,0);

        }
    }
}
