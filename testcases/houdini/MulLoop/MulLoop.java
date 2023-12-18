public class MulLoop {

	public static int mulLoop(int a, int b) {
        int res = 0;
        int i = 0;
        if (b >= 0) {
            for(i = 0; i < b; i++) {
                __Loop_Invariant_Dummy1(a, b, res, i);
                res = res + a;
            }
            __Loop_Invariant_Dummy1(a, b, res, i);
        } else {
            for(i = 0; i < -b; i++) {
                __Loop_Invariant_Dummy2(a, b, res, i);
                res = res - a;
            }
            __Loop_Invariant_Dummy2(a, b, res, i);
        }
        return res;
    }

    public static void __Loop_Invariant_Dummy1(int a, int b, int res, int i) {}

    public static void __Loop_Invariant_Dummy2(int a, int b, int res, int i) {}

    public static void main(String[] args) {
        mulLoop(-4, 0);
        mulLoop(0, -4);
        mulLoop(4, 0);
        mulLoop(0, 4);
        mulLoop(-4, -4);
        mulLoop(4, 4);
        mulLoop(0, 0);
        mulLoop(-4, 4);
        mulLoop(4, -4);
        mulLoop(1, -1);
        mulLoop(-1, 1);
        mulLoop(1, 1);
        mulLoop(2, 1);
        mulLoop(1, 2);
    }

}
