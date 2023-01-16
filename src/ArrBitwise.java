// finding the unquiue element by using bitwise;

public class ArrBitwise {
    public static void main(String[] args) {
        int []a={1,2,4,5,1,4,2,5,6,7,6};
      //  findnumber(a);
        System.out.println(findnumber(a));
    }

    private static int  findnumber(int[] a) {
        int unique=0;
        for (int element:a) {
            unique ^= element;
            
        }
        return unique;
        
    }
}
