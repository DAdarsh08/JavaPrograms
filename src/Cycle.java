import java.util.Arrays;

public class Cycle {
    public static void main(String[] args) {
        int []nums={3,5,2,1,4};
        int i=0;
        while(i<nums.length)
        {
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct])
            {
                int temp;
                temp=nums[correct];
                nums[correct]=nums[i];
                nums[i]=temp;
            }

            else {
                i++;
            }

        }
        System.out.println(Arrays.toString(nums));

    }
}
