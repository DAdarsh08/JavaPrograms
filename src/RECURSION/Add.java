package RECURSION;

public class Add {

    public static void main(String[] args) {
        String s="999";
        String s1="1";
        String ans="";
        int i=s.length()-1;
        int j=s1.length()-1;

        int c=0;




        while(i>=0&&j>=0) {
             int val = c + (s.charAt(i) -'0') + (s1.charAt(j) - '0');
            c=val/10;
            val=val%10;
            ans= val + ans;
            i--;
            j--;


        }
        if(i<0 && j<0 && c!=0) {
            ans= c + ans;
            c= 0;
        }




        while(i>=0)
        {
           int  val=c+(s.charAt(i)-'0');
            c=val/10;
            val=val%10;
            ans=Integer.toString(val) + ans;
            i--;

        }
        while(j>=0)
        {
            int val=c+(s1.charAt(j)-'0');
            c=val/10;
            val=val%10;
            ans=Integer.toString(val) + ans;
            j--;

        }
        if(c!=0)
        {
            ans=Integer.toString(c)+ans;
        }
        System.out.println(ans);

    }
}
