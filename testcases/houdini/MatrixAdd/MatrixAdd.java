public class MatrixAdd {
    
    public static int[][] add(int[][] a, int[][] b) {
        int[][] c = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int a[][] = {{-2, -1}, {0, 1}};
        int b[][] = {{-2, -1}, {0, 1}};
        add(a, b);
    }

}
