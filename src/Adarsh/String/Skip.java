package Adarsh.String;

public class Skip {
    public static void main(String[] args) {
        String s="bpharma";
        String p="";
        skipch(p,s);
        String k="bcappleyou";
        System.out.println(skipApple(k));
    }

    private static String skipApple(String k) {
        if(k.isEmpty())
        {
            return "";
        }

        if(k.startsWith("apple"))
        {
            return skipApple(k.substring(5));
        }
        else {
            return k.charAt(0)+skipApple(k.substring(1));


        }
    }



    private static String skipchr(String s) {
        if(s.isEmpty())
        {
            return "";
        }
        char ch=s.charAt(0);
        if(ch=='a')
        {
            return skipchr(s.substring(1));
        }
        else{
            return ch+skipchr(s.substring(1));
        }

    }

    public static void skipch(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char c=up.charAt(0);
        if(c=='a')
        {

            skipch(p,up.substring(1));
        }
        else{
            skipch(p+c,up.substring(1));
        }
    }

}
