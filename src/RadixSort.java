import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int num = 123;
        int n = 4;
        int ans = getDigit(num, n);
        System.out.println(ans);
        int[] a = {389, 19, 512, 215};
        int[] result = countingSort(a, 1);
        System.out.println(Arrays.toString(result));
        result = countingSort(result, 2);
        System.out.println(Arrays.toString(result));
        result = countingSort(result, 3);
        System.out.println(Arrays.toString(result));
        int maxdigit = maximum(a);
        System.out.println(maxdigit);


    }

    public static int[] countingSort(int[] a, int pos) {

        int[] result = new int[a.length];
        int[] frequency = new int[10];

        for (int x : a) {
            int key = getDigit(x, pos);
            frequency[key]++;
        }
        for (int i = 1; i < frequency.length; i++) {
            frequency[i] += frequency[i - 1];
        }
        for (int i = 0; i < result.length; i++) {
            int key = getDigit(a[i], pos);
            frequency[key] -= 1;
            result[frequency[key]] = a[i];
        }

        return result;
    }

    private static int getDigit(int num, int pos) {

        for (int i = 1; i < pos; i++) {

            num = num / 10;

        }
        return num % 10;


    }

    public static int maximum(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        int ans = (int) (Math.log10(max) + 1);//to find the max number and its digit;
        return ans;
    }

}
