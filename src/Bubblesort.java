import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        int temp;

        System.out.println(Arrays.toString(arr));
        for(int i=0;i<=arr.length-2;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }

            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("THE FINAL RESULT IS:-");
        System.out.println(Arrays.toString(arr));
    }
}
