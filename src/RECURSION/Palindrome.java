package RECURSION;

public class Palindrome {
    public static void main(String[] args) {
        int n=121;
        int sum=0;
       // palin(n,sum);
        //palindrome(1234);
        System.out.println(palindrome(n));


    }

    private static int  palindrome(int n) {
        int  digit=(int)(Math.log10(n)+1);
        return helper(n,digit);

    }

    private static int helper(int n, int digit) {
        if(n%10==n)
        {
            return n;
        }
       return  (n%10)*(int)Math.pow(10,digit-1)+helper(n/10,digit-1);
    }

    public static void palin(int n,  int sum) {

        if(n==0)
        {
            System.out.println(sum);
            return;
        }
        sum=sum*10+(n%10);

        palin(n/10,sum);

    }
}
