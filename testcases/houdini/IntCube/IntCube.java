public class IntCube {

    public static int cubeOf(int x) {
        boolean neg = false;
        if(x < 0) {
            neg = true;
            x = -x;
        }
        int res = 0;
        for(int i = 0; i < x; i++) {
            __Loop_Invariant_Dummy1(x, neg, res, i);
            for(int j = 0; j < x; j++) {
                __Loop_Invariant_Dummy2(x, neg, res, i, j);
                for(int k = 0; k < x; k++) {
                    res = res + 1;
                    __Loop_Invariant_Dummy3(x, neg, res, i, j, k);
                }
            }
        }
        return (neg ? -res : res);
    }

    public static void __Loop_Invariant_Dummy1(int x, boolean neg, int res, int i) {}
    public static void __Loop_Invariant_Dummy2(int x, boolean neg, int res, int i, int j) {}
    public static void __Loop_Invariant_Dummy3(int x, boolean neg, int res, int i, int j, int k) {}
    public static void main(String[] args) {
        cubeOf(-1);
        cubeOf(-3);
        cubeOf(0);
        cubeOf(1);
        cubeOf(2);
        cubeOf(3);
    }
}