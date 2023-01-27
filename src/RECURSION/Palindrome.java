package RECURSION;

public class Palindrome {
    public static void main(String[] args) {
        int n=1234;
        int sum=0;
        palin(n,sum);


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
