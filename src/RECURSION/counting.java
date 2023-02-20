package RECURSION;

import java.util.Arrays;

public class counting {
    public static void main(String[] args) {
        int[] arr = {7, 4, 9, 6, 5, 9};
        int[] frequency = new int[10];
        for (int x : arr) { // This about counting sort space complexity 2n and time complexity n;
            frequency[x]++;

        }
        System.out.println(Arrays.toString(frequency));
        for (int i = 1; i < frequency.length; i++) {
            frequency[i] += frequency[i - 1];

        }
        System.out.println(Arrays.toString(frequency));
        int[] result = new int[arr.length];

        for (int i = 0; i < result.length; i++) {
            frequency[arr[i]] -= 1;
            result[frequency[arr[i]]] = arr[i];


        }
        System.out.println(Arrays.toString(result));


    }
}
