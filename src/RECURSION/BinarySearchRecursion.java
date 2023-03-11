package RECURSION;

public class BinarySearchRecursion {
    public static void main(String[] args) {
      int []arr={2,3,4,5,6,7};
      int s=0;
      int end=arr.length-1;
      int target=7;
      int ans=binary(arr,s,end,target);
        System.out.println(ans);

    }

    public static int binary(int[] arr, int start, int end, int target) {
        if(start>end)
        {
            return -1;
        }

        int mid=start+(end-start)/2;// s-s/2 + end/2= (s+end)/2
        if(arr[mid]==target)
        {
            return mid;
        }
        if(arr[mid]<target)
        {

            return binary(arr,mid+1,end,target);

        }
        return binary(arr, start, mid-1, target);


    }
}
