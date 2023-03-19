import java.util.ArrayList;
import java.util.Arrays;

public class Assemble {
    public static void main(String[] args) {
        int[] s1 = {7, 9, 3, 4, 8, 4};
        int[] s2 = {8, 5, 6, 4, 5, 7};
        int e1 = 3;
        int e2 = 5;
        int x1 = 3;
        int x2 = 2;

        System.out.println(Arrays.toString(s1));
        System.out.println(Arrays.toString(s2));
        int[] t1 = {2, 3, 1, 3, 4};
        int[] t2 = {2, 1, 2, 2, 1};

        System.out.println(Arrays.toString(t1));
        System.out.println(Arrays.toString(t2));
        ArrayList<Integer> result1 = new ArrayList<>();
        ArrayList<Integer> result2 = new ArrayList<>();
        result1.add(e1);
        result2.add(e2);
        System.out.println("Result 1 " + result1);
        System.out.println("Result 2 " + result2);
        result1.add(result1.get(0) + s1[0]);
        result2.add(result2.get(0) + s2[0]);
        System.out.println("Result 1 " + result1);
        System.out.println("Result 2 " + result2);
        int n = 2;
        int assemble1 = s1[n - 1] + result1.get(n - 1);
        int assemble2 = s1[n - 1] + result2.get(n - 1) + t2[n - 2];
        int newresult1 = min(assemble1, assemble2);

        assemble1 = s2[n - 1] + result2.get(n - 1);
        assemble2 = s2[n - 1] + result1.get(n - 1) + t1[n - 2];
        int newresult2 = min(assemble1, assemble2);
        result1.add(newresult1);
        result2.add(newresult2);

        System.out.println("Result 1 " + result1);
        System.out.println("Result 2 " + result2);
        n += 1;
        assemble1 = s1[n - 1] + result1.get(n - 1);
        assemble2 = s1[n - 1] + result2.get(n - 1) + t2[n - 2];
        newresult1 = min(assemble1, assemble2);

        assemble1 = s2[n - 1] + result2.get(n - 1);
        assemble2 = s2[n - 1] + result1.get(n - 1) + t1[n - 2];
        newresult2 = min(assemble1, assemble2);
        result1.add(newresult1);
        result2.add(newresult2);

        System.out.println("Result 1 " + result1);
        System.out.println("Result 2 " + result2);


    }

    public static int min(int n1, int n2) {
        if (n1 <= n2) {
            return n1;
        }
        return n2;
    }
}
