import java.util.ArrayList;

public class Prob2 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, 6};
        int min = arr[0];
        int max = arr[0];
        int i = 0;
        System.out.println(fun1(arr, min, max, i));

    }

    public static ArrayList<Integer> fun1(int[] arr, int min, int max, int c) {
        if (c == arr.length) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(min);
            list.add(max);
            return list;
        }

        if (arr[c] >= max) {
            max = arr[c];

        } else if (arr[c] < min) {
            min = arr[c];
        }
        return fun1(arr, min, max, c + 1);


    }

}
