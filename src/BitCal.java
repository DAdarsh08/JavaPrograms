import java.util.Arrays;

public class BitCal {
    public static void main(String[] args) {
        int[] a = {0, 0, 0};
        int c = a.length;

        int l = (int) Math.pow(2, c);

        System.out.println(Arrays.toString(a));
        outer:
        for (int i = 0; i < l - 1; i++) {
            for (int j = 2; j >= 0; j--) {
                if (a[j] != 0) {
                    a[j] = 0;
                    continue;
                }
                a[j] = 1;
                System.out.println(Arrays.toString(a));
                continue outer;


            }

        }


    }
}
