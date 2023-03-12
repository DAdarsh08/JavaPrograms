package RECURSION;

// Tower of Hanoi
public class Tower {
    public static void main(String[] args) {
        int n = 3;
        int src = 1;
        int mid = 2;
        int dest = 3;
        movedisc(n, src, mid, dest);
    }

    private static void movedisc(int n, int src, int mid, int dest) {
        if (n == 1) {
            System.out.printf("from %d to %d\n", src, dest);
            return;
        }
        movedisc(n - 1, src, dest, mid);
        System.out.printf("from %d to %d\n", src, dest);
        movedisc(n - 1, mid, src, dest);
    }
}
