public class IntSquare {

    public static int squareOf(int x) {
        if(x < 0)
            x = -x;
        int res = 0;
        for(int i = 0; i < x; i++) {
            __Loop_Invariant_Dummy1(x, res, i);
            for(int j = 0; j < x; j++) {
                __Loop_Invariant_Dummy2(x, res, i, j);
                res = res + 1;
            }
        }
        return res;
    }

    public static void __Loop_Invariant_Dummy1(int x, int res, int i) {}
    public static void __Loop_Invariant_Dummy2(int x, int res, int i, int j) {}
    public static void main(String[] args) {
        squareOf(-1);
        squareOf(-3);
        squareOf(0);
        squareOf(1);
        squareOf(2);
        squareOf(3);
    }
}