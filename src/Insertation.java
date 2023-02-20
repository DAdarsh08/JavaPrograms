import java.util.Arrays;

public class Insertation {
    public static void main(String[] args) {
        int []arr={2,4,7,8,3};
        int  l=arr.length;
        int temp;
        for(int i=0;i<=l-2;i++)
        {

            if(arr[i]>arr[i+1])
            {
                int ans=arr[i+1];
                int pos=i+1;

                while(pos>=1&&ans<arr[pos-1])
                {
                    arr[pos]=arr[pos-1];
                    pos--;

                }
                arr[pos]=ans;
            }


        }
        System.out.println(Arrays.toString(arr));
    }
}
