import java.util.Scanner;

//appling bitwise operator for verification of even or odd;
public class Bit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();

        System.out.println(ischeck(n));
    }

    private static boolean ischeck(int n) {
        if((n & 1)==1)// we use ( and )operator for the verificaton of even or odd
        {
            return false;
        }
        return true;
      /*  else
        {
            return true;
        }*/


    }
}
