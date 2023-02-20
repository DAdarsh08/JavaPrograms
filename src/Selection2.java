import java.util.Arrays;

public class Selection2 {
    public static void main(String[] args) {
        int []arr={5,4,3,2,1};

     for(int j=0;j<=arr.length-2;j++)
     {
         int min=arr[j];
         int pos=j;
         for (int i = j; i <= arr.length - 1; i++)
         {

             if (arr[i] < min) {
                 min = arr[i];
                 pos = i;
             }


         }
         int temp;
         temp=arr[j];
         arr[j]=min;
         arr[pos]=temp;
     }

        System.out.println(Arrays.toString(arr));
        //System.out.println(min);
       // System.out.println(pos);
    }
}
