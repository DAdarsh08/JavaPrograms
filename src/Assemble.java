import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Math.min;

public class Assemble {

    public static void main(String[] args) {
        int[] s1 = {7, 9, 3, 4, 8, 4};
        int[] s2 = {8, 5, 6, 4, 5, 7};
        int e1 = 3;
        int e2 = 5;
        int x1 = 3;
        int x2 = 2;
        ArrayList<Integer> road1 = new ArrayList<>();
        ArrayList<Integer> road2 = new ArrayList<>();



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
        while (n <=s1.length) {
            int assemble1 = s1[n - 1] + result1.get(n - 1);
            int assemble2 = s1[n - 1] + result2.get(n - 1) + t2[n - 2];
            int newresult1 = min(assemble1, assemble2);
            if(assemble1<assemble2)
                road1.add(1);
            else
                road1.add(2);
            assemble1 = s2[n - 1] + result2.get(n - 1);
            assemble2 = s2[n - 1] + result1.get(n - 1) + t1[n - 2];
            int newresult2 = min(assemble1, assemble2);
            result1.add(newresult1);
            result2.add(newresult2);
            if(assemble1<assemble2)
                road2.add(1);
            else
                road2.add(2);

            n++;
        }
        result1.add(result1.get(result1.size()-1)+x1);
        result2.add(result2.get(result2.size()-1)+x2);
        System.out.println("Result 1 " + result1);
        System.out.println("Result 2 " + result2);
       /* n += 1;
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


    }*/

   /* public static int min(int n1, int n2) {
        if (n1 <= n2) {
            return n1;
        }
        return n2;
    }*/
        int m=s1.length-1;

        int i=result1.size()-2;
        int j=t2.length-1;
       // System.out.println(result1.get(i));

        while(i>=2) {
            int res=result1.get(i);
            int total1 = result1.get(i - 1) + s1[m];
            int total2 = result2.get(i - 1) + t2[j]+s1[m];
           System.out.println(total1);
            System.out.println(total2);
            i--;
            m--;
            j--;
        }

//for road found.
        System.out.println(road1);
        System.out.println(road2);


    }


}