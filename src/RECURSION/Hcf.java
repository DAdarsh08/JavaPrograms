package RECURSION;



public class Hcf {
    public static void main(String[] args) {
        int a=105;
        int b=224;
      int ans=  gcd(a,b);
        System.out.println(ans);
        System.out.println(lcm(a,b));
    }
    public static int gcd(int a, int b)
    {
        if(a==0)
        {
            return b;
        }
        return gcd((b%a),a);//euclid's theorem

    }
    public static int lcm(int a, int b)
    {
        return( (a*b)/gcd(a,b));
    }
}
