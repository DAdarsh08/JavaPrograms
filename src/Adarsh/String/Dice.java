package Adarsh.String;

import java.util.ArrayList;
import java.util.Collection;

public class Dice {
    public static void main(String[] args) {

        diceface("",4);
        System.out.println(  diceface2("",3));
    }

    private static Collection<? extends String> diceface(String p, int target) {
        if(target==0)
        {
            System.out.println(p);
            return null;
        }
        for (int i=1;i<=6&&i<=target;i++)
        {
            diceface(p+i,target-i);
        }
        return null;
    }
    private static ArrayList<String> diceface2(String p, int target) {
        if(target==0)
        {
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>list=new ArrayList<>();
        for (int i=1;i<=6&&i<=target;i++)
        {
           list.addAll( diceface2(p+i,target-i));
        }
        return list;

    }
}
