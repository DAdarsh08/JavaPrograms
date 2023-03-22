public class Mat {
    //Dynamic programming;
    static int infinity = 100000;//Integer.MAX_VALUE;

    static void printMatrix(int[][] m) {
        int n = m.length;
        for (int i = 2; i <= n - 1; i++) {
            for (int j = 2; j <= n - 1; j++)
                System.out.printf("%8s", m[i][j]);
            System.out.println();
        }

    }

    static int[][] matrixchanin(int[] p) {
        int n = p.length - 1;
        int m[][] = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            m[i][i] = 0;

        }

        for (int l = 2; l <= n; l++) {
            for (int i = 1; i <= n - l + 1; i++) {
                int j = i + l - 1;

                m[i][j] = infinity;
                for (int k = i; k <= j - 1; k++) {
                    int q = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
                    if (q < m[i][j])
                        m[i][j] = q;
                }
            }//i loop


        }//L loop

        return m;
    }

    public static void main(String[] args) {
//        int[] arr = {0, 30, 35, 15, 5, 10, 20, 25};
        int[] arr = {0, 3, 5, 6};
        int[][] m = matrixchanin(arr);
        printMatrix(m);


    }
}
