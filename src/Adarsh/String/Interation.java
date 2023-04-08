package Adarsh.String;

import java.util.ArrayList;
import java.util.List;

public class Interation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        List<List<Integer>> ans = subsetDuplicate2(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }


        public static List<List<Integer>> subsetDuplicate( int[] arr){
            List<List<Integer>> outer = new ArrayList<>();
            outer.add(new ArrayList<>());
            for (int num : arr) {
                int n = outer.size();
                for (int i = 0; i < n; i++) {
                    List<Integer> internal = new ArrayList<>(outer.get(i));
                    internal.add(num);
                    outer.add(internal);
                }

            }

            return outer;
        }
    public static List<List<Integer>> subsetDuplicate2( int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int s=0;
        int e=0;
        for (int i=0;i<arr.length;i++) {
            s=0;
            if(i>0&&arr[i]==arr[i-1])
            {
                s=e+1;

            }
            e= outer.size()-1;

            int n = outer.size();
            for (int j = s; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }

        }

        return outer;
    }


    }