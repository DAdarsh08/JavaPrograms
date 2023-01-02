import java.util.Arrays;

public class Insert {
    public static void main(String[] args) {
        int []arr={5,4,3,2,1};
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);

                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void swap(int []arr, int ans,int end)
    {
        int temp;
        temp=arr[ans];
        arr[ans]=arr[end];
        arr[end]=temp;
    }
}
