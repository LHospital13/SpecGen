public class TransposeMatrix {

    public static int[][] transposeMat(int[][] matrix)
    {
        int m, n, p, q;
        m = matrix.length;
        n = matrix[0].length;
        int[][] transpose = new int[n][m];

        for (int c = 0; c < n; c++) {
            __Loop_Invariant_Dummy1(matrix, m, n, transpose, c);
            for (int d = 0; d < m; d++) {
                __Loop_Invariant_Dummy2(matrix, m, n, transpose, c, d);
                transpose[c][d] = matrix[d][c];
            }

        }
        return transpose;
    }

    public static void __Loop_Invariant_Dummy1(int[][] matrix, int m, int n, int[][] transpose, int c) {}
    
    public static void __Loop_Invariant_Dummy2(int[][] matrix, int m, int n, int[][] transpose, int c, int d) {}

    public static void main(String[] args) {
        int[][] matrix = new int[][] {{}};
        transposeMat(matrix);
        matrix = new int[][] {{0, 0}, {0, 0}};
        transposeMat(matrix);
        matrix = new int[][] {{0, 0}, {0, 0}, {0, 0}, {0, 0}};
        transposeMat(matrix);
        matrix = new int[][] {{0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}};
        transposeMat(matrix);
        matrix = new int[][] {{1}, {2, 3}};
        transposeMat(matrix);
        matrix = new int[][] {{114, 514}, {1919, 810}};
        transposeMat(matrix);
        matrix = new int[][] {{1, 0, 1}, {0, 1, 0}, {2, 3, 3}};
        transposeMat(matrix);
        matrix = new int[][] {{1, 0, 1, 0}, {19, 19, 8, 10}};
        transposeMat(matrix);
        matrix = new int[][] {{1, 0, 1, 0}, {19, 19, 8, 10}, {11, 4, 51, 4}, {0, 0, 0, 0}, {1, 2, 3, 4}};
        transposeMat(matrix);
    }
}


