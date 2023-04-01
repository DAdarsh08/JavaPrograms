package RECURSION;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {


        int[] arr = {5, 4, 3, 2, 1};
        int[] ans = merge(arr);
        mergeInplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(arr));
    }


    private static int[] merge(int[] arr) {//creating different objects .
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = merge(Arrays.copyOfRange(arr, 0, mid));
        int[] right = merge(Arrays.copyOfRange(arr, mid, arr.length));
        return sort(left, right);
    }

    public static int[] sort(int[] first, int[] second) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] m = new int[first.length + second.length];
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                m[k] = first[i];
                i++;
            } else {
                m[k] = second[j];
                j++;
            }
            k++;

        }
        while (i < first.length) {
            m[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            m[k] = second[j];
            j++;
            k++;
        }
        return m;


    }
    //without creating any extra object;updating the original array;

    private static void mergeInplace(int[] arr, int s, int e) {
        if ((e - s) == 1) {
            return;
        }
        int mid =( e + s) / 2;
        mergeInplace(arr, s, mid);
        mergeInplace(arr, mid, e);
        sortInplace(arr, s, mid, e);


    }

    public static void sortInplace(int[] arr, int s, int m, int e) {
        int i = s;
        int j = m;
        int k = 0;
        int[] mix = new int[e - s];
        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;

        }
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];

        }


    }
}
