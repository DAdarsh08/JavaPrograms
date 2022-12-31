import java.util.Arrays;

public class Slection {
    public static void main(String[] args) {


        int[] arr = {5, 3, 2, 1, 4};
        int l = arr.length;


        for (int i = 0; i < l; i++) {
            int start=0;
            int end=l-i-1;
            int ans=max( arr,start,end);
            swap(arr,ans,end);

        }
        System.out.println(Arrays.toString(arr));

    }
    public static int max (int []arr,int start,int end)
    {
        int maximum=start;
        for(int i=start;i<=end;i++)
        {
            if (arr[maximum]<arr[i]) {
                maximum=i;

            }
        }
        return maximum;

    }
    public static void swap(int []arr, int ans,int end)
    {
        int temp;
        temp=arr[ans];
        arr[ans]=arr[end];
        arr[end]=temp;
    }


}
