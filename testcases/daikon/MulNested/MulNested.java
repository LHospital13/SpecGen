public class MulNested {
    public static int mulNested(int x, int y) {
        int res = 0, m = x, n = y, sign = 1;
        if(x < 0){
            m = -x;
            sign = -sign;
        }
        if(y < 0){
            n = -y;
            sign = -sign;
        }
        for(int i = 0; i < m; i++) {
            __Loop_Invariant_Dummy1(x, y, res, m, n, sign, i);
            for(int j = 0; j < n; j++) {
                __Loop_Invariant_Dummy2(x, y, res, m, n, sign, i, j);
                res = res + 1;
            }
        }
        return sign * res;
    }
    
    public static void __Loop_Invariant_Dummy1(int a, int b, int res, int m, int n, int sign, int i) {}

    public static void __Loop_Invariant_Dummy2(int a, int b, int res, int m, int n, int sign, int i, int j) {}

    public static void main(String[] args) {
        mulNested(-4, 0);
        mulNested(0, -4);
        mulNested(4, 0);
        mulNested(0, 4);
        mulNested(-4, -4);
        mulNested(4, 4);
        mulNested(0, 0);
        mulNested(-4, 4);
        mulNested(4, -4);
        mulNested(1, -1);
        mulNested(-1, 1);
        mulNested(1, 1);
        mulNested(2, 1);
        mulNested(1, 2);
        mulNested(-2, -1);
        mulNested(-1, -2);
        mulNested(-2, 1);
        mulNested(-1, 2);
        mulNested(3, -5);
        mulNested(-3, 5);
        mulNested(3, 5);
        mulNested(114, 514);
        mulNested(-114, 514);
        mulNested(514, 114);
        mulNested(-114, -514);
    }
}
