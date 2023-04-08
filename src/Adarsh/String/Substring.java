package Adarsh.String;

import java.util.ArrayList;

public class Substring {
    public static void main(String[] args) {

        sub("","abc");
        System.out.println(sub1("","abc"));
    }
    public static void sub(String p,String s)
    {
        if(s.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=s.charAt(0);
        sub(p+ch,s.substring(1));
        sub(p,s.substring(1));
    }
    public static ArrayList<String>sub1(String p, String s)
    {
        if(s.isEmpty())
        {
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;


        }
        char ch=s.charAt(0);
        ArrayList<String>left=sub1(p+ch,s.substring(1));
        ArrayList<String>right=sub1(p,s.substring(1));
        left.addAll(right);
        return left;

    }
}
